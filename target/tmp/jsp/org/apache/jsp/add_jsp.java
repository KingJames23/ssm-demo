package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\r\n");
      out.write("<body>\r\n");
      out.write("<h2>Welcome to my SSM demo project!</h2>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<form action=\"http://127.0.0.1:8080/crud/add\" method=\"post\" enctype='application/json'>\r\n");
      out.write("    <h3>Add Demo</h3>\r\n");
      out.write("    <h3>name= <input type=\"text\" name=\"name\"/></h3>\r\n");
      out.write("    <h3>age= <input type=\"text\" name=\"age\"/></h3>\r\n");
      out.write("    <h3>company= <input type=\"text\" name=\"company\"/></h3>\r\n");
      out.write("    <h3>mobile= <input type=\"text\" name=\"mobile\"/></h3>\r\n");
      out.write("    <h3>province= <input type=\"text\" name=\"province\"/></h3>\r\n");
      out.write("    <h3>city= <input type=\"text\" name=\"city\"/></h3>\r\n");
      out.write("    <h3>district= <input type=\"text\" name=\"district\"/></h3>\r\n");
      out.write("    <h3>zipCode= <input type=\"text\" name=\"zipCode\"/></h3>\r\n");
      out.write("    <h3><input type=\"submit\" value=\"Submit\"/></h3>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
