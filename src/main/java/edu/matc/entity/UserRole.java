package edu.matc.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * A class to represent a user.
 *
 * @author Heather Hollister
 */
@Entity
@Table(name = "user_roles")
public class UserRole {

    @Column(name = "user_name")
    private String user_name;

    @Column(name = "role_name")
    private String role_name;

    //constructor
    public UserRole() {

    }

    /**
     * Instantiates a new User.
     *
     * @param user_name the user name
     * @param role_name  the role name
     */
    public UserRole(String user_name, String role_name) {
        this.user_name = user_name;
        this.role_name = role_name;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "user_name='" + user_name + '\'' +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
