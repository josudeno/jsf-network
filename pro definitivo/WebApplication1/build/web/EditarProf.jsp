<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@page import="Controllers.ProfesionalesController"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<f:view>
<html>
    <head>
        <title>Editar Profesional</title>
          <LINK href="estiloProfesional.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
       <h:form>
           <table class="tabeditar">
                <h:panelGrid columns="2">
                    <h:outputLabel value="Titulo"/>
                    <h:inputText id="titulo" value="#{profesionalesController.prof.titulo}" title="#{bundle.EditProfesionalesTitle_titulo}" required="true" requiredMessage="#{bundle.EditProfesionalesRequiredMessage_titulo}"/>
                    <h:outputLabel value="Cursos" />
                    <h:inputTextarea rows="4" cols="30" id="cursos" value="#{profesionalesController.prof.cursos}" title="#{bundle.EditProfesionalesTitle_cursos}" />
                    <h:outputLabel value="Idiomas" />
                    <h:inputTextarea rows="4" cols="30" id="idiomas" value="#{profesionalesController.prof.idiomas}" title="#{bundle.EditProfesionalesTitle_idiomas}" />
                    <h:outputLabel value="Antecedentes"/>
                    <h:inputTextarea rows="20" cols="80" id="antecedentes" value="#{profesionalesController.prof.antecedentes}" title="#{bundle.EditProfesionalesTitle_idiomas}" />
                    <h:commandButton styleClass="botCancelar" type="submit" action="#{profesionalesController.Cancel()}"/>
                    <h:commandButton styleClass="botGuardar" action="#{profesionalesController.SaveEdit()}" type="submit"/>
                </h:panelGrid>
             </table>
       </h:form>      
    </body>
</html>
</f:view>


