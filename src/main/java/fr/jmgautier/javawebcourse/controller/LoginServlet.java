package fr.jmgautier.javawebcourse.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Calendar;

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
        session.setAttribute("message","");
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
            Calendar date= Calendar.getInstance();
            String heure=date.get(Calendar.HOUR_OF_DAY)+":"+date.get(Calendar.MINUTE);

            session.setAttribute("heure",heure);
            req.getRequestDispatcher("/connected.jsp").forward(req, resp);
            session.setAttribute("isConnected",true);
        } else {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
            session.setAttribute("isConnected",false);
            session.setAttribute("message","Erreur sur la saisie du login ou du mdp");
        }
    }
}
