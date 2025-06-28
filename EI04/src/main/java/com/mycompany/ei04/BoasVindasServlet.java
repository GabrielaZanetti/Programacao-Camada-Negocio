package com.mycompany.ei04;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author gabii
 */
@WebServlet("/boasvindas") // Mapeia este Servlet para a URL "/boasvindas"
public class BoasVindasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Define o tipo de conteúdo da resposta como HTML com codificação UTF-8
        response.setContentType("text/html;charset=UTF-8");

        // Obtém um objeto PrintWriter para escrever a resposta no corpo da requisição
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Serviço de Boas-Vindas</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Olá do Servlet de Boas-Vindas!</h1>"); // Mensagem principal
            out.println("<p>Esta é uma demonstração simples de um serviço web.</p>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}