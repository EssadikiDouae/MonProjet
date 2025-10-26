package monprojet;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class AdditionServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Addition</title></head>");
        out.println("<body style='display:flex; justify-content:center; align-items:center; height:100vh; font-family:Arial;'>");
        out.println("<div style='text-align:center;'>");
        out.println("<h2>Formulaire d'addition</h2>");
        out.println("<form method='POST' action='AdditionServlet'>");
        out.println("Nombre 1: <input type='text' name='nombre1'><br><br>");
        out.println("Nombre 2: <input type='text' name='nombre2'><br><br>");
        out.println("<input type='submit' value='Additionner'>");
        out.println("</form>");
        out.println("</div>");
        out.println("</body></html>");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String n1 = request.getParameter("nombre1");
        String n2 = request.getParameter("nombre2");

        int resultat = 0;
        boolean erreur = false;

        try {
            int val1 = Integer.parseInt(n1);
            int val2 = Integer.parseInt(n2);
            resultat = val1 + val2;
        } catch (Exception e) {
            erreur = true;
        }

        out.println("<html>");
        out.println("<head><title>Résultat Addition</title></head>");
        out.println("<body style='display:flex; justify-content:center; align-items:center; height:100vh; font-family:Arial;'>");
        out.println("<div style='text-align:center;'>");

        if (erreur) {
            out.println("<p style='color:red;'>Erreur : Veuillez entrer des nombres valides !</p>");
        } else {
            out.println("<h2>Résultat : " + resultat + "</h2>");
        }

        out.println("<form method='POST' action='AdditionServlet'>");
        out.println("Nombre 1: <input type='text' name='nombre1'><br><br>");
        out.println("Nombre 2: <input type='text' name='nombre2'><br><br>");
        out.println("<input type='submit' value='Additionner'>");
        out.println("</form>");

        out.println("</div>");
        out.println("</body></html>");
    }
}
