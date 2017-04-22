package edu.matc.persistence;

import edu.matc.entity.Recipe;
import edu.matc.entity.RecipeIngredient;
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
public class RecipeIngredientDaoTest {

    RecipeIngredientDao dao;
    int newRecipeIngredient = 0;

    @Before
    public void setup() {
        dao = new RecipeIngredientDao();
    }

    @Test
    public void getAllRecipeIngredients() throws Exception {
        List<RecipeIngredient> recipeIngredients = dao.getAllRecipeIngredients();
        assertTrue(recipeIngredients.size() > 0);
    }

    @Test
    public void getRecipeIngredient() throws Exception {
        RecipeIngredient recipeIngredient = dao.getRecipeIngredient(1);
        assertEquals("getRecipeIngredient() is not working", "Test Recipe Ingredient", recipeIngredient.getIngredient());
    }

    @Test
    public void getRecipeIngredientByRecipeId() throws Exception {
        List<RecipeIngredient> recipeIngredients = dao.getRecipeIngredientByRecipeId(2);
        assertTrue(recipeIngredients.size() > 0);
    }

    @Test
    public void addRecipeIngredient() throws Exception {
        RecipeIngredient recipeIngredient = new RecipeIngredient(2, "Test", 1, "Pound");
        newRecipeIngredient = dao.addRecipeIngredient(recipeIngredient);

        assertNotEquals(0, newRecipeIngredient);

        RecipeIngredient insertedRecipeIngredient = dao.getRecipeIngredient(newRecipeIngredient);
        assertEquals(recipeIngredient.getRecipeid(), insertedRecipeIngredient.getRecipeid());
        assertEquals(recipeIngredient.getIngredient(), insertedRecipeIngredient.getIngredient());
        assertEquals(recipeIngredient.getQuantity(), insertedRecipeIngredient.getQuantity());
        assertEquals(recipeIngredient.getUnits_measurement(), insertedRecipeIngredient.getUnits_measurement());
    }

    @Test
    public void deleteRecipeIngredient() throws Exception {
        dao.deleteRecipeIngredient(2);
        assertNull("recipe did not get deleted", dao.getRecipeIngredient(2));
    }

    @Test
    public void updateRecipeIngredient() throws Exception {
        RecipeIngredient recipeIngredient = dao.getRecipeIngredient(1);
        dao.updateRecipeIngredient(recipeIngredient);

        RecipeIngredient insertedRecipeIngredient = dao.getRecipeIngredient(1);
        assertEquals(recipeIngredient.getRecipeid(), insertedRecipeIngredient.getRecipeid());
        assertEquals(recipeIngredient.getIngredient(), insertedRecipeIngredient.getIngredient());
        assertEquals(recipeIngredient.getQuantity(), insertedRecipeIngredient.getQuantity());
        assertEquals(recipeIngredient.getUnits_measurement(), insertedRecipeIngredient.getUnits_measurement());
    }

    @After
    public void tearDown() throws Exception {
        if (newRecipeIngredient != 0) {
            dao.deleteRecipeIngredient(newRecipeIngredient);
        }
    }
}