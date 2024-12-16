
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
     * The Main Object holds all of the data for the system and therefore
     * is called to recall information for other classes. The main also initializes
     * what is to be done when the system is first ran. 
     * 
     */
public class Main {
    
    /**
     * A RecipeDisplay Object to hold the current RD page being viewed
     */
    public RecipeDisplay recDis;
    
    /**
     * An array list to hold all of the users that are registered in the system
     */
    public static ArrayList<User> users = new ArrayList<>();
    
    /**
     * An array List to hold all of the recipes in the repository
     */
    public ArrayList<recipe> recipes = new ArrayList<>();
    
    /**
     * An array List to hold all of the recipes that users have requested
     * to be added into the main repository
     */
    public ArrayList<recipe> requestedRecipes = new ArrayList<>();
    
    
    
    /**
     * A User Object to hold the data of the currentUser logged in to the system
     */
    public User currentUser;
    
    /**
     * The Main Object holds all of the data for the system and therefore
     * is called to recall information for other classes. The main also initializes
     * what is to be done when the system is first ran. 
     * 
     */
    public Main() {
        // The users and recipes are loaded up into their respective arrays
        loadUsers();
        loadRecipes();
        
        // The program creates a new LogInPage and displays it
        openLogin(this);
        
        
    }
    
    /**
     * A method to load in all of the users from the text file. The loaded in users are
     * added to the private arrayList "users".
     * 
     */
    private void loadUsers() {
        try(Scanner fin = new Scanner(new File ("userSave.txt"))){
            while(fin.hasNextLine()) {
                // Split each line into an array of strings
                // The following is a map on indices to their respective element
                // 0 -> firstName, 1 -> userName, 2 -> password, 
                // 3 -> admin boolean, 4 -> moderator boolean
                String[] readStrs = fin.nextLine().split(" ");
                
                User u = new User(readStrs[1], readStrs[2]);
                
                if (readStrs[3].equalsIgnoreCase("1")) {
                    u.isAdmin = true;
                    u.isModerator = true;
                } else {
                    u.isAdmin = false;
                }
                
                if (readStrs[4].equalsIgnoreCase("1")) {
                    u.isModerator = true;
                } else {
                    u.isModerator = false;
                }
                
                u.setFirstName(readStrs[0]);
                // Add the user to the arrayList
                users.add(u);
            }
            
                
        } catch (Exception e) {
                e.printStackTrace();
        }
    }
    
    /**
     * A method to save all of the users to the text file. The saved users are written to userSave.txt.
     * 
     */
    public void saveUsers() {
        try {
            //
            FileWriter myWriter = new FileWriter("userSave.txt");
            // Writen line for a single user should follow the form:
            // firstname username password 1 1;
            for (User u: users) {
                String writenStr = u.getFirstName() + " " + u.getUsername() + " " + u.getPassword() + " ";
                if (u.isAdmin) {
                    writenStr += "1 ";
                } else {
                    writenStr += "0 ";
                }
                
                if (u.isModerator) {
                    writenStr += "1";
                } else {
                    writenStr += "0";
                }
                
                // Write the string and go to the next line
                myWriter.write(writenStr + "\n");
                
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } 
        
    }
    
    
    /**
     * A method to load in all of the recipes from the recipeSave.txt file and add
     * the loaded recipes into the repository arrayList "recipes".
     * 
     */
    private void loadRecipes() {
        try(Scanner fin = new Scanner(new File ("recipeSave.txt"))){
                while(fin.hasNextLine()) {
                    // Split each line into an array of strings
                    // The following is a map on indices to their respective element
                    // 0 -> dishName, 1 -> cookTime, 2 -> calories, 
                    // 3 -> cuisineType, 4 -> ingredient1 5 -> ingredient2 etc.
                    String[] readStrs = fin.nextLine().split(",");

                    // Initialize the ingredients arrayList and add each ingredient to it
                    ArrayList<String> ingredients = new ArrayList<>();
                    for (int i = 4; i < readStrs.length; i++) {
                        ingredients.add(readStrs[i]);
                    }
                    recipe rec = new recipe(readStrs[0], ingredients, Integer.parseInt(readStrs[1]), Integer.parseInt(readStrs[2]), readStrs[3]);
                    recipes.add(rec);
                }


            } catch (Exception e) {
                    e.printStackTrace();
            }
        }
    /**
     * A method to write all of the recipes in the repository to "recipeSave.txt"
     * .
     */
    public void saveRecipes() {
    try {
            //
            FileWriter myWriter = new FileWriter("recipeSave.txt");
            // Writen line for a single user should follow the form:
            // dishName,cookTime,calories,cuisineType,ingredient1,ingredient2,ingreient...
            for (recipe r: recipes) {
                String writenStr = r.getDishName() + "," + r.getCookTime() + "," + r.getCalories() + "," + r.getCuisineType();
                for (String i: r.getIngredients()) {
                    writenStr += "," + i;
                }
                
                
                // Write the string and go to the next line
                System.out.println(writenStr);
                myWriter.write(writenStr + "\n");
                System.out.println("Go");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }    
    }
    /**
     * A method to open the login page with a parameter of type Main, passing through all of our mains
     * data. 
     */
    private void openLogin(Main main) {
        
        LogInPage logInPage = new LogInPage(this);
        logInPage.setVisible(true);
    }
    
    /** A method for other classes to get the users ArrayList.
     * 
     * @return ArrayList users for use in other classes.
     */
    public ArrayList<User> getUsers() {
        return users;
    }
    
    /**
    * The main method simply calls the constructor
    * The constructor does all the work so that 
    * We do not have to bother with static references.
    */
    public static void main(String[] args) {
        Main main = new Main();
    }
    
}
