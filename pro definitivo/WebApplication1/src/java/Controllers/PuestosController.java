package Controllers;

import BO.Empresas;
import BO.Puestos;
import Controllers.util.JsfUtil;
import Controllers.util.PaginationHelper;
import DAO.PuestosFacade;

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

@ManagedBean(name = "puestosController")
@SessionScoped
public class PuestosController implements Serializable {

    private Puestos current;
    private DataModel items = null;
    @EJB
    private DAO.PuestosFacade ejbFacade;
    private PaginationHelper pagination;
    private int selectedItemIndex;
    int idpersona;
    
    public void Cancel()
    {
         try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/perfilEmp.jsp");
        } catch (IOException ex) {
            Logger.getLogger(ProfesionalesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public int getIdpersona() 
     {
        HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
        return Integer.parseInt(sesion.getAttribute("idpersona").toString());

    }
    public PuestosController() {
    }

    public Puestos getSelected() {
        if (current == null) {
            current = new Puestos();
            selectedItemIndex = -1;
        }
        return current;
    }

    private PuestosFacade getFacade() {
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
        current = (Puestos) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "View";
    }

    public String prepareCreate() {
        current = new Puestos();
        selectedItemIndex = -1;
        return "Create";
    }
    public Long getCuit()
    {
        EmpresasController a=new EmpresasController();
        Empresas emp=a.buscarEmp(getIdpersona());
     return emp.getCuit();
    }
   public void redireccionar()
   {
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/PerfilEmp.jsp");
        } catch (IOException ex) {
            Logger.getLogger(PuestosController.class.getName()).log(Level.SEVERE, null, ex);
        }

   }
    public String create() 
    {
        try {
            current.setIdEmpresa(getCuit());
            ejbFacade.create(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PuestosCreated"));
            return prepareCreate();            
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
        finally    {redireccionar();}
        
    }

    public String prepareEdit() {
        current = (Puestos) getItems().getRowData();
        selectedItemIndex = pagination.getPageFirstItem() + getItems().getRowIndex();
        return "Edit";
    }

    public String update() {
        try {
            getFacade().edit(current);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PuestosUpdated"));
            return "View";
        } catch (Exception e) {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }

    public String destroy() {
        current = (Puestos) getItems().getRowData();
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
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PuestosDeleted"));
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

    @FacesConverter(forClass = Puestos.class)
    public static class PuestosControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            PuestosController controller = (PuestosController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "puestosController");
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
            if (object instanceof Puestos) {
                Puestos o = (Puestos) object;
                return getStringKey(o.getIdPuesto());
            } else {
                throw new IllegalArgumentException("object " + object + " is of type " + object.getClass().getName() + "; expected type: " + PuestosController.class.getName());
            }
        }
        
    }
}
