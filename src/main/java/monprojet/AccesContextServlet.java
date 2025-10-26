package monprojet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class AccesContextServlet   extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        ServletContext context = getServletContext();

        
        String webmaster = context.getInitParameter("webmaster");
        String email = context.getInitParameter("email");

        out.println("<html><head><title>Infos du Contexte</title></head><body>");
        out.println("<h1>Paramètres du contexte :</h1>");
        out.println("<ul>");
        out.println("<li><strong>Webmaster :</strong> " + webmaster + "</li>");
        out.println("<li><strong>Email :</strong> " + email + "</li>");
        out.println("</ul>");
        out.println("</body></html>");
    }
}
