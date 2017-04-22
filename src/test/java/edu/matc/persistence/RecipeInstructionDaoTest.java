package edu.matc.persistence;

import edu.matc.entity.RecipeIngredient;
import edu.matc.entity.RecipeInstruction;
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
public class RecipeInstructionDaoTest {

    RecipeInstructionDao dao;
    int newRecipeInstruction = 0;

    @Before
    public void setup() {
        dao = new RecipeInstructionDao();
    }

    @Test
    public void getAllRecipeInstructions() throws Exception {
        List<RecipeInstruction> recipeInstructions = dao.getAllRecipeInstructions();
        assertTrue(recipeInstructions.size() > 0);
    }

    @Test
    public void getRecipeInstruction() throws Exception {
        RecipeInstruction recipeInstruction = dao.getRecipeInstruction(1);
        assertEquals("getRecipeInstruction() is not working", "Instruction Test", recipeInstruction.getInstruction());
    }

    @Test
    public void getRecipeInstructionByRecipeId() throws Exception {
        List<RecipeInstruction> recipeInstructions = dao.getRecipeInstructionByRecipeId(2);
        assertTrue(recipeInstructions.size() > 0);
    }

    @Test
    public void addRecipeInstruction() throws Exception {
        RecipeInstruction recipeInstruction = new RecipeInstruction(2, "Test");
        newRecipeInstruction = dao.addRecipeInstruction(recipeInstruction);

        assertNotEquals(0, newRecipeInstruction);

        RecipeInstruction insertedRecipeInstruction = dao.getRecipeInstruction(newRecipeInstruction);
        assertEquals(recipeInstruction.getRecipeid(), insertedRecipeInstruction.getRecipeid());
        assertEquals(recipeInstruction.getInstruction(), insertedRecipeInstruction.getInstruction());
    }

    @Test
    public void deleteRecipeInstruction() throws Exception {
        dao.deleteRecipeInstruction(2);
        assertNull("instruction did not get deleted", dao.getRecipeInstruction(2));
    }

    @Test
    public void updateRecipeInstruction() throws Exception {
        RecipeInstruction recipeInstruction = dao.getRecipeInstruction(1);
        dao.updateRecipeInstruction(recipeInstruction);

        RecipeInstruction insertedRecipeInstruction = dao.getRecipeInstruction(1);
        assertEquals(recipeInstruction.getRecipeid(), insertedRecipeInstruction.getRecipeid());
        assertEquals(recipeInstruction.getInstruction(), insertedRecipeInstruction.getInstruction());
    }

    @After
    public void tearDown() throws Exception {
        if (newRecipeInstruction != 0) {
            dao.deleteRecipeInstruction(newRecipeInstruction);
        }
    }
}