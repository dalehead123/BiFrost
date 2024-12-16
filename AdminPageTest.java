/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JList;
import javax.swing.ListModel;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author blake
 */
public class AdminPageTest {
    
    public AdminPageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    // Test for 7b.I.1 and 7c.I.1
    // Function: JList createViewableMenu(ArrayList arrList);
    // An arrayList of recipe objects will be used as a parameter
    // for a function createViewableMenu() 
    // which will create a JList with each value from the array added to it
    @Test
    public void testCreateViewableMenu() {
        ArrayList<String> ingredients1 = new ArrayList<String>();
        ingredients1.add("Potatoes");
        ingredients1.add("Cheese");
        ingredients1.add("Crackers");
        recipe rec1 = new recipe("Soup", ingredients1, 20, 500, "French");
        
        ArrayList<String> ingredients2 = new ArrayList<String>();
        ingredients2.add("Potatoes");
        ingredients2.add("Oil");
        ingredients2.add("Salt");
        recipe rec2 = new recipe("Fries", ingredients2, 10, 1000, "American");
        
        ArrayList<recipe> requestedRecs = new ArrayList<>();
        requestedRecs.add(rec1);
        requestedRecs.add(rec2);
        
        Main main = new Main();
        AdminPage ap = new AdminPage(main);
        // Subject Being Tested
        JList reqMenu = ap.createViewableMenu(requestedRecs);
        
        // Ensure the elements of reqMenu equal what they should
        ListModel model = reqMenu.getModel();
        for (int i = 0; i < 2; i++) {
            recipe actual = (recipe) model.getElementAt(i);
            recipe desired = requestedRecs.get(i);
            assertEquals(actual, desired);
            
        }
    }

    // Test for 7b.I.2 and 7c.I.2
    // Function: int select(JList list);
    // The function to be tested should be inserted into action listeners 
    // and return the currentSelected index from the JList parameter
    @Test
    public void testSelect() {
        ArrayList<String> ingredients3 = new ArrayList<String>();
        ingredients3.add("Rice");
        ingredients3.add("Tuna");
        ingredients3.add("SoyPaper");
        recipe rec3 = new recipe("Sushi", ingredients3, 20, 800, "Japanese");
        
        ArrayList<String> ingredients4 = new ArrayList<String>();
        ingredients4.add("Dough");
        ingredients4.add("Cheese");
        ingredients4.add("Peperoni");
        recipe rec4 = new recipe("Pizza", ingredients4, 30, 1300, "Italian");
        
        recipe[] recs = new recipe[2];
        recs[0] = rec3;
        recs[1] = rec4;
        Main main = new Main();
        JList list = new JList(recs);
        AdminPage ap = new AdminPage(main);
        assertEquals(list.getSelectedIndex(), ap.select(list));
    }
    
    // Test for 7b.II.1 and Test for 7b.II.2
    // Function: boolean approve(recipe rec);
    // The function takes a recipe parameter and adds it
    // to the main recipe repository in the main class
    @Test
    public void testApprove() {
        
        ArrayList<String> ingredients1 = new ArrayList<String>();
        ingredients1.add("Potatoes");
        ingredients1.add("Cheese");
        ingredients1.add("Crackers");
        recipe rec1 = new recipe("Soup", ingredients1, 20, 500, "French");
        
        ArrayList<String> ingredients2 = new ArrayList<String>();
        ingredients2.add("Potatoes");
        ingredients2.add("Oil");
        ingredients2.add("Salt");
        recipe rec2 = new recipe("Fries", ingredients2, 10, 1000, "American");
        
        ArrayList<String> ingredients4 = new ArrayList<String>();
        ingredients4.add("Dough");
        ingredients4.add("Cheese");
        ingredients4.add("Peperoni");
        recipe rec4 = new recipe("Pizza", ingredients4, 30, 1300, "Italian");
        
        Main main = new Main();
        
        main.requestedRecipes = new ArrayList<recipe>();
        main.requestedRecipes.add(rec1);
        main.requestedRecipes.add(rec2);
        
        AdminPage ap = new AdminPage(main);
        // The boolean should be true when a recipe is successfully transfered 
        // And false when not
        assertTrue(ap.approve(rec1));
        assertTrue(ap.approve(rec2));
        assertFalse(ap.approve(rec4));
        
        // The recipes that were transferred should now be in the recipes ArrayList 
        // and not the requested ArrayList
        assertTrue(main.recipes.contains(rec1));
        assertTrue(main.recipes.contains(rec2));
        assertFalse(main.requestedRecipes.contains(rec1));
        assertFalse(main.requestedRecipes.contains(rec2));
        
        // The recipes that were not transfered shoulds not be in the recipes ArrayList
        // and should still be in the requested ArrayList
        assertFalse(main.recipes.contains(rec4));
          
        
    }
    
