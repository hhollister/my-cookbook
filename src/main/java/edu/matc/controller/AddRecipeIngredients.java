package edu.matc.controller;

import edu.matc.entity.Recipe;
import edu.matc.entity.RecipeIngredient;
import edu.matc.entity.User;
import edu.matc.persistence.RecipeDao;
import edu.matc.persistence.RecipeIngredientDao;
import edu.matc.persistence.UserDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple servlet to welcome the user.
 * @author hollister
 */

@WebServlet(
        urlPatterns = {"/addrecipeingredients"}
)

public class AddRecipeIngredients extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int insertedQuantity;

        UserDao userDao = new UserDao();
        String username = req.getRemoteUser();
        User user = userDao.getUserByUsername(username);
        int user_id = user.getUserid();

        // Get the Recipe by user id and recipe name
        RecipeDao recipeDao = new RecipeDao();
        String recipeName = req.getParameter("recipeName");
        int recipe_id = recipeDao.getRecipeByUserAndRecipeName(user_id, recipeName);

        // Map the information inserted on the form to the variables

        String insertedIngredient = req.getParameter("recipeIngredient");

        if (req.getParameter("ingredientAmount").isEmpty()) {
            insertedQuantity = 0;
        } else {
            insertedQuantity = Integer.parseInt(req.getParameter("ingredientAmount"));
        }

        String insertedUnitsMeasurement = req.getParameter("ingredientMeasurement");

        // Insert the ingredient to the recipe
        RecipeIngredient recipeIngredient = new RecipeIngredient(recipe_id, insertedIngredient, insertedQuantity, insertedUnitsMeasurement);
        RecipeIngredientDao recipeIngredientDao = new RecipeIngredientDao();
        recipeIngredientDao.addRecipeIngredient(recipeIngredient);

        // Set the attribute for the list of ingredients
        req.setAttribute("ingredients", recipeIngredientDao.getRecipeIngredientByRecipeId(recipe_id));

        req.setAttribute("recipeName", recipeName);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addrecipeingredients.jsp");
        dispatcher.forward(req, resp);
    }
}