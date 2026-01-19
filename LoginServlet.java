package org.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            // Al recibir un GET (cerrar sesión), redirigimos al inicio
            response.sendRedirect("index.jsp");
        }

        // Capturar datos del formulario
        String usuario = request.getParameter("user");
        String clave = request.getParameter("pass");

        // Configurar la respuesta
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Respuesta ScanDoc</title></head>");
        out.println("<body style='text-align:center; font-family:sans-serif;'>");
        out.println("<h1 style='color: #28a745;'>Acceso Exitoso</h1>");
        out.println("<p>Bienvenido al sistema de ScanDoc Pro, <b>" + usuario + "</b></p>");
        out.println("<p>Los datos han sido recibidos correctamente por el Servlet.</p>");
        out.println("<br><a href='index.jsp'>Cerrar Sesión</a>");
        out.println("</body>");
        out.println("</html>");
    }
}