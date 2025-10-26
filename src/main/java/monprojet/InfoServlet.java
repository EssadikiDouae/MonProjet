package monprojet ;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/InfoServlet")
public class InfoServlet extends HttpServlet {
 static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Info Client</title></head><body>");
        out.println("<h2>Informations sur le client :</h2>");
        out.println("<p>Type mime de la requête :  " + request.getContentType() + "</p>");
        out.println("<p>Protocole de la requête :  " + request.getProtocol() + "</p>");
        out.println("<p>Adresse IP du client    :  " + request.getRemoteAddr() + "</p>");
        out.println("<p>Nom du client           :  " + request.getRemoteHost() + "</p>");
        out.println("<p>Nom du serveur qui a reçu la requête  : " + request.getServerName() + "</p>");
        out.println("<p>Port du serveur qui a reçu la requête : " + request.getServerPort() + "</p>");
        out.println("<p>Scheme : " + request.getScheme() + "</p>");
        
        out.println("<h1>Liste des parametres</h1>");
        Enumeration<String> paramsListe = request.getParameterNames();
        while (paramsListe.hasMoreElements()) {
            String param = paramsListe.nextElement();
            out.println("<tr>");
            out.println("<td>" + param + "</td>");
            out.println("<td>" + request.getParameter(param) + "</td>");
            out.println("</tr>");
        }
        out.println("</body></html>");
        out.close();
    }
}