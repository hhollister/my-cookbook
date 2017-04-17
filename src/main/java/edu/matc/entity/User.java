package edu.matc.entity;

import edu.matc.util.LocalDateAttributeConverter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * A class to represent a user.
 *
 * @author Heather Hollister
 */
@Entity
@Table(name = "users")
public class User {

    @Column(name = "first_name")
    private String firstName;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int userid;

    @Column(name = "email")
    private String email;

    @Column(name = "user_name")
    private String username;

    @Column(name = "user_pass")
    private String password;

    //constructor
    public User() {

    }

    /**
     * Instantiates a new User.
     *
     * @param firstName the first name
     * @param email  the email
     * @param username the user name
     * @param password the users password
     */
    public User(String firstName, String email, String username, String password) {
        this.firstName = firstName;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    /**
     * Gets first name.
     *
     * @return the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets first name.
     *
     * @param firstName the first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets userid.
     *
     * @return the userid
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Sets userid.
     *
     * @param userid the userid
     */
    public void setUserid(int userid) {
        this.userid = userid;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", userid='" + userid + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}
