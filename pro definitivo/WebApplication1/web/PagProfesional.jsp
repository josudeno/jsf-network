<%@page import="javax.faces.context.FacesContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.UsuariosController" %>
<%@page import="Controllers.ProfesionalesController"%>
<%@page import="Controllers.PersonasController"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<f:view>
<html>
    <div class="div1"> 
  <head>
     <title><h:outputText value="#{personasController.persona.nombre}"/></title>
       <LINK href="estiloProfesional.css" rel="stylesheet" type="text/css"/>
  </head>
    <body>
        <h1>Bienvenido <h:outputText value="#{personasController.persona.nombre}"/></h1>
        <h8>Bienvenido <h:outputText value="#{usuariosController.saludo}"/></h8>
        <ui:define name="content">
          
            <h:form id="pro">  
              
    <br>
        <table class="foto">
            <tr>
                <td> <h:graphicImage  width="200px" height="200px" url="#{profesionalesController.prof.url}"/> 
                    </td>
            </tr>
        </table>
    <table class="tabpro">
      <tr>
        <th><label>Nombre:</label> </th>                       
        <th><h:outputText value="#{personasController.persona.nombre}" /> </th>
      </tr>
       <tr>
        <th><label>Apellido:</label> </th>                       
        <th><h:outputText value="#{personasController.persona.apellido}"/> </th>
      </tr>
       <tr>
        <th><label>Sexo:</label> </th>                       
        <th><h:outputText value="#{personasController.persona.sexo}"/> </th>
      </tr>
       <tr>
        <th><label>Edad:</label> </th>                       
        <th><h:outputText value="#{personasController.edad()}"/> </th>
      </tr>
      <tr>
        <th><label>Titulo:</label> </th>                       
        <th><h:outputText value="#{profesionalesController.prof.titulo}" /> </th>
      </tr>
    </table>
        <table class="tabtopright">
          <tr> 
              <th> IDIOMAS: </th><tr></tr><tr></tr>
          </tr>
            <tr>
                <th><h:outputText value="#{profesionalesController.prof.idiomas}"/></th>
            </tr>
        </table>
        <table class="tabtopright2">
            <tr>
                <th>CURSOS: </th><tr></tr><tr></tr>
	    </tr>	
             <tr>
                 <th><h:outputText value="#{profesionalesController.prof.cursos}"/>  </tr>
        </table>
<%
    HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    String s =(String) sesion.getAttribute("tipo");
    if(s == "profesional")
        {
%>
        <table class="tablaeditar">
            <tr><th>
                    <h:commandButton value="" styleClass="botEditar" action="#{profesionalesController.Editar()}"/>                 
            </th></tr>
        </table>
        <table class="tablabus">
            <tr><th>
                  <h:commandButton value="" styleClass="botBuscar" action="#{profesionalesController.BuscarTrabajo()}"/>                 
            </th></tr>
        </table>
<%     }   %>
        <table class="tablavolver">
         <tr><th>
                 <h:commandButton value="" styleClass="botinicio" action="#{profesionalesController.Salir()}"/> 
         </th></tr>
       </table>
    <table class="tabfondo">
  <tr> 
    <td> ©2011 Todos los derechos reservados</td>
  </tr>
</table>
  </h:form>
    <h:form id="medio">
      
    <table class="tabmedio">
            <tr>
                <th> EXPERIENCIA PROFESIONAL:</th>
            </tr>	<tr></tr><tr></tr>
            <tr>
                <th><h:outputText value="#{profesionalesController.prof.antecedentes}"/>  </tr>
	    </tr>
                
        </table>
            
        </div>
 </h:form>
           
</body>
</html>
</f:view>