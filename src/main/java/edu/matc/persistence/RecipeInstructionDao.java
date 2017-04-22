package edu.matc.persistence;

import edu.matc.entity.RecipeInstruction;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hollister on 4/19/2017.
 */
public class RecipeInstructionDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * @return All Instructions
     */
    public List<RecipeInstruction> getAllRecipeInstructions() {
        List<RecipeInstruction> recipeInstructions = new ArrayList<RecipeInstruction>();
        Session session = null;
        try {
            session = getSession();
            recipeInstructions = session.createCriteria(RecipeInstruction.class).list();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return recipeInstructions;
    }

    /**
     * retrieve a recipe Instruction given their id
     *
     * @param id the Instruction id
     * @return recipeInstruction
     */
    public RecipeInstruction getRecipeInstruction(int id) {
        Session session = null;
        RecipeInstruction recipeInstruction = null;

        try {
            session = getSession();
            recipeInstruction = (RecipeInstruction) session.get(RecipeInstruction.class, id);
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return recipeInstruction;
    }

    /**
     * retrieve a recipe Instruction by recipe id
     *
     * @param recipeid the recipe id
     * @return recipeInstructions
     */
    public List<RecipeInstruction> getRecipeInstructionByRecipeId(int recipeid) {
        List<RecipeInstruction> recipeInstructions = new ArrayList<RecipeInstruction>();
        Session session = null;

        try {
            session = getSession();
            recipeInstructions = session.createQuery("from edu.matc.entity.RecipeInstruction r where r.recipeid = :recipeid")
                    .setInteger("recipeid", recipeid).list();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return recipeInstructions;
    }


    /**
     * add a recipe Instruction
     *
     * @param recipeInstruction
     * @return the id of the inserted record
     */
    public int addRecipeInstruction(RecipeInstruction recipeInstruction) {
        int id = 0;
        Session session = null;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(recipeInstruction);
            transaction.commit();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return id;
    }

    /**
     * delete a recipe Instruction by id
     * @param id the recipe Instruction id
     */
    public void deleteRecipeInstruction(int id) {
        Session session = null;
        RecipeInstruction recipeInstruction;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            recipeInstruction = (RecipeInstruction) session.get(RecipeInstruction.class, id);
            session.delete(recipeInstruction);
            transaction.commit();
        }catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    /**
     * Update the recipe Instruction
     * @param recipeInstruction
     */

    public void updateRecipeInstruction(RecipeInstruction recipeInstruction) {
        Session session = null;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            session.update(recipeInstruction);
            transaction.commit();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

}
