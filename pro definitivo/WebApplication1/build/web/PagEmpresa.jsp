<%@page import="javax.faces.context.FacesContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.EmpresasController" %>
<%@page import="Controllers.PuestosController" %>
<%@page import="Controllers.UsuariosController" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<f:view>
<html>
    <div class="div1"> 
    <head>
        <title><h:outputText value="#{empresasController.emp.razon}"/></title>
        <LINK href="estiloEmp.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h8>Bienvenido <h:outputText value="#{usuariosController.saludo}"/></h8>
            <h:form>
  <table class="top">
  <tr> 
    <td> </td>
  </tr>
  <tr> 
      <table class="top2">
        <tr> 
            <td>pro</td>
          
        </tr>
      </table>
   
  </tr>
</table>
<br>
    <table class="imagen">
        <tr><td><h:graphicImage width="150px" height="100px" url="#{empresasController.emp.url}"/></td>
           

 
        </tr>
    </table>      
            <table class="tabinfo">
    <td>      <p><h:outputText value="#{empresasController.emp.razon}"/></p></td>
  <tr> 
      <td>      <p><h:outputText value="#{empresasController.emp.descripcion}"/></p></td>
  </tr>
  
</table>
     <table class="tablainicio">
         <tr><th>
                 <h:commandButton styleClass="botinicio" action="#{empresasController.Salir()}"/> 
         </th></tr>
     </table>
</h:form>
<h:form styleClass="jsfcrud_list_form">
    <table class="puestos">
        <tr> <th><p>   <f:facet name="header">Puestos disponibles</f:facet></p></th> </tr>
        <tr>
   
                 </tr><td>
                 <h:dataTable value="#{empresasController.lista}" var="lista" styleClass="tablapuestos" border="0" cellpadding="0" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Puesto"/>
                            </f:facet>
                            <h:outputText value="#{lista.puesto}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Area"/>
                            </f:facet>
                            <h:outputText value="#{lista.area}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Salario"/>
                            </f:facet>
                            <h:outputText value="#{lista.salario}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Fecha de publicacion"/>
                            </f:facet>
                            <h:outputText value="#{lista.fecha}">
                                <f:convertDateTime pattern="dd/MM/yyyy" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Razon social"/>
                            </f:facet>
                            <h:outputText value="#{empresasController.emp.razon}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Descripcion"/>
                            </f:facet>
                           <h:outputText value="#{lista.descripcion}"/>
                        </h:column>
                        <h:column>
                             <f:facet name="header">
                                 <h:outputText value="Disponibles"/>
                             </f:facet>
                             <h:outputText value="#{lista.disponible}"/>
                         </h:column>
                  
<%
    HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    String s =(String) sesion.getAttribute("tipo");
    if(s == "profesional")
        {
        
    %>
                       <h:column>
                            <f:facet name="header">
                                 <h:outputText value="Postularse"/>
                            </f:facet>
                           <h:commandLink action="#{empresasController.Postularse(lista.getIdPuesto(),lista.disponible)}" value="Postularse"/>
                        </h:column>

              
<%      } %>
                     </h:dataTable>
 

    
<%
    HttpSession ses=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    String se =(String) ses.getAttribute("tipo");
    if(se == "empresa")
        {
        
    %>
            
<h:commandLink action="#{empresasController.NuevoPuesto()}" value="Crear nuevo puesto"/>

<%      } %>
        
           
        </td>
    </table>
<%
    HttpSession sesio=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    String pro =(String) sesio.getAttribute("tipo");
    if(pro == "profesional")
        {
        
    %>
     <table class="tablavolver">
         <tr><th>
                 <h:commandButton styleClass="botVolver" type="submit" action="#{empresasController.Volver()}"/> 
         </th></tr>
    </table>
<%      } %>
</h:form>
</body>
    </div>
</html>
</f:view>

