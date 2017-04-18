package edu.matc.persistence;

import edu.matc.entity.UserRole;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.lang.System.out;
import static org.junit.Assert.*;

/**
 * Created on 9/13/16.
 *
 * @author hollister
 */
public class UserRoleDaoTest {

    UserRoleDao dao;
    int newRole = 0;

    @Before
    public void setup() {
        dao = new UserRoleDao();
    }

    @Test
    public void getAllUserRoles() throws Exception {
        List<UserRole> userrole = dao.getAllUserRoles();
        assertTrue(userrole.size() > 0);
    }

    @Test
    public void getUserRole() throws Exception {
        UserRole userrole = dao.getUserRole(1);
        assertEquals("getUserRole() is not working", "administrator", userrole.getRole_name());
    }

    @Test
    public void getUserRoleByUsername() throws Exception {
        UserRole userrole = dao.getUserRoleByUsername("heather");
        assertEquals("getUserRoleByUsername() is not working", "user", userrole.getRole_name());
    }

    @Test
    public void addUserRole() throws Exception {
        UserRole userrole = new UserRole("admin", "administrator");
        int newRole = dao.addUserRole(userrole);
        //assertEquals("addUser() is not working", user.getUserid(), dao.getUser(user.getUserid()));

        assertNotEquals(0, newRole);

        UserRole insertedUserRole = dao.getUserRole(1);
        assertEquals(userrole.getUser_name(), insertedUserRole.getUser_name());
        assertEquals(userrole.getRole_name(), insertedUserRole.getRole_name());
    }

    @Test
    public void deleteRole() throws Exception {
        dao.deleteRole(3);
        assertNull("user role did not get deleted", dao.getUserRole(3));
    }

    @After
    public void tearDown() throws Exception {
        if (newRole != 0) {
            dao.deleteRole(newRole);
        }
    }
}