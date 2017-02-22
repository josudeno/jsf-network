<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.ProfesionalesController" %>
Outputresource.StylesheetTag
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<f:view>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>prueba</title>
<%--<h:outputStylesheet name="css/jsfcrud.css"/>--%>
            <LINK href="estilo.css" rel="stylesheet" type="text/css"/>
        </head>
        <body>
            <h1><h:outputText value="JavaServer Faces"/></h1>
                <h:form>
                    <h:commandLink action="#{trabajos.listSetup}" value="Show All Trabajos Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{puestos.listSetup}" value="Show All Puestos Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{puestos.listSetup}" value="Show All Puestos Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{profesionalesController.selected}" value="Show All Profesionales Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{usuarios.listSetup}" value="Show All Usuarios Items"/>
                </h:form>
      
                <h:form>
                    <h:commandLink action="#{empresas.listSetup}" value="Show All Empresas Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{personas.listSetup}" value="Show All Personas Items"/>
                </h:form>

               

                <h:form>
                    <h:commandLink action="#{profesionales.listSetup}" value="Show All Profesionales Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{personas.listSetup}" value="Show All Personas Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{empresas.listSetup}" value="Show All Empresas Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{empresas.listSetup}" value="Show All Empresas Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{usuarios.listSetup}" value="Show All Usuarios Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{profesionales.listSetup}" value="Show All Profesionales Items"/>
                </h:form>

                <h:form>
                    <h:commandLink action="#{empresas.listSetup}" value="Show All Empresas Items"/>
                </h:form>

        </body>
    </html>
</f:view>
