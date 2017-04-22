package edu.matc.persistence;

import edu.matc.entity.Recipe;
import edu.matc.entity.RecipeIngredient;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hollister on 4/19/2017.
 */
public class RecipeIngredientDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * @return All ingredients
     */
    public List<RecipeIngredient> getAllRecipeIngredients() {
        List<RecipeIngredient> recipeIngredients = new ArrayList<RecipeIngredient>();
        Session session = null;
        try {
            session = getSession();
            recipeIngredients = session.createCriteria(RecipeIngredient.class).list();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return recipeIngredients;
    }

    /**
     * retrieve a recipe ingredient given their id
     *
     * @param id the ingredient id
     * @return recipeIngredient
     */
    public RecipeIngredient getRecipeIngredient(int id) {
        Session session = null;
        RecipeIngredient recipeIngredient = null;

        try {
            session = getSession();
            recipeIngredient = (RecipeIngredient) session.get(RecipeIngredient.class, id);
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return recipeIngredient;
    }

    /**
     * retrieve a recipe ingredient by recipe id
     *
     * @param recipeid the recipe id
     * @return recipeIngredients
     */
    public List<RecipeIngredient> getRecipeIngredientByRecipeId(int recipeid) {
        List<RecipeIngredient> recipeIngredients = new ArrayList<RecipeIngredient>();
        Session session = null;

        try {
            session = getSession();
            recipeIngredients = session.createQuery("from edu.matc.entity.RecipeIngredient r where r.recipeid = :recipeid")
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

        return recipeIngredients;
    }


    /**
     * add a recipe ingredient
     *
     * @param recipeIngredient
     * @return the id of the inserted record
     */
    public int addRecipeIngredient(RecipeIngredient recipeIngredient) {
        int id = 0;
        Session session = null;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(recipeIngredient);
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
     * delete a recipe ingredient by id
     * @param id the recipe ingredient id
     */
    public void deleteRecipeIngredient(int id) {
        Session session = null;
        RecipeIngredient recipeIngredient;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            recipeIngredient = (RecipeIngredient) session.get(RecipeIngredient.class, id);
            session.delete(recipeIngredient);
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
     * Update the recipe ingredient
     * @param recipeIngredient
     */

    public void updateRecipeIngredient(RecipeIngredient recipeIngredient) {
        Session session = null;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            session.update(recipeIngredient);
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
