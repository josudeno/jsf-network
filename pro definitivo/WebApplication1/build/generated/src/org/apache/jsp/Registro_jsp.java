package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registro</title>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/styles.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function registrarse()\n");
      out.write("            {\n");
      out.write("                if(document.getElementById('nombreR').value != \"\" && document.getElementById('nombre').value != \"\" && document.getElementById('contrasena').value != \"\" && document.getElementById('mail').value != \"\")\n");
      out.write("                {\n");
      out.write("                    var usu = document.getElementById(\"nombre\").value;\n");
      out.write("                    $(\"#verificarUsuarioUnico\").load(\"VerificarUsuarioUnico\" ,{u:usu});\n");
      out.write("                }\n");
      out.write("            }           \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"head\">\n");
      out.write("         <div id=\"head_cen\">\n");
      out.write("          <div id=\"head_sup\" class=\"head_pad\">\n");
      out.write("              <form action=\"Login\">\n");
      out.write("                <p class=\"search\">\n");
      out.write("                    <label> Usuario: </label>\n");
      out.write("                    <input name=\"nombreL\" type=\"text\" />\n");
      out.write("                    <label> Contraseña: </label>\n");
      out.write("                    <input name=\"direccionL\" type=\"text\" />\n");
      out.write("                    <input name=\"search-btn\" type=\"submit\" value=\"Login\" />\n");
      out.write("                </p>\n");
      out.write("               </form>\n");
      out.write("            <h1><a href=\"index.html\">M CUBE</a></h1>\n");
      out.write("            <ul style=\"margin-top:20px;\">\n");
      out.write("             <li><a href=\"index.jsp\">INICIO</a></li>\n");
      out.write("             <li><a href=\"Registro.jsp\">REGISTRO</a></li>\n");
      out.write("             <li><a href=\"Acerca.jsp\">ACERCA</a></li>\n");
      out.write("             <li><a href=\"Contacto.jsp\">CONTACTO</a></li>\n");
      out.write("           </ul>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("         <div id=\"content_cen\">\n");
      out.write("          <div id=\"content_sup\" class=\"head_pad\">              \n");
      out.write("           <div id=\"welcom_pan\">\n");
      out.write("            <h2><span>usuario</span>NUEVO</h2>\n");
      out.write("            <form name=\"registro\" id=\"registro\" action=\"Servlet\">\n");
      out.write("                <br><br><br>\n");
      out.write("                <div id=\"quotPan\">\n");
      out.write("                    <h4><span> Nombre: </span></h4>\n");
      out.write("                    <input type=\"text\" id=\"nombreR\" name=\"nombreR\"/>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"quotPan\">\n");
      out.write("                    <h4><span>  </span> Nombre de Usuario:</h4>\n");
      out.write("                    <input type=\"text\" name=\"nombre\" id=\"nombre\"/>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"quotPan\">\n");
      out.write("                    <h4><span> Contraseña: </span></h4>\n");
      out.write("                    <input type=\"text\" name=\"contrasena\" id=\"contrasena\"/>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"quotPan\">\n");
      out.write("                    <h4><span>  </span>Mail:</h4>\n");
      out.write("                    <input type=\"text\" name=\"mail\" id=\"mail\" />\n");
      out.write("                </div>\n");
      out.write("                <a href=\"#\" onclick=\"registrarse()\">Registrarse</a>                \n");
      out.write("            </form>\n");
      out.write("           </div>\n");
      out.write("          </div>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"verificarUsuarioUnico\"></div>\n");
      out.write("\n");
      out.write("        <div id=\"foot\">\n");
      out.write("         <div id=\"foot_cen\">\n");
      out.write("         <h6><a href=\"index.jsp\">mcube</a></h6>\n");
      out.write("         <ul>\n");
      out.write("             <li><a href=\"index.jsp\">INICIO</a></li>\n");
      out.write("             <li class=\"space\">|</li>\n");
      out.write("             <li><a href=\"Registro.jsp\">REGISTRO</a></li>\n");
      out.write("             <li class=\"space\">|</li>\n");
      out.write("             <li><a href=\"Acerca.jsp\">ACERCA</a></li>\n");
      out.write("             <li class=\"space\">|</li>\n");
      out.write("             <li><a href=\"#\">CONTACTO</a></li>\n");
      out.write("             <li class=\"space\">|</li>\n");
      out.write("                 <li><a href=\"http://validator.w3.org/check?uri=referer\">xHtml</a></li>\n");
      out.write("           </ul>            \n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
