package org.apache.jsp;

import org.apache.jasper.*;

import javax.faces.context.FacesContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspFactory;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.SkipPageException;

public final class PagProfesional_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_outputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_form_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_graphicImage_width_url_height_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_commandButton_value_styleClass_action_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_outputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_form_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_graphicImage_width_url_height_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_f_view.release();
    _jspx_tagPool_h_outputText_value_nobody.release();
    _jspx_tagPool_h_form_id.release();
    _jspx_tagPool_h_graphicImage_width_url_height_nobody.release();
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      //  f:view
      com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
      _jspx_th_f_view_0.setPageContext(_jspx_page_context);
      _jspx_th_f_view_0.setParent(null);
      _jspx_th_f_view_0.setJspId("id14");
      int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_f_view_0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("<html>\r\n");
          out.write("    <div class=\"div1\"> \r\n");
          out.write("  <head>\r\n");
          out.write("     <title>");
          if (_jspx_meth_h_outputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
            return;
          out.write("</title>\r\n");
          out.write("       <LINK href=\"estiloProfesional.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
          out.write("  </head>\r\n");
          out.write("    <body>\r\n");
          out.write("        <h1>Bienvenido ");
          if (_jspx_meth_h_outputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
            return;
          out.write("</h1>\r\n");
          out.write("        <h8>Bienvenido ");
          if (_jspx_meth_h_outputText_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
            return;
          out.write("</h8>\r\n");
          out.write("        <ui:define name=\"content\">\r\n");
          out.write("          \r\n");
          out.write("            ");
          //  h:form
          com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
          _jspx_th_h_form_0.setPageContext(_jspx_page_context);
          _jspx_th_h_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
          _jspx_th_h_form_0.setJspId("id32");
          _jspx_th_h_form_0.setId("pro");
          int _jspx_eval_h_form_0 = _jspx_th_h_form_0.doStartTag();
          if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_h_form_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_h_form_0.doInitBody();
            }
            do {
              out.write("  \r\n");
              out.write("              \r\n");
              out.write("    <br>\r\n");
              out.write("        <table class=\"foto\">\r\n");
              out.write("            <tr>\r\n");
              out.write("                <td> ");
              if (_jspx_meth_h_graphicImage_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("                    </td>\r\n");
              out.write("            </tr>\r\n");
              out.write("        </table>\r\n");
              out.write("    <table class=\"tabpro\">\r\n");
              out.write("      <tr>\r\n");
              out.write("        <th><label>Nombre:</label> </th>                       \r\n");
              out.write("        <th>");
              if (_jspx_meth_h_outputText_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write(" </th>\r\n");
              out.write("      </tr>\r\n");
              out.write("       <tr>\r\n");
              out.write("        <th><label>Apellido:</label> </th>                       \r\n");
              out.write("        <th>");
              if (_jspx_meth_h_outputText_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write(" </th>\r\n");
              out.write("      </tr>\r\n");
              out.write("       <tr>\r\n");
              out.write("        <th><label>Sexo:</label> </th>                       \r\n");
              out.write("        <th>");
              if (_jspx_meth_h_outputText_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write(" </th>\r\n");
              out.write("      </tr>\r\n");
              out.write("       <tr>\r\n");
              out.write("        <th><label>Edad:</label> </th>                       \r\n");
              out.write("        <th>");
              if (_jspx_meth_h_outputText_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write(" </th>\r\n");
              out.write("      </tr>\r\n");
              out.write("      <tr>\r\n");
              out.write("        <th><label>Titulo:</label> </th>                       \r\n");
              out.write("        <th>");
              if (_jspx_meth_h_outputText_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write(" </th>\r\n");
              out.write("      </tr>\r\n");
              out.write("    </table>\r\n");
              out.write("        <table class=\"tabtopright\">\r\n");
              out.write("          <tr> \r\n");
              out.write("              <th> IDIOMAS: </th><tr></tr><tr></tr>\r\n");
              out.write("          </tr>\r\n");
              out.write("            <tr>\r\n");
              out.write("                <th>");
              if (_jspx_meth_h_outputText_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write("</th>\r\n");
              out.write("            </tr>\r\n");
              out.write("        </table>\r\n");
              out.write("        <table class=\"tabtopright2\">\r\n");
              out.write("            <tr>\r\n");
              out.write("                <th>CURSOS: </th><tr></tr><tr></tr>\r\n");
              out.write("\t    </tr>\t\r\n");
              out.write("             <tr>\r\n");
              out.write("                 <th>");
              if (_jspx_meth_h_outputText_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write("  </tr>\r\n");
              out.write("        </table>\r\n");

    HttpSession sesion=(HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(false);
    String s =(String) sesion.getAttribute("tipo");
    if(s == "profesional")
        {

              out.write("\r\n");
              out.write("        <table class=\"tablaeditar\">\r\n");
              out.write("            <tr><th>\r\n");
              out.write("                    ");
              if (_jspx_meth_h_commandButton_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write("                 \r\n");
              out.write("            </th></tr>\r\n");
              out.write("        </table>\r\n");
              out.write("        <table class=\"tablabus\">\r\n");
              out.write("            <tr><th>\r\n");
              out.write("                  ");
              if (_jspx_meth_h_commandButton_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write("                 \r\n");
              out.write("            </th></tr>\r\n");
              out.write("        </table>\r\n");
     }   
              out.write("\r\n");
              out.write("        <table class=\"tablavolver\">\r\n");
              out.write("         <tr><th>\r\n");
              out.write("                 ");
              if (_jspx_meth_h_commandButton_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_0, _jspx_page_context))
                return;
              out.write(" \r\n");
              out.write("         </th></tr>\r\n");
              out.write("       </table>\r\n");
              out.write("    <table class=\"tabfondo\">\r\n");
              out.write("  <tr> \r\n");
              out.write("    <td> ©2011 Todos los derechos reservados</td>\r\n");
              out.write("  </tr>\r\n");
              out.write("</table>\r\n");
              out.write("  ");
              int evalDoAfterBody = _jspx_th_h_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_h_form_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
              out = _jspx_page_context.popBody();
          }
          if (_jspx_th_h_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_0);
            return;
          }
          _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_0);
          out.write("\r\n");
          out.write("    ");
          if (_jspx_meth_h_form_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
            return;
          out.write("\r\n");
          out.write("           \r\n");
          out.write("</body>\r\n");
          out.write("</html>\r\n");
          int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
        return;
      }
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_h_outputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_outputText_0.setJspId("id20");
    _jspx_th_h_outputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{personasController.persona.nombre}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_0 = _jspx_th_h_outputText_0.doStartTag();
    if (_jspx_th_h_outputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_outputText_1.setJspId("id26");
    _jspx_th_h_outputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{personasController.persona.nombre}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_1 = _jspx_th_h_outputText_1.doStartTag();
    if (_jspx_th_h_outputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_2(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_2.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_outputText_2.setJspId("id29");
    _jspx_th_h_outputText_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{usuariosController.saludo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_2 = _jspx_th_h_outputText_2.doStartTag();
    if (_jspx_th_h_outputText_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_2);
    return false;
  }

  private boolean _jspx_meth_h_graphicImage_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:graphicImage
    com.sun.faces.taglib.html_basic.GraphicImageTag _jspx_th_h_graphicImage_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.GraphicImageTag.class) : new com.sun.faces.taglib.html_basic.GraphicImageTag();
    _jspx_th_h_graphicImage_0.setPageContext(_jspx_page_context);
    _jspx_th_h_graphicImage_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_graphicImage_0.setJspId("id38");
    _jspx_th_h_graphicImage_0.setWidth(org.apache.jasper.runtime.PageContextImpl.getValueExpression("200px", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_graphicImage_0.setHeight(org.apache.jasper.runtime.PageContextImpl.getValueExpression("200px", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_graphicImage_0.setUrl(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{profesionalesController.prof.url}", (PageContext)_jspx_page_context, java.lang.String.class, null));
    int _jspx_eval_h_graphicImage_0 = _jspx_th_h_graphicImage_0.doStartTag();
    if (_jspx_th_h_graphicImage_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_graphicImage_width_url_height_nobody.reuse(_jspx_th_h_graphicImage_0);
      return true;
    }
    _jspx_tagPool_h_graphicImage_width_url_height_nobody.reuse(_jspx_th_h_graphicImage_0);
    return false;
  }

  private boolean _jspx_meth_h_outputText_3(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_3 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_3.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_3.setJspId("id50");
    _jspx_th_h_outputText_3.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{personasController.persona.nombre}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_3 = _jspx_th_h_outputText_3.doStartTag();
    if (_jspx_th_h_outputText_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_3);
    return false;
  }

  private boolean _jspx_meth_h_outputText_4(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_4 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_4.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_4.setJspId("id60");
    _jspx_th_h_outputText_4.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{personasController.persona.apellido}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_4 = _jspx_th_h_outputText_4.doStartTag();
    if (_jspx_th_h_outputText_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_4);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_4);
    return false;
  }

  private boolean _jspx_meth_h_outputText_5(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_5 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_5.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_5.setJspId("id70");
    _jspx_th_h_outputText_5.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{personasController.persona.sexo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_5 = _jspx_th_h_outputText_5.doStartTag();
    if (_jspx_th_h_outputText_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_5);
    return false;
  }

  private boolean _jspx_meth_h_outputText_6(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_6 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_6.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_6.setJspId("id80");
    _jspx_th_h_outputText_6.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{personasController.edad()}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_6 = _jspx_th_h_outputText_6.doStartTag();
    if (_jspx_th_h_outputText_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_6);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_6);
    return false;
  }

  private boolean _jspx_meth_h_outputText_7(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_7 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_7.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_7.setJspId("id90");
    _jspx_th_h_outputText_7.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{profesionalesController.prof.titulo}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_7 = _jspx_th_h_outputText_7.doStartTag();
    if (_jspx_th_h_outputText_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_7);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_7);
    return false;
  }

  private boolean _jspx_meth_h_outputText_8(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_8 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_8.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_8.setJspId("id106");
    _jspx_th_h_outputText_8.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{profesionalesController.prof.idiomas}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_8 = _jspx_th_h_outputText_8.doStartTag();
    if (_jspx_th_h_outputText_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_8);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_8);
    return false;
  }

  private boolean _jspx_meth_h_outputText_9(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_9 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_9.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_outputText_9.setJspId("id121");
    _jspx_th_h_outputText_9.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{profesionalesController.prof.cursos}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_9 = _jspx_th_h_outputText_9.doStartTag();
    if (_jspx_th_h_outputText_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_9);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_9);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_0(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_0.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_0.setJspId("id130");
    _jspx_th_h_commandButton_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_0.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("botEditar", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_0.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{profesionalesController.Editar()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_0 = _jspx_th_h_commandButton_0.doStartTag();
    if (_jspx_th_h_commandButton_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_0);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_1(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_1.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_1.setJspId("id138");
    _jspx_th_h_commandButton_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_1.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("botBuscar", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_1.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{profesionalesController.BuscarTrabajo()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_1 = _jspx_th_h_commandButton_1.doStartTag();
    if (_jspx_th_h_commandButton_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_1);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_1);
    return false;
  }

  private boolean _jspx_meth_h_commandButton_2(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:commandButton
    com.sun.faces.taglib.html_basic.CommandButtonTag _jspx_th_h_commandButton_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.CommandButtonTag.class) : new com.sun.faces.taglib.html_basic.CommandButtonTag();
    _jspx_th_h_commandButton_2.setPageContext(_jspx_page_context);
    _jspx_th_h_commandButton_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_0);
    _jspx_th_h_commandButton_2.setJspId("id148");
    _jspx_th_h_commandButton_2.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    _jspx_th_h_commandButton_2.setStyleClass(org.apache.jasper.runtime.PageContextImpl.getValueExpression("botinicio", (PageContext)_jspx_page_context, java.lang.String.class, null));
    _jspx_th_h_commandButton_2.setAction(org.apache.jasper.runtime.PageContextImpl.getMethodExpression("#{profesionalesController.Salir()}", (PageContext)_jspx_page_context, null, java.lang.Object.class, new Class[] {}));
    int _jspx_eval_h_commandButton_2 = _jspx_th_h_commandButton_2.doStartTag();
    if (_jspx_th_h_commandButton_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_2);
      return true;
    }
    _jspx_tagPool_h_commandButton_value_styleClass_action_nobody.reuse(_jspx_th_h_commandButton_2);
    return false;
  }

  private boolean _jspx_meth_h_form_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:form
    com.sun.faces.taglib.html_basic.FormTag _jspx_th_h_form_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.FormTag.class) : new com.sun.faces.taglib.html_basic.FormTag();
    _jspx_th_h_form_1.setPageContext(_jspx_page_context);
    _jspx_th_h_form_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_form_1.setJspId("id160");
    _jspx_th_h_form_1.setId("medio");
    int _jspx_eval_h_form_1 = _jspx_th_h_form_1.doStartTag();
    if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_h_form_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_h_form_1.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("      \r\n");
        out.write("    <table class=\"tabmedio\">\r\n");
        out.write("            <tr>\r\n");
        out.write("                <th> EXPERIENCIA PROFESIONAL:</th>\r\n");
        out.write("            </tr>\t<tr></tr><tr></tr>\r\n");
        out.write("            <tr>\r\n");
        out.write("                <th>");
        if (_jspx_meth_h_outputText_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_h_form_1, _jspx_page_context))
          return true;
        out.write("  </tr>\r\n");
        out.write("\t    </tr>\r\n");
        out.write("                \r\n");
        out.write("        </table>\r\n");
        out.write("            \r\n");
        out.write("        </div>\r\n");
        out.write(" ");
        int evalDoAfterBody = _jspx_th_h_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_h_form_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_h_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_1);
      return true;
    }
    _jspx_tagPool_h_form_id.reuse(_jspx_th_h_form_1);
    return false;
  }

  private boolean _jspx_meth_h_outputText_10(javax.servlet.jsp.tagext.JspTag _jspx_th_h_form_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:outputText
    com.sun.faces.taglib.html_basic.OutputTextTag _jspx_th_h_outputText_10 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.OutputTextTag.class) : new com.sun.faces.taglib.html_basic.OutputTextTag();
    _jspx_th_h_outputText_10.setPageContext(_jspx_page_context);
    _jspx_th_h_outputText_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_h_form_1);
    _jspx_th_h_outputText_10.setJspId("id173");
    _jspx_th_h_outputText_10.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{profesionalesController.prof.antecedentes}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_outputText_10 = _jspx_th_h_outputText_10.doStartTag();
    if (_jspx_th_h_outputText_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_10);
      return true;
    }
    _jspx_tagPool_h_outputText_value_nobody.reuse(_jspx_th_h_outputText_10);
    return false;
  }
}
