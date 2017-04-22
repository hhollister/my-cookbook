package edu.matc.controller;

import edu.matc.entity.Recipe;
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
import java.util.List;

/**
 * A simple servlet to welcome the user.
 * @author hollister
 */

@WebServlet(
        urlPatterns = {"/recipes"}
)

public class Recipes extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Get the user id
        UserDao userDao = new UserDao();
        String username = req.getRemoteUser();
        User user = userDao.getUserByUsername(username);
        int user_id = user.getUserid();

        RecipeDao recipeDao = new RecipeDao();
        List<Recipe> recipes = recipeDao.getAllRecipesByUserId(user_id);

        req.setAttribute("recipes", recipes);
    }
}