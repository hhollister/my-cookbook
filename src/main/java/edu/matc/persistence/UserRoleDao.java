package edu.matc.persistence;

import edu.matc.entity.UserRole;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hollister on 4/15/2017.
 */
public class UserRoleDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /** Return a list of all users
     *
     * @return All users
     */
    public List<UserRole> getAllUserRoles() {
        List<UserRole> userrole = new ArrayList<UserRole>();
        Session session = null;
        try {
            session = getSession();
            userrole = session.createCriteria(UserRole.class).list();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return userrole;
    }

    /**
     * retrieve a user given their id
     *
     * @param id the id
     * @return userrole
     */
    public UserRole getUserRole(int id) {
        Session session = null;
        UserRole userrole = null;

        try {
            session = getSession();
            userrole = (UserRole) session.get(UserRole.class, id);
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return userrole;
    }


    /**
     * retrieve a user given their username
     *
     * @param username the user's name
     * @return user
     */
    public UserRole getUserRoleByUsername(String username) {
        Session session = null;
        UserRole userrole = null;

        try {
            session = getSession();
            userrole = (UserRole) session.createQuery("from edu.matc.entity.UserRole u where u.user_name = :username")
                    .setString("username", username)
                    .uniqueResult();
        } catch (HibernateException he) {
            log.error("exception: " + he);
        } catch (Exception e) {
            log.error("Exception: " + e.getMessage());
        } finally {
            if (session != null) {
                session.close();
            }
        }

        return userrole;
    }


    /**
     * add a user
     *
     * @param userrole
     * @return the id of the inserted record
     */
    public int addUserRole(UserRole userrole) {
        int id = 0;
        Session session = null;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            id = (int) session.save(userrole);
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
     * delete a user by id
     * @param id the user's id
     */
    public void deleteRole(int id) {
        Session session = null;
        UserRole userrole;

        try {
            session = getSession();
            Transaction transaction = session.beginTransaction();
            userrole = (UserRole) session.get(UserRole.class, id);
            session.delete(userrole);
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

    private Session getSession() {
        return SessionFactoryProvider.getSessionFactory().openSession();
    }

}
