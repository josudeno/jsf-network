package Controllers;

import BO.Profesionales;
import Controllers.util.JsfUtil;
import Controllers.util.PaginationHelper;
import DAO.Conexion;
import DAO.ProfesionalesFacade;

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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

@ManagedBean(name = "profesionalesController")
@SessionScoped
public class ProfesionalesController implements Serializable {

    private Profesionales current;
    private DataModel items = null;
    @EJB
    private DAO.ProfesionalesFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;
    Conexion con=new Conexion();
  
    int idpersona;
    Profesionales prof=new Profesionales();

    public Profesionales getProf() {
        return prof=buscarPro(getIdpersona());
    }
    public int getIdpersona() {
        HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return Integer.parseInt(sesion.getAttribute("idpersona").toString());
    }

    
    public ProfesionalesController() {
    }

    public Profesionales getSelected() {
        if (current == null) {
            current = new Profesionales();
            selectedItemIndex = -1;
        }
        return current;
    }

   
    
    private Profesionales buscarPro(int a)
    {
        return con.BuscarPro(a);
    }

    private ProfesionalesFacade getFacade() 
    {
        return ejbFacade;
    }
    
    public void Editar()
    {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/EditarProf.jsp");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);}
    } 
           
    public void BuscarTrabajo()
    {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/BuscarTrabajo.jsp");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        current = (Profesionales) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Profesionales();
        selectedItemIndex = -1;
        return "Create";
    }

    public String create() {
        try {
            getFacade().create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProfesionalesCreated"));
            return prepareCreate();
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String prepareEdit() {
        current = (Profesionales) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }
    public void Cancel()
    {
         try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/PagProfesional.jsp");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void SaveEdit()
    {
         getFacade().edit(prof);
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/PagProfesional.jsp");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProfesionalesUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Profesionales) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("ProfesionalesDeleted"));
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

    @FacesConverter(forClass = Profesionales.class)
    public static class ProfesionalesControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ProfesionalesController controller = (ProfesionalesController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "profesionalesController");
            return controller.ejbFacade.find(getKey(value));
        }

        java.lang.Integer getKey(String value) {
            java.lang.Integer key;
            key = Integer.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Integer value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Profesionales) {
                Profesionales o = (Profesionales) object;
                return getStringKey(o.getIdPersona());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + ProfesionalesController.class.getName());
            }
        }
    }
}
