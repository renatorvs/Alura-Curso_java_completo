package br.com.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.maven.Produtos;
import br.com.caelum.stella.tinytype.CPF;

@SuppressWarnings("serial")
@WebServlet(urlPatterns={"/contato"})
public class ContatoServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
    	Produtos p = new Produtos("PS4", 5.00);
    	new CPF("42438479833").isValido();
        PrintWriter writer = resp.getWriter();
        writer.println("<html><h2>Fale conosco</h2></html>");
        writer.close();
    }
}