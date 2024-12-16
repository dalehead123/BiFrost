/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author blake
 */
public class User {
    
    // stores the first name of the user
    private String firstName;
    // stores the username of a user
    private String username;
    // sotes the password of a user
    private String password;
    // stores whether a user is an admin or not
    public boolean isAdmin;
    // stores whether a user is a moderator or not
    public boolean isModerator;
    
    /**
    * this constructor creates a new user that has a username and password and stores that data
    * @param username takes in the username
    * @param password takes in the password
    */
    public User(String username, String password) {
        this.username = username;
        this.password = password;    
    }
    
    // GETTERS AND SETTERS
    /**
    * returns the username of the user
    * @param none
    * @return username returns the username string
    */
    public String getUsername() {
        return username;
    }
    
    /**
    * this method checks to see if the user is an admin, and if they are they also have moderator privileges
    * @param none
    * @return none
    */
    public void reconfigurePrivledges() {
        if (isAdmin) {
            isModerator = true;
        }
    }
    
    /**
    * this method sets the username string to the new user
    * @param username string
    * @return none
    */
    public void setUsername(String username) {
        this.username = username;
    }
    
    /**
    * this gives us the password that was entered
    * @param none
    * @return password returns the password of the user
    */
    public String getPassword() {
        return password;
    }
    
    /**
    * this gives us the first name of the user
    * @param none
    * @return firstName returns the first name of the user
    */
    public String getFirstName() {
        return firstName;
    }
    
    /**
    * this method sets the user's first name string to the new user
    * @param firstName string
    * @return none
    */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    /**
    * this method sets the user's password string to the new password
    * @param password string
    * @return none
    */
    public void setPassword(String password) {
        this.password = password;
    }
    // END GETTERS AND SETTERS
    
    
}
