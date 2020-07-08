package fr.jmgautier.javawebcourse.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        if (login == null) login = "";
        if (password == null) password = "";
        HttpSession session = req.getSession(true);
        session.setAttribute("login", login);
        session.setAttribute("password", password);
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        HttpSession session = req.getSession(true);
        session.setAttribute("login", login);
        session.setAttribute("password", password);
        if (login.equals("toto") && password.equals("1234")) {

            req.getRequestDispatcher("/connected.jsp").forward(req, resp);
            session.setAttribute("isConnected",true);
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            session.setAttribute("isConnected",false);
        }
    }
}
