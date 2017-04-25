package edu.matc.controller;

import edu.matc.entity.Recipe;
import edu.matc.entity.RecipeIngredient;
import edu.matc.entity.RecipeInstruction;
import edu.matc.entity.User;
import edu.matc.persistence.RecipeDao;
import edu.matc.persistence.RecipeIngredientDao;
import edu.matc.persistence.RecipeInstructionDao;
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
        urlPatterns = {"/showrecipe"}
)

public class ShowRecipe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //Get recipe_id
        int recipe_id = Integer.parseInt(req.getParameter("recipeid"));
        RecipeDao recipeDao = new RecipeDao();
        Recipe recipe = recipeDao.getRecipe(recipe_id);
        req.setAttribute("recipe", recipe);

        //Get recipe ingredients
        RecipeIngredientDao recipeIngredientDao = new RecipeIngredientDao();
        List<RecipeIngredient> recipeIngredients = recipeIngredientDao.getRecipeIngredientByRecipeId(recipe_id);
        req.setAttribute("ingredients", recipeIngredients);

        //Get recipe instructions
        RecipeInstructionDao recipeInstructionDao = new RecipeInstructionDao();
        List<RecipeInstruction> recipeInstructions = recipeInstructionDao.getRecipeInstructionByRecipeId(recipe_id);
        req.setAttribute("instructions", recipeInstructions);

        // Forward to recipe.jsp
        RequestDispatcher dispatcher = req.getRequestDispatcher("/recipe.jsp");
        dispatcher.forward(req, resp);
    }
}