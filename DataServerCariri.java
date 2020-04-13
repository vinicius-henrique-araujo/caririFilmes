/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fjn.edu.pos.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jarmeson
 */
@WebServlet(name = "DataServerCariri", urlPatterns = {"/DataServerCariri"})
public class DataServerCariri extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param req servlet request
     * @param resp servlet response
     * @throws IOException if an I/O error occurs
     */
        @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
//        PrintWriter saida = resp.getWriter();
//        saida.print("LocalDate " + LocalDate.now());
        resp.setContentType("text/html");
        resp.getWriter().print("LocalDate " + LocalDate.now());
        System.out.println("LocalDate" + LocalDate.now());
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DataServerCariri</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DataServerCariri at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
