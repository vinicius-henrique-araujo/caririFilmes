/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.fjn.edu.pos.web.servlets;

import br.fjn.edu.pos.web.domain.User;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Jarmeson
 */
@WebServlet(urlPatterns = {"/auth", "/logout"})
//@WebServlet("/auth")
public class AuthServletCariri extends HttpServlet {

    /**
     *
     * @param req
     * @param resp
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        User user = new User(userName, password);

        ServletContext context;
        context = getServletContext();

        String messageResString;
        messageResString = null;
        if (user.getName().equalsIgnoreCase("joao") && user.getPassword().equals("123")) {
            HttpSession session = req.getSession();
            session.setAttribute("userLogged", user);
            resp.sendRedirect("home.jsp");
        } else {
            req.setAttribute("loginErrorMsg", "Login Inválido!");
            RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
            dispatcher.forward(req, resp);
        }
    }

    /**
     *
     * @param req
     * @param resp
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        session.invalidate();
        resp.sendRedirect("login.jsp");
    }
}
