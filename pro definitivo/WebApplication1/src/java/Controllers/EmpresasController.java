package Controllers;

import BO.Empresas;
import BO.Puestos;
import BO.Trabajos;
import Controllers.util.JsfUtil;
import Controllers.util.PaginationHelper;
import DAO.Conexion;
import DAO.EmpresasFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

@ManagedBean(name = "empresasController")
@SessionScoped
public class EmpresasController implements Serializable {

    private Empresas current;
    private DataModel items = null;
    @EJB
    private DAO.EmpresasFacade ejbFacade;
    @EJB
    private DAO.TrabajosFacade traFacade;
    @EJB
    private DAO.PuestosFacade pueFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;
    Conexion con=new Conexion();
    int idpersona;
    Empresas emp;
    ArrayList<Puestos> lista;
    long idempresa;
    

      public int getIdpersona() {
          HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);;
        return Integer.parseInt(sesion.getAttribute("idpersona").toString());
    }

    public Empresas getEmp() {
        HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);;
        String s =(String) sesion.getAttribute("tipo");
        Long cuit=(Long) sesion.getAttribute("idempresa");
       if(s.equals("empresa"))
          emp=buscarEmp(getIdpersona());
       if (s.equals("profesional"))
          emp=buscarEmpCuit(cuit);
       return emp;
    }
    
    public ArrayList<Puestos> getLista() {
        return lista=listarPuestos(getEmp().getCuit());
    }

    public void setLista(ArrayList<Puestos> lista) {
        this.lista = lista;
    }
    
    public void Salir()
    {
        HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        sesion.invalidate();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/index.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Volver()
    {
         try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/BuscarTrabajo.jsp");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public Empresas buscarEmpCuit(long cuit)
    {
        return con.BuscarPorCuit(cuit);
    }
    public Empresas buscarEmp(int idpersona)
    {
       return con.BuscarEmp(idpersona);
    }
    public void NuevoPuesto()
    {
         try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/NewPuesto.xhtml");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Puestos> listarPuestos(long idempresa)
    {
        setIdempresa(idempresa);
       return con.listarPuestos(idempresa);
    }
    
    public void Postularse(int idpuesto,int cant)
    { 
        HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);;
        int idpro=Integer.parseInt(sesion.getAttribute("idpersona").toString());
        Trabajos trabajo=new Trabajos(idpuesto, getIdempresa(), idpro);
        try{
            traFacade.create(trabajo);
            con.EditarDisponibilidad(idpuesto, cant);
        }
        catch(Exception e)
        {   }
        
    }

    public long getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(long idempresa) {
        this.idempresa = idempresa;
    }

    
    
    
    public EmpresasController() {
    }

    public Empresas getSelected() {
        if (current == null) {
            current = new Empresas();
            selectedItemIndex = -1;
        }
        return current;
    }

    private EmpresasFacade getFacade() {
        return ejbFacade;
    }

    public PaginationHelper getPagination() {
        if (pagination == null) {
            pagination = new PaginationHelper(10) {

                @Override
                public int getItemsCount() {
                    return getFacade().count();
                }

                @Override
                public DataModel createPageDataModel() {
                    return new ListDataModel(getFacade().findRange(new int[]{getPageFirstItem(), getPageFirstItem() + getPageSize()}));
                }
            };
        }
        return pagination;
    }

    public String prepareList() {
        recreateModel();
        return "List";
    }

    public String prepareView() {
        current = (Empresas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Empresas();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("EmpresasCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Empresas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("EmpresasUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Empresas) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        performDestroy();
        recreateModel();
        return "List";
    }

    public String destroyAndView() {
        performDestroy();
        recreateModel();
        updateCurrentItem();
        if (selectedItemIndex >= 0) {
            return "View";
        } else {
            // all items were removed - go back to list
            recreateModel();
            return "List";
        }
    }

    private void performDestroy() {
        try {
            getFacade().remove(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("EmpresasDeleted"));
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
        }
    }

    private void updateCurrentItem() {
        int count = getFacade().count();
        if (selectedItemIndex >= count) {
            // selected index cannot be bigger than number of items:
            selectedItemIndex = count - 1;
            // go to previous page if last page disappeared:
            if (pagination.getPageFirstItem() >= count) {
                pagination.previousPage();
            }
        }
        if (selectedItemIndex >= 0) {
            current = getFacade().findRange(new int[]{selectedItemIndex, selectedItemIndex + 1}).get(0);
        }
    }

    public DataModel getItems() {
        if (items == null) {
            items = getPagination().createPageDataModel();
        }
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    public String next() {
        getPagination().nextPage();
        recreateModel();
        return "List";
   }

    public String previous() {
        getPagination().previousPage();
        recreateModel();
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), false);
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return JsfUtil.getSelectItems(ejbFacade.findAll(), true);
    }

    @FacesConverter(forClass = Empresas.class)
    public static class EmpresasControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            EmpresasController controller = (EmpresasController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "empresasController");
            return controller.ejbFacade.find(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Empresas) {
                Empresas o = (Empresas) object;
                return getStringKey(o.getCuit());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + EmpresasController.class.getName());
            }
        }
    }
    
}
