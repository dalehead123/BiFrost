import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class recipe {

	public static final int DEFAULT_CAPACITY = 5;
	private String [] comment;
	private ArrayList<String> ingredients;
	private int cookTime;
	private int calories;
	private String dishName;
	private String cuisineType;
        
        /**
	* this constructor stores all of the recipe inputs
	* @param Dishname,ingredients,cookTime,calories,cuisineType
	* @return none
	*/
	public recipe(String dishName, ArrayList<String> ingredients,int cookTime, int calories, String cuisineType /*, String [] comment*/ ) 

    { 
	this.dishName = dishName;
		
        this.ingredients = ingredients; 

        this.cookTime = cookTime; 

        this.calories = calories;

        this.cuisineType = cuisineType;
        
        //this.comment = comment;

    } 
	// get methods
        // get methods
	/**
	* this method gives us the ingredients to a recipe
	* @param none
	* @return ingredients
	*/
	public ArrayList<String> getIngredients() {  return ingredients; }
        
        /**
	* this method gives us the dishName to a recipe
	* @param none
	* @return dishName
	*/
	public String getDishName() {  return dishName; }
	
        /**
	* this method gives us the cooktime to a recipe
	* @param none
	* @return cookTime
	*/
	public int getCookTime() {  return cookTime; } 
	
        /**
	* this method gives us the cuisine type to a recipe
	* @param none
	* @return cuisineType
	*/
	public String getCuisineType() { return cuisineType; } 
	
        /**
	* this method gives us the calories to a recipe
	* @param none
	* @return calories
	*/
	public int getCalories() {  return calories; }
	
	//public String [] getComment() { return comment; }
	
	//set methods
        /**
	* this method stores all of the inputted ingredients
	* @param ingredients
	* @return none
	*/
	public void setIngredients(ArrayList<String> ingredients) {  this.ingredients = ingredients;}
	
        /**
	* this method stores the inputted cook time
	* @param cookTime
	* @return none
	*/
	public void setCookTime(int cookTime ) {  this. cookTime = cookTime ; }
	
        /**
	* this method stores the inputted cuisine type
	* @param cuisineType
	* @return none
	*/
	public void setCuisineType(String cuisineType ) {  this. cuisineType = cuisineType ; }
	
        /**
	* this method stores the inputted calories
	* @param calories
	* @return none
	*/
	public void setCalories(int calories) {  this. calories =  calories; }
        
        /**
	* this method prints out the whole recipe
        * into a string
	* @param none
	* @return none
	*/
        public String toString() {
            String retStr = dishName + " " + cookTime + " " + calories + " " + cuisineType;
            for (String i : ingredients) {
                retStr += " " + i;
            }
            return retStr;
            
        }
	
	//public void setComment(String[] comment ) {  this. comment = comment ; }
	
}
