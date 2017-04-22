package edu.matc.controller;

import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import edu.matc.persistence.RecipeDao;
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
        urlPatterns = {"/addrecipe"}
)

public class AddRecipe extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int insertedPreparationTime;
        int insertedCookTime;
        int insertedYield;
        int insertedPreheatTemperature;

        UserDao userDao = new UserDao();
        String username = req.getRemoteUser();
        User user = userDao.getUserByUsername(username);
        int user_id = user.getUserid();

        RecipeDao recipeDao = new RecipeDao();
        String insertedRecipeName = req.getParameter("recipeName");
        String insertedMealCategory = req.getParameter("recipeType");
        String insertedFoodCategory = req.getParameter("foodType");

        if (req.getParameter("prepTime").isEmpty()) {
            insertedPreparationTime = 0;
        } else {
            insertedPreparationTime = Integer.parseInt(req.getParameter("prepTime"));
        }

        if (req.getParameter("cookTime").isEmpty()) {
            insertedCookTime = 0;
        } else {
            insertedCookTime = Integer.parseInt(req.getParameter("cookTime"));
        }

        if (req.getParameter("yield").isEmpty()) {
            insertedYield = 0;
        } else {
            insertedYield = Integer.parseInt(req.getParameter("yield"));
        }

        if (req.getParameter("preheat").isEmpty()) {
            insertedPreheatTemperature = 0;
        } else {
            insertedPreheatTemperature = Integer.parseInt(req.getParameter("preheat"));
        }

        String insertedNotes = req.getParameter("notes");
        Recipe recipe = new Recipe(user_id, insertedRecipeName, insertedMealCategory, insertedFoodCategory, insertedPreparationTime, insertedCookTime, insertedYield, insertedPreheatTemperature, insertedNotes);
        recipeDao.addRecipe(recipe);

        req.setAttribute("recipeName", insertedRecipeName);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/addrecipeingredients.jsp");
        dispatcher.forward(req, resp);
    }
}