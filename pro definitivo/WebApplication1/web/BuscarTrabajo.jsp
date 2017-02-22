<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.BusquedaController" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<f:view>
<html>
    <div class="div1"> 
    <head>
        <title>Busqueda</title>
        <LINK href="busqueda.css" rel="stylesheet" type="text/css"/>
    </head>
        <body>
          <h:form>
            <h1><h:outputText value="Busqueda de empleo"/></h1>
            
            <table width="90%" border="0" cellspacing="0" cellpadding="1" bgcolor="#000000">
        <td><table width="100%" border="0" cellspacing="0" cellpadding="4" bgcolor="#cccccc">
          <tr bgcolor="#000000"> 
            <td colspan="3"><font color="#CCCCCC"><b>Search 
              </b></font></td>
          </tr>
          <tr> 
            <td align="right"><font color="#000000"> Area de trabajo a buscar</font></td>
            <td><h:selectOneMenu id="idEmpresa" value="#{busquedaController.area}" title="area">
                    <f:selectItems value="#{busquedaController.AreaDisponible()}"/>
                    </h:selectOneMenu></td>
          </tr>
        <tr> 
            <td align="right"><h:commandButton type="submit" action="#{busquedaController.BuscarPuesto()}" styleClass="botBuscar" onclick="Layers()"/></td>
          </tr>
            </table></td></table>
          
            <h:dataTable value="#{busquedaController.lista}"  var="items" styleClass="puestos" rowClasses="filas" rules="all" style="border:solid 1px">
                 <h:column>
                     <f:facet name="header">
                         <h:outputText value="Puesto"/>
                     </f:facet>
                    <h:outputText value="#{items.puesto}"/>
                 </h:column>
                 <h:column>
                     <f:facet name="header">
                         <h:outputText value="Area"/>
                     </f:facet>
                    <h:outputText value="#{items.area}"/>
                </h:column>
                <h:column>
                    <f:facet name="header">
                         <h:outputText value="Salario"/>
                     </f:facet>
                    <h:outputText value="#{items.salario}"/>
                </h:column>
                  <h:column>
                    <f:facet name="header">
                         <h:outputText value="Fecha publicacion"/>
                     </f:facet>
                    <h:outputText value="#{items.fecha}"/>
                </h:column>
                  <h:column>
                    <f:facet name="header">
                         <h:outputText value="Descripcion"/>
                     </f:facet>
                    <h:outputText value="#{items.descripcion}"/>
                </h:column>
                 <h:column>
                     <f:facet name="header">
                         <h:outputText value="Disponibles"/>
                     </f:facet>
                    <h:outputText value="#{items.disponible}"/>
                 </h:column>
                  
                <h:column>
                    <f:facet name="header">
                         <h:outputText value="Mas informacion"/>
                     </f:facet>
                      <h:commandLink action="#{busquedaController.Postularse(items.getIdEmpresa())}" value="Info de la Empresa"/>
                </h:column>
                <h:column headerClass="columna">
                     <f:facet name="header">
                         <h:outputText  styleClass="columna" value="."/>
                     </f:facet>
                    <h:outputText  styleClass="columna" value="#{items.getIdEmpresa()}"/>
                 </h:column>
            </h:dataTable>
        <table class="tablavolver">
         <tr><th>
                 <h:commandButton styleClass="botVolver" type="submit" action="#{busquedaController.Volver()}"/> 
         </th></tr>
       </table>
             </h:form>   
        </body>
    </div>
</html>
</f:view>
