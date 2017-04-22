package edu.matc.controller;

import edu.matc.entity.RecipeIngredient;
import edu.matc.persistence.RecipeIngredientDao;

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
        urlPatterns = {"/nextaddinstructions"}
)

public class NextAddInstructions extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String recipeName = req.getParameter("recipeName");
        req.setAttribute("recipeName", recipeName);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addrecipeinstructions.jsp");
        dispatcher.forward(req, resp);
    }
}