

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@page import="Controllers.PuestosController" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
             <LINK href="estiloEmp.css" rel="stylesheet" type="text/css"/>
            <title>Puestos de trabajo</title>
        </head>
        <body>
        <h:form styleClass="jsfcrud_list_form">
        <tr> <th><p>   <f:facet name="header">Puestos disponibles</f:facet></p></th> </tr>
        <tr>
   
        <h:panelGroup rendered="#{puestosController.items.rowCount > 0}">
<!--                    <h:outputText value="#{puestosController.pagination.pageFirstItem + 1}..#{puestosController.pagination.pageLastItem + 1}/#{puestosController.pagination.itemsCount}"/>&nbsp;-->
                 </tr><td>
                    <h:dataTable value="#{puestosController.items}" var="item" border="0" cellpadding="0" cellspacing="0" rowClasses="jsfcrud_odd_row,jsfcrud_even_row" rules="all" style="border:solid 1px">
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="#{bundle.ListPuestosTitle_idPuesto}"/>
                            </f:facet>
                            <h:outputText value="#{item.idPuesto}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="#{bundle.ListPuestosTitle_puesto}"/>
                            </f:facet>
                            <h:outputText value="#{item.puesto}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="#{bundle.ListPuestosTitle_area}"/>
                            </f:facet>
                            <h:outputText value="#{item.area}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="#{bundle.ListPuestosTitle_salario}"/>
                            </f:facet>
                            <h:outputText value="#{item.salario}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="#{bundle.ListPuestosTitle_fecha}"/>
                            </f:facet>
                            <h:outputText value="#{item.fecha}">
                                <f:convertDateTime pattern="dd/MM/yyyy" />
                            </h:outputText>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="#{bundle.ListPuestosTitle_idEmpresa}"/>
                            </f:facet>
                            <h:outputText value="#{item.idEmpresa}"/>
                        </h:column>
                          <h:column>
                            <f:facet name="header">
                                <h:outputText value="Descripcion"/>
                            </f:facet>
                            <h:outputText value="#{item.descripcion}"/>
                        </h:column>
                        <h:column>
                            <f:facet name="header">
                                <h:outputText value="Mas"/>
                            </f:facet>
                            <h:commandLink action="#{puestosController.prepareView}" value="#{bundle.ListPuestosViewLink}"/>
                            <h:outputText value="editar"/>
                            <h:commandLink action="#{puestosController.prepareEdit}" value="#{bundle.ListPuestosEditLink}"/>
                            <h:outputText value="borrar"/>
                            <h:commandLink action="#{puestosController.destroy}" value="#{bundle.ListPuestosDestroyLink}"/>
                        </h:column>
                    </h:dataTable>
                </h:panelGroup>
            </h:form>
        </td>


        </body>
    </html>
</f:view>
