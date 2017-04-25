package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.RecipeDao;
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
        urlPatterns = {"/nextaddingredients"}
)

public class NextAddIngredients extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();
        String username = req.getRemoteUser();
        User user = userDao.getUserByUsername(username);
        int user_id = user.getUserid();

        RecipeDao recipeDao = new RecipeDao();
        String recipeName = req.getParameter("recipeName");
        int recipe_id = recipeDao.getRecipeByUserAndRecipeName(user_id, recipeName);

        req.setAttribute("recipe_id", recipe_id);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addrecipeinstructions.jsp");
        dispatcher.forward(req, resp);
    }
}