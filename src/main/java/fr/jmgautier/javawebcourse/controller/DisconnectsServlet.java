package fr.jmgautier.javawebcourse.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class DisconnectsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        session.setAttribute("message", "Vous n'avez pas les droits pour êtres sur cette page");
        session.setAttribute("login", "");
        session.setAttribute("password", "");
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
        session.setAttribute("isConnected", false);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);
        session.setAttribute("message", "Vous êtes déconnecté");
        session.setAttribute("login", "");
        session.setAttribute("password", "");
        req.getRequestDispatcher("/login.jsp").forward(req, resp);
        session.setAttribute("isConnected", false);

    }
}
