package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * A simple servlet to welcome the user.
 * @author hollister
 */

@WebServlet(
        urlPatterns = {"/createAccount"}
)

public class CreateAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        String insertedFirstName = req.getParameter("firstName");
        String insertedEmail = req.getParameter("emailAddress");
        String insertedUsername = req.getParameter("username");
        String insertedPassword = req.getParameter("password");
        User user = new User(insertedFirstName, insertedEmail, insertedUsername, insertedPassword);
        userDao.addUser(user);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/index.jsp");
        dispatcher.forward(req, resp);
    }
}