package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import edu.matc.persistence.UserDao;
import edu.matc.persistence.UserRoleDao;
import org.apache.log4j.Logger;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Created by hornb on 4/15/2017.
 */

@Path("/allUsers")
public class AllUsers {

    private final Logger log = Logger.getLogger(this.getClass());

    UserDao userDao = new UserDao();
    UserRoleDao userRoleDao = new UserRoleDao();

    @GET
    @Produces("text/plain")
    public Response getUsers() {
        List<User> userList = userDao.getAllUsers();
        String output = "";
        int userid;
        String firstName;
        String username;
        String userrole;

        for (User user : userList) {
            userid = user.getUserid();
            firstName = user.getFirstName();
            username = user.getUsername();
            userrole = userRoleDao.getUserRoleByUsername(username).getRole_name();

            output += "Userid: " + userid + " First Name: " + firstName + " Role: " + userrole + "\n";
        }

        return Response.status(200).entity(output).build();
    }


}
