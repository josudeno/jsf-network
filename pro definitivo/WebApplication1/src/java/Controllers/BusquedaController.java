/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import BO.Trabajos;
import Controllers.util.JsfUtil;
import Controllers.util.PaginationHelper;
import DAO.Conexion;
import DAO.TrabajosFacade;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josue
 */
@ManagedBean(name = "busquedaController")
@SessionScoped
public class BusquedaController implements Serializable
{
    String area;
    Conexion con=new Conexion();
    private String idempresa;
    private ResultSet rs;
    private ArrayList lista;
    Trabajos trabajo;
    private DataModel items = null;
    private TrabajosFacade traFacade;
     int idpersona;
   private PaginationHelper pagination;

     public SelectItem[] AreaDisponible()
     {
         return JsfUtil.getSelectItems(BuscarAreas(), true);
     }
     public String getIdpersona()
     {
        HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return sesion.getAttribute("idpersona").toString();
    }

      public ArrayList BuscarAreas()
      {
         return con.BuscarAreas();
      }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ArrayList getLista() {
        return lista;
    }
   
    
   public void Postularse(long id)
    { 
        try {
            HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
            sesion.setAttribute("idempresa", id);
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/PagEmpresa.jsp");
        } catch (IOException ex) {
            Logger.getLogger(BusquedaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
     
    public void Volver()
    {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/PagProfesional.jsp");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ArrayList BuscarPuesto()
    {
        lista=con.BuscarPuesto(area);
    return lista;
    }
    
     
    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }
    
    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return lista.size();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel();
                }
            };
        }
        return pagination;
    }
}
