package edu.matc.persistence;

import edu.matc.entity.User;
import org.junit.After;
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
    int newUser = 0;

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

    @Test
    public void getUserByUsername() throws Exception {
        User user = dao.getUserByUsername("admin");
        assertEquals("getUserByUsername() is not working", "admin", user.getFirstName());
    }

    @Test
    public void addUser() throws Exception {
        User user = new User("test", "test@madisoncollege.edu", "test", "test");
        newUser = dao.addUser(user);
        //assertEquals("addUser() is not working", user.getUserid(), dao.getUser(user.getUserid()));

        assertNotEquals(0, newUser);

        User insertedUser = dao.getUser(newUser);
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
        User user = dao.getUser(17);
        dao.updateUser(user);

        User insertedUser = dao.getUser(17);
        assertEquals(user.getFirstName(), insertedUser.getFirstName());
        assertEquals(user.getEmail(), insertedUser.getEmail());
    }

    @After
    public void tearDown() throws Exception {
        if (newUser != 0) {
            dao.deleteUser(newUser);
        }
    }
}