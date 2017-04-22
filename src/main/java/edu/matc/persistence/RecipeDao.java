package edu.matc.persistence;

import edu.matc.entity.Recipe;
import edu.matc.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hollister on 4/19/2017.
 */
public class RecipeDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * @return All recipes
     */
    public List<Recipe> getAllRecipes() {
        List<Recipe> recipes = new ArrayList<Recipe>();
        Session session = null;
        try {
            session = getSession();
            recipes = session.createCriteria(Recipe.class).list();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return recipes;
    }

    /**
     * @return All recipes
     */
    public List<Recipe> getAllRecipesByUserId(int user_id) {
        List<Recipe> recipes = new ArrayList<Recipe>();
        Session session = null;
        try {
            session = getSession();
            Criteria criteria = session.createCriteria(Recipe.class);
            criteria.add(Restrictions.eq("user_id", user_id));
            recipes = criteria.list();
            //recipes = session.createQuery("from edu.matc.entity.Recipe r where r.user_id = :user_id")
              //      .setInteger("user_id", user_id).list();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return recipes;
    }

    /**
     * retrieve a recipe given the user and recipe name
     *
     * @param user_id the user id
     * @param recipe_name the recipe name
     * @return recipe id
     */
    public int getRecipeByUserAndRecipeName(int user_id, String recipe_name) {
        Session session = null;
        List<Recipe> recipes = new ArrayList<Recipe>();
        int recipeId = 0;

        try {
            session = getSession();
            Criteria criteria = session.createCriteria(Recipe.class);
            criteria.add(Restrictions.eq("user_id", user_id));
            criteria.add(Restrictions.eq("recipe_name", recipe_name));
            recipes = criteria.list();
            for (Recipe recipe : recipes) {
                recipeId = recipe.getRecipeid();
            }
            //recipe = (Recipe) session.createQuery("from edu.matc.entity.Recipe r where r.recipe_name = :recipe_name")
              //      .setString("recipe_name", recipe_name);
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return recipeId;
    }

    /**
     * retrieve a recipe given their id
     *
     * @param id the recipe id
     * @return recipe
     */
    public Recipe getRecipe(int id) {
        Session session = null;
        Recipe recipe = null;

        try {
            session = getSession();
            recipe = (Recipe) session.get(Recipe.class, id);
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return recipe;
    }


    /**
     * add a recipe
     *
     * @param recipe
     * @return the id of the inserted record
     */
    public int addRecipe(Recipe recipe) {
        int id = 0;
        Session session = null;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(recipe);
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
     * delete a recipe by id
     * @param id the recipe id
     */
    public void deleteRecipe(int id) {
        Session session = null;
        Recipe recipe;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            recipe = (Recipe) session.get(Recipe.class, id);
            session.delete(recipe);
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
     * Update the recipe
     * @param recipe
     */

    public void updateRecipe(Recipe recipe) {
        Session session = null;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            session.update(recipe);
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
