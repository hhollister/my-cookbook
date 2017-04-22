package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import edu.matc.persistence.UserDao;
import edu.matc.persistence.UserRoleDao;

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
        urlPatterns = {"/createaccount"}
)

public class CreateAccount extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        UserRoleDao userRoleDao = new UserRoleDao();
        String insertedFirstName = req.getParameter("firstName");
        String insertedEmail = req.getParameter("emailAddress");
        String insertedUsername = req.getParameter("username");
        String insertedPassword = req.getParameter("password");
        User user = new User(insertedFirstName, insertedEmail, insertedUsername, insertedPassword);
        UserRole userRole = new UserRole(insertedUsername, "user");
        userDao.addUser(user);
        userRoleDao.addUserRole(userRole);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/login.jsp");
        dispatcher.forward(req, resp);
    }
}