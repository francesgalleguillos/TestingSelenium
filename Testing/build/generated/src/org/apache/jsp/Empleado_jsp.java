package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Empleado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" \n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Solemne 2 Java Web</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("     <style>\n");
      out.write("\n");
      out.write("  .titulo {\n");
      out.write("    background: grey;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    padding: 10px;\n");
      out.write("    color: white;\n");
      out.write("    border-bottom: 20px solid black;  \n");
      out.write("  }\n");
      out.write("\n");
      out.write("  #footer{\n");
      out.write("    background: #000;\n");
      out.write("    color: white; \n");
      out.write("    text-align: center;\n");
      out.write("    padding: 20px;\n");
      out.write("  } \n");
      out.write("\n");
      out.write("  #article{\n");
      out.write("    padding-left: 50px;\n");
      out.write("    padding-right: 50px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container-fluid col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("      <nav class=\"titulo\">\n");
      out.write("        <h1 align=\"center\">HACKER STAR</h1>\n");
      out.write("        <h3 align=\"center\">Control de Empleados</h3>\n");
      out.write("      </nav>\n");
      out.write("        </div>\n");
      out.write("        <h1 align=\"center\">ELIJA UNA OPCION</h1>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" align=\"center\"> \n");
      out.write("            <form  action =\"crearEmpleado.jsp\" method=\"post\">            \n");
      out.write("                <td><input type=\"submit\" value=\"Agregar Empleados\"></td>            \n");
      out.write("            </form>  \n");
      out.write("            <form  action =\"Listar\" method=\"post\">            \n");
      out.write("                <td><input type=\"submit\" value=\"Listar Empleados\"></td>            \n");
      out.write("            </form>\n");
      out.write("            <form  action =\"modificarEmpleado.jsp\" method=\"post\">            \n");
      out.write("                <td><input type=\"submit\" value=\"Modificar Empleados\"></td>            \n");
      out.write("            </form>\n");
      out.write("            <form  action =\"eliminarEmpleado.jsp\" method=\"post\">            \n");
      out.write("                <td><input type=\"submit\" value=\"Eliminar Empleados\"></td>            \n");
      out.write("            </form> \n");
      out.write("        </table>\n");
      out.write("        <form  action =\"formulario.jsp\" method=\"post\">            \n");
      out.write("            <td><input type=\"submit\" value=\"Volver\"></td>            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <footer class=\"container-fluid\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12\">\n");
      out.write("          <p id=\"footer\">Frances Galleguillos - Javier Lau - Felipe Peñaloza ©</p>                      \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("    \n");
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
