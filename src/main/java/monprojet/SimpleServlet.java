package monprojet;

import java.io.*;
import jakarta.servlet.*;

public class SimpleServlet implements Servlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config; 
        
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Simple Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Bonjour, ceci est une Servlet simple !</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    public String getServletInfo() {
        return "SimpleServlet version 1.0";
    }

    @Override
    public void destroy() {
    	
    }
    
   
}
