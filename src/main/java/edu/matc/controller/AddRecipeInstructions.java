package edu.matc.controller;

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

/**
 * A simple servlet to welcome the user.
 * @author hollister
 */

@WebServlet(
        urlPatterns = {"/addrecipeinstructions"}
)

public class AddRecipeInstructions extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/**
        // Get the user id
        UserDao userDao = new UserDao();
        String username = req.getRemoteUser();
        User user = userDao.getUserByUsername(username);
        int user_id = user.getUserid();

        // Get the Recipe by user id and recipe name
        RecipeDao recipeDao = new RecipeDao();
        String recipeName = req.getParameter("recipeName");
        int recipe_id = recipeDao.getRecipeByUserAndRecipeName(user_id, recipeName);
*/
        // Get the Recipe by user id and recipe name
        RecipeDao recipeDao = new RecipeDao();
        int recipeid = Integer.parseInt(req.getParameter("recipeid"));

        // Map the information inserted on the form to the variables
        String insertedInstruction = req.getParameter("recipeInstruction");

        // Insert the ingredient to the recipe
        RecipeInstruction recipeInstruction = new RecipeInstruction(recipeid, insertedInstruction);
        RecipeInstructionDao recipeInstructionDao = new RecipeInstructionDao();
        recipeInstructionDao.addRecipeInstruction(recipeInstruction);

        // Set the attribute for the list of ingredients
        req.setAttribute("instructions", recipeInstructionDao.getRecipeInstructionByRecipeId(recipeid));

        req.setAttribute("recipeid", recipeid);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addrecipeinstructions.jsp");
        dispatcher.forward(req, resp);
    }
}