
package Controllers;


import BO.Empresas;
import BO.Personas;
import BO.Profesionales;
import BO.Usuarios;
import Controllers.util.JsfUtil;
import DAO.Conexion;
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.HttpSession;



@ManagedBean(name = "regController")
@SessionScoped
public class RegController implements Serializable
{
   
    Conexion conect=new Conexion();
    private Empresas emp;
    private Personas per;
    private Usuarios usr;
    private Profesionales pro;
    @PersistenceContext
    private EntityManager em;
     
    
    @EJB
    private DAO.PersonasFacade PerFacade;
    @EJB
    private DAO.EmpresasFacade EmpFacade;
    @EJB
    private DAO.UsuariosFacade UsrFacade;
    @EJB
    private DAO.ProfesionalesFacade ProFacade;
    
     private int selectedItemIndex;
     
     public void validarDatos() 
     {
         FacesContext context=FacesContext.getCurrentInstance();
        if(per.getNombre()==null)
        {
           FacesMessage message=new FacesMessage();
           message.setDetail("Nombre esta vacio");
           context.addMessage("nombre", message);
           
            
        }		
     }

     public ArrayList listasexo()
     {
         ArrayList lista=new ArrayList();
         lista.add("M");
         lista.add("F");
         return lista;
     }
    public Profesionales getPro() 
    {
         if (pro == null) {
            pro = new Profesionales();
            selectedItemIndex = -1;
        }
        return pro;
    }
    public Personas getPersona() 
    {
        if (per == null) {
            per = new Personas();
            selectedItemIndex = -1;
        }
        return per;
    }
    public Empresas getEmpresa() 
    {
        if (emp == null) {
            emp = new Empresas();
            selectedItemIndex = -1;
        }
        return emp;
    }
    public Usuarios getUsuario()
    {
        if(usr==null){
            usr=new Usuarios();
            selectedItemIndex=-1;
        }
        return usr;
    }
      private String prepareCreate2()
    {
        usr=new Usuarios();
        return "Create";
    }
    private String prepareCreate()
    {
        per=new Personas();
        emp=new Empresas();
        pro=new Profesionales();
        selectedItemIndex = -1;
        return "Create";
    }
    
     private String PersistirUsr()
    {
         try
        {
            usr.setIdPersona(per.getIdPersona());
            UsrFacade.create(usr);
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PersonasCreated"));
            return prepareCreate2();
   
        }catch(Exception e)
        {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
    }
    
     public int buscarUsuario(String correo)
    { 
        return conect.buscarUsuario(correo);
    }
   
     public String create()
    {
        String cor=usr.getCorreo();
        Query q= em.createNamedQuery("Usuarios.findByCorreo").setParameter("correo",cor);
        if(q.getResultList().size() == 0)
        try 
        {
            if (per.getNombre()!=null)
                PerFacade.create(per);
            if (!"".equals(pro.getTitulo()))
            {
                pro.setIdPersona(per.getIdPersona());
                ProFacade.create(pro);
            }
            String a=PersistirUsr();
            if (a==null)
                
            JsfUtil.addSuccessMessage(ResourceBundle.getBundle("/Bundle").getString("PersonasCreated"));
            return prepareCreate();
        } catch (Exception e) 
        {
            JsfUtil.addErrorMessage(e, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            return null;
        }
      else
      {
          if (emp.getCuit()!=0)
         {
            emp.setIdPersona(buscarUsuario(cor));
            EmpFacade.create(emp);
         }
            return "correo existente";
      }
    }
    
        
    public Usuarios validUser(String cor,String contra) 
    { 
        return conect.validUser(cor, contra);
    }
   
        
    
    public void redireccionar(String cor,String contra)
    {
       Usuarios user=validUser(cor, contra);
       if (user!=null)
       {
            HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true);
            sesion.setAttribute("correo", user.getCorreo());
            sesion.setAttribute("contrasena", user.getContrasena());
            sesion.setAttribute("idpersona", user.getIdPersona());
            Profesionales pro=conect.BuscarPro(user.getIdPersona());
            if (pro!=null)
            try {
                sesion.setAttribute("tipo", "profesional");
                 FacesContext.getCurrentInstance().getExternalContext().redirect("faces/PagProfesional.jsp");
                } catch (IOException ex) 
            { Logger.getLogger(RegController.class.getName()).log(Level.SEVERE, null, ex); }
         
        
            Empresas emp=conect.BuscarEmp(user.getIdPersona());
            if (emp!=null)
            try {
                sesion.setAttribute("tipo", "empresa");
                 FacesContext.getCurrentInstance().getExternalContext().redirect("faces/PagEmpresa.jsp");
                } catch (IOException ex) 
            { Logger.getLogger(RegController.class.getName()).log(Level.SEVERE, null, ex); }
         }
         
     }

    
   
}
