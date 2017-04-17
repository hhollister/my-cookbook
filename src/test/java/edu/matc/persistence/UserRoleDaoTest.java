package edu.matc.persistence;

import edu.matc.entity.UserRole;
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

    @Before
    public void setup() {
        dao = new UserRoleDao();
    }

    @Test
    public void getAllUserRoles() throws Exception {
        List<UserRole> userrole = dao.getAllUserRoles();
       // assertTrue(userrole.size() > 0);
        assertEquals("error", 1, userrole.size());

    }

/**
    @Test
    public void getUserRole() throws Exception {
        UserRoles userrole = dao.getUserRole("admin");
        assertEquals("getUserRole() is not working", "administrator", userrole.getUserrole());
    }

    @Test
    public void addUserRole() throws Exception {
        UserRoles userrole = new UserRoles("test", "user");
        int id = dao.addUserRole(userrole);
        //assertEquals("addUser() is not working", user.getUserid(), dao.getUser(user.getUserid()));

        assertNotEquals(0, id);

        UserRoles insertedUserRole = dao.getUserRole("test");
        assertEquals(userrole.getUsername(), insertedUserRole.getUsername());
        assertEquals(userrole.getUserrole(), insertedUserRole.getUserrole());
    }*/

}