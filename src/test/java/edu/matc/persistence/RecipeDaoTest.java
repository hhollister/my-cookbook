package edu.matc.persistence;

import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created on 4/19/2017.
 *
 * @author hollister
 */
public class RecipeDaoTest {

    RecipeDao dao;
    int newRecipe = 0;

    @Before
    public void setup() {
        dao = new RecipeDao();
    }

    @Test
    public void getAllRecipes() throws Exception {
        List<Recipe> recipes = dao.getAllRecipes();
        assertTrue(recipes.size() > 0);
    }

    @Test
    public void getAllRecipesByUserId() throws Exception {
        List<Recipe> recipes = dao.getAllRecipesByUserId(20);
        assertTrue(recipes.size() > 0);
    }

    @Test
    public void getRecipeByUserAndRecipeName() throws Exception {
        int recipeId = dao.getRecipeByUserAndRecipeName(20, "Test Recipe");
        assertEquals("getRecipeByUserAndRecipeName() is not working", 4, recipeId);
    }

    @Test
    public void getRecipe() throws Exception {
        Recipe recipe = dao.getRecipe(2);
        assertEquals("getRecipe() is not working", "Test Recipe", recipe.getRecipe_name());
    }

    @Test
    public void addRecipe() throws Exception {
        Recipe recipe = new Recipe(20, "test", "Breakfast", "Beef", 10, 10, 2, 350, "testing");
        newRecipe = dao.addRecipe(recipe);
        //assertEquals("addUser() is not working", user.getUserid(), dao.getUser(user.getUserid()));

        assertNotEquals(0, newRecipe);

        Recipe insertedRecipe = dao.getRecipe(newRecipe);
        assertEquals(recipe.getRecipe_name(), insertedRecipe.getRecipe_name());
        assertEquals(recipe.getMeal_category(), insertedRecipe.getMeal_category());
        assertEquals(recipe.getFood_category(), insertedRecipe.getFood_category());
        assertEquals(recipe.getPreparation_time(), insertedRecipe.getPreparation_time());
        assertEquals(recipe.getCook_time(), insertedRecipe.getCook_time());
        assertEquals(recipe.getYield(), insertedRecipe.getYield());
        assertEquals(recipe.getPreheat_temperature(), insertedRecipe.getPreheat_temperature());
        assertEquals(recipe.getNotes(), insertedRecipe.getNotes());
    }

    @Test
    public void deleteRecipe() throws Exception {
        dao.deleteRecipe(3);
        assertNull("recipe did not get deleted", dao.getRecipe(3));
    }

    @Test
    public void updateRecipe() throws Exception {
        Recipe recipe = dao.getRecipe(2);
        dao.updateRecipe(recipe);

        Recipe insertedRecipe = dao.getRecipe(2);
        assertEquals(recipe.getRecipe_name(), insertedRecipe.getRecipe_name());
        assertEquals(recipe.getMeal_category(), insertedRecipe.getMeal_category());
        assertEquals(recipe.getFood_category(), insertedRecipe.getFood_category());
        assertEquals(recipe.getPreparation_time(), insertedRecipe.getPreparation_time());
        assertEquals(recipe.getCook_time(), insertedRecipe.getCook_time());
        assertEquals(recipe.getYield(), insertedRecipe.getYield());
        assertEquals(recipe.getPreheat_temperature(), insertedRecipe.getPreheat_temperature());
        assertEquals(recipe.getNotes(), insertedRecipe.getNotes());
    }

    @After
    public void tearDown() throws Exception {
        if (newRecipe != 0) {
            dao.deleteRecipe(newRecipe);
        }
    }
}