<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.UsuariosController" %>
<%@page import="Controllers.RegController" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<f:view>
<html>
   
    <head>
        <title>you are pro</title>
        <LINK href="estilo.css" rel="stylesheet" type="text/css"/>
        
    </head>
    <body>
        <h1>Bienvenido a you are a pro</h1>
        <ui:define name="content">
        <h:form id="index">
            <h5>Sea parte de nuestra comunidad de Profesionales</h5>
            <table class="tab"> 
                <tr> 
                    <th><label>Nombre</label> </th>   
                    <th><h:inputText immediate="true" required="true" requiredMessage="ingrese nombre" value="#{regController.persona.nombre}"/> </th>  
                </tr> 
                <tr>
                    <th><label>Apellido</label></th>
                    <th><h:inputText value="#{regController.persona.apellido}" required="true" requiredMessage="#{bundle.CreatePersonasRequiredMessage_apellido}"/> </th>
                </tr>
                <tr>
                    <th><label>Correo electronico</label></th>
                    <th><h:inputText styleClass="correo" value="#{regController.usuario.correo}" required="true" requiredMessage="#{bundle.CreateUsuariosRequiredMessage_correo}"/> </th>
                    
                </tr>
                
                  <tr>
                    <th><label>Contrasena</label></th>
                    <th><h:inputSecret value="#{regController.usuario.contrasena}" required="true" requiredMessage="#{bundle.CreateUsuariosRequiredMessage_contrasena}" /></th>
                  </tr>
                <tr>
                    <th><label>Sexo</label></th>
                    <th><h:inputText value="#{regController.persona.sexo}">
                        <f:converter converterId="javax.faces.Character"/> </h:inputText></th>
                </tr>
                  <tr>
                    <th><label>Fecha de nacimiento dd/mm/aaaa</label></th>
                    <th><h:inputText value="#{regController.persona.fechanac}">
                        <f:convertDateTime pattern="dd/MM/yyyy"/></h:inputText></th>
                </tr>
                <tr>
                    <th><label>¿Profesional?</label></th>
                    <th><h:selectBooleanCheckbox onclick="profesional()"/></th>
                </tr>
                <div id="div-pro">
                <tr>
                    <th><label>Titulo universitario/terciario</label></th>
                    <th><h:inputText value="#{regController.pro.titulo}"/> </th>
                </tr>
                   </div>       
                <tr>
                    <th> <h:commandButton  styleClass="boton" type="submit" action="#{regController.create}"/></th>
                </tr>
            </table><div  id="div-pro" >
                <table class="tabAntec">
                <tr>
                    <th><label>Cursos</label></th>
                    <th><h:inputTextarea value="#{regController.pro.cursos}"/> </th>
                </tr>
                <tr>
                    <th><label>Idiomas</label></th>
                    <th><h:inputTextarea value="#{regController.pro.idiomas}"/> </th>
                </tr>
                <tr>
                    <th><label>Antecedentes laborales</label></th>
                    <th><h:inputTextarea value="#{regController.pro.antecedentes}"/> </th>
                </tr>
                  
            </table> </div>
                <table class="tab2">
                    <tr><th>
                        <a href="faces/registroEmp.jsp">Cree su perfil de empresa</a> 
                    </th></tr>
                </table>
        </h:form>
            <h:form>
                <table class="tablogin">
                    <tr>
                        <th><label2>Correo electronico</label2></th>
                        <th><label2>Contrasena</label2></th>
                        
                    </tr>   
                    <tr>
                        <th><label2><h:inputText  styleClass="mail" value="#{usuariosController.selected.correo}"/></label2></th>
                        <%--  <f:validateLength minimum="6"/> --%>
                        <th><label2><h:inputSecret  styleClass="contra" value="#{usuariosController.selected.contrasena}"/></label2></th>
                        <th><h:commandButton styleClass="bot" type="submit" action="#{regController.redireccionar(usuariosController.selected.correo,usuariosController.selected.contrasena)}"/></th> 
                    </tr>
                </table>
                     
        </h:form>
      </ui:define>
    </body>
</html>

</f:view>