package edu.matc.persistence;

import edu.matc.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created on 9/13/16.
 *
 * @author hollister
 */
public class UserDaoTest {

    UserDao dao;

    @Before
    public void setup() {
        dao = new UserDao();
    }

    @Test
    public void getAllUsers() throws Exception {
        List<User> users = dao.getAllUsers();
        assertTrue(users.size() > 0);
    }

    @Test
    public void getUser() throws Exception {
        User user = dao.getUser(17);
        assertEquals("getUser() is not working", "admin", user.getFirstName());
    }
/**
    @Test
    public void getUserByUsername() throws Exception {
        User user = dao.getUserByUsername("test");
        assertEquals("getUserByUsername() is not working", "test", user.getFirstName());
    }*/

    @Test
    public void addUser() throws Exception {
        User user = new User("test", "test@madisoncollege.edu", "test", "test");
        int id = dao.addUser(user);
        //assertEquals("addUser() is not working", user.getUserid(), dao.getUser(user.getUserid()));

        assertNotEquals(0, id);

        User insertedUser = dao.getUser(id);
        assertEquals(user.getFirstName(), insertedUser.getFirstName());
        assertEquals(user.getEmail(), insertedUser.getEmail());
    }

    @Test
    public void deleteUser() throws Exception {
        dao.deleteUser(18);
        assertNull("user did not get deleted", dao.getUser(18));
    }

    @Test
    public void updateUser() throws Exception {
        User user = dao.getUser(18);
        dao.updateUser(user);

        User insertedUser = dao.getUser(18);
        assertEquals(user.getFirstName(), insertedUser.getFirstName());
        assertEquals(user.getEmail(), insertedUser.getEmail());
    }

}