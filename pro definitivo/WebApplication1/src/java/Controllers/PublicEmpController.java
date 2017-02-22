/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import BO.Empresas;
import BO.Puestos;
import DAO.Conexion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
@ManagedBean(name = "publicEmpController")
@SessionScoped
public class PublicEmpController implements Serializable
{
    private DataModel items = null;
    @PersistenceContext
    private EntityManager em;
    private Empresas emp;
    long idempresa;
    EmpresasController empc;
    Conexion conect=new Conexion();
    private ArrayList<Puestos> lista;
    
    public ArrayList<Puestos> getLista() {
        return empc.listarPuestos(getIdempresa());
    }

    public void setLista(ArrayList<Puestos> lista) {
        this.lista = lista;
    }
    

    public long getIdempresa() {
         HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return Long.parseLong(sesion.getAttribute("idempresa").toString());
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public Empresas getEmp() {
     return BuscarPorCuit(getIdempresa());
    }

    public void setEmp(Empresas emp) {
        this.emp = emp;
    }
    
    public Empresas BuscarPorCuit(long a)
    {
     return  conect.BuscarPorCuit(a); 
    }
   
     
}
