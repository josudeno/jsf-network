<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.UsuariosController" %>
<%@page import="Controllers.RegController" %>
<!DOCTYPE html>
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empresa</title>
        <LINK href="estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <h1>Bienvenido a pro</h1>
        <h:form>
            <h5>Sea parte de nuestra comunidad de Empresas</h5>
            <table class="tab">
                <tr> 
                    <th><label>Razon social</label> <th/>
                    <h:inputText value="#{regController.empresa.razon}"/>
                </tr> 
                <tr>
                    <th><label>C.U.I.T</label></th>
                    <th><h:inputText value="#{regController.empresa.cuit}">
                        <f:converter converterId="javax.faces.Double"/> </h:inputText>></th> 
                </tr>
                <tr>
                    <th><label>Correo electronico</label></th>
                    <th><h:inputText value="#{regController.usuario.correo}"/></th> 
                </tr>
                <tr>
                    <th><label>Area/Rubro</label></th>
                    <th><h:inputText value="#{regController.empresa.area}"/></th> 
                </tr>
                  <tr>
                    <th><label>Contrasena</label></th>
                    <th><h:inputSecret value="#{regController.usuario.contrasena}"/></th> 
                </tr>
                 <tr>
                    <th><label>Descripcion</label></th>
                    <th><h:inputTextarea value="#{regController.empresa.descripcion}"/></th> 
                </tr>
                <tr>
                    <th> <h:commandButton  styleClass="boton" type="submit" action="#{regController.create}"/></th>
                </tr>
            </table>
            <table class="tab2">
                <tr><th>
                    <a href="faces/index.xhtml">Volver</a> 
                </th></tr>
            </table>
        </h:form>
    </body>
</html>

</f:view>