    // Test for 7.b.II.3 && 7.c.II.2
    // Function: void save(ArrayList<recipe> recs);
    // This function takes an arrayList parameter and saves
    // all recipes in said arrayList to the save file
//    @Test
//    public void testSave() {
//        ArrayList<recipe> recipeDesired = new ArrayList<>();
//        
//        ArrayList<String> ingredients3 = new ArrayList<String>();
//        ingredients3.add("Rice");
//        ingredients3.add("Tuna");
//        ingredients3.add("SoyPaper");
//        recipe rec3 = new recipe("Sushi", ingredients3, 20, 800, "Japanese");
//        
//        ArrayList<String> ingredients4 = new ArrayList<String>();
//        ingredients4.add("Dough");
//        ingredients4.add("Cheese");
//        ingredients4.add("Peperoni");
//        recipe rec4 = new recipe("Pizza", ingredients4, 30, 1300, "Italian");
//        
//        recipeDesired.add(rec4);
//        recipeDesired.add(rec3);
//        Main main = new Main();
//        AdminPage ap = new AdminPage(main);
//        ap.save();
//        
//        // Create an arrayList for the text file to be loaded into
//        ArrayList<recipe> recipeActual = new ArrayList<>();
//        try(Scanner fin = new Scanner(new File ("C:\\Users\\blake\\Desktop\\recipeSave.txt"))){
//                
//                while(fin.hasNextLine()) {
//                    // Split each line into an array of strings
//                    // The following is a map on indices to their respective element
//                    // 0 -> dishName, 1 -> cookTime, 2 -> calories, 
//                    // 3 -> cuisineType, 4 -> ingredient1 5 -> ingredient2 etc.
//                    String[] readStrs = fin.nextLine().split(",");
//
//                    // Initialize the ingredients arrayList and add each ingredient to it
//                    ArrayList<String> ingredients = new ArrayList<>();
//                    for (int i = 4; i < readStrs.length; i++) {
//                        ingredients.add(readStrs[i]);
//                    }
//                    recipe rec = new recipe(readStrs[0], ingredients, Integer.parseInt(readStrs[1]), Integer.parseInt(readStrs[2]), readStrs[3]);
//                    
//                    recipeActual.add(rec);
//                }
//
//
//            } catch (Exception e) {
//                    e.printStackTrace();
//            }
//        
//        // Insure that the loaded arrayList from the text file matches the one that was saved
//        for (int i = 0; i < recipeActual.size() && i < recipeDesired.size(); i++) {        
//            assertEquals(recipeActual.get(i), recipeDesired.get(i));
//        }
//        
//        
//        }
   
    // Test for 7c.II.1
    // Function: boolean remove(recipe rec);
    // This function attempts to remove the recipe parameter 
    // from the main recipe repository; returns true if it does
    // returns false if it does not
//    @Test
//    public void testRemove() {
//        ArrayList<String> ingredients1 = new ArrayList<String>();
//        ingredients1.add("Potatoes");
//        ingredients1.add("Cheese");
//        ingredients1.add("Crackers");
//        recipe rec1 = new recipe("Soup", ingredients1, 20, 500, "French");
//        
//        ArrayList<String> ingredients2 = new ArrayList<String>();
//        ingredients2.add("Potatoes");
//        ingredients2.add("Oil");
//        ingredients2.add("Salt");
//        recipe rec2 = new recipe("Fries", ingredients2, 10, 1000, "American");
//        
//        ArrayList<String> ingredients4 = new ArrayList<String>();
//        ingredients4.add("Dough");
//        ingredients4.add("Cheese");
//        ingredients4.add("Peperoni");
//        recipe rec4 = new recipe("Pizza", ingredients4, 30, 1300, "Italian");
//        
//        // Create a new main and therefore a new repository
//        Main main = new Main();
//        
//        // Add recipes to the repository
//        main.recipes = new ArrayList<recipe>();
//        main.recipes.add(rec1);
//        main.recipes.add(rec2);
//        
//        // Create a new admin page based off of the main configuration
//        AdminPage ap = new AdminPage(main);
//        
//        // Ensure that the recipes that are in the repository are 
//        // successfully removed
//        assertTrue(ap.remove(rec1));
//        assertTrue(ap.remove(rec2));
//        assertFalse(ap.remove(rec4));
//        
//        // Ensure that removed recipes are not contained in 
//        // the repository
//        assertFalse(main.recipes.contains(rec1));
//        assertFalse(main.recipes.contains(rec2));
//        
//        
//        
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }

