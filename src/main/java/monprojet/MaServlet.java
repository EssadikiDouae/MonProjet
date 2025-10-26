package monprojet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import jakarta.servlet.annotation.*;

@WebServlet("/Hello")
public class MaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h1>Bonjour le monde !</h1>");
        out.println("<p>Date actuelle : " + new Date() + "</p>");
        out.println("</body></html>");
    }
}
