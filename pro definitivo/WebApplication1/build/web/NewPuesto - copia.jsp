<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.PuestosController" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<f:view>
<html>
    <head>
        <title>Nuevo puesto</title>
           <LINK href="estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <ui:define name="content">
        <h:form id="newpuesto">
            <table class="newpuesto"> 
                <tr> 
                    <th><label>Puesto</label> </th>                       
                    <th><h:inputText value="#{puestosController.selected.puesto}" required="true" requiredMessage="#{bundle.CreatePersonasRequiredMessage_nombre}"/> </th>
                </tr> 
                <tr>
                    <th><label>Area</label></th>
                    <th><h:inputText value="#{puestosController.selected.area}" required="true" requiredMessage="#{bundle.CreatePersonasRequiredMessage_apellido}"/> </th>
                </tr>
                <tr>
                    <th><label>idpuesto</label></th>
                    <th><h:inputText disabled="true"  value="#{puestosController.selected.idPuesto}" required="true" requiredMessage="#{bundle.CreatePersonasRequiredMessage_apellido}"/> </th>
                </tr>
                <tr>
                     <th><label>Salario</label></th>
                    <th><h:inputText value="#{puestosController.selected.salario}"/></th>
                </tr>
                 <tr>
                     <th><label>Cantidad de puestos</label></th>
                     <th><h:inputText value="#{puestosController.selected.disponible}"/></th>
                </tr>
                <tr>
                    <th><label>Descripcion</label></th>
                    <th><h:inputTextarea value="#{puestosController.selected.descripcion}"/></th>
                </tr>
                  <tr>
                    <th><label>Fecha dd/mm/yyyy</label></th>
                    <th><h:inputText value="#{puestosController.selected.fecha}"></th>
                        <f:convertDateTime pattern="dd/MM/yyyy"/></h:inputText>
                </tr>
                 <tr>
                    <th><label>cuit</label</th>
                    <th><h:inputText  disabled="true" value="#{puestosController.selected.idEmpresa}"/> </th>
                </tr>
                <tr> 
                    <th> <h:commandButton styleClass="botCancelar" type="submit" action="#{puestosController.Cancel()}"/></th>
                    <th> <h:commandButton styleClass="botGuardar" type="submit" action="#{puestosController.create()}"/></th>
                </tr>
            </table>
                
        </h:form>
        </ui:define>            
         
    </body>
</html>

</f:view>