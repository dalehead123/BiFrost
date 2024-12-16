import java.util.ArrayList;
import java.util.Scanner;

public class recipes {
	public static ArrayList<recipe> dishList = new ArrayList<recipe>();
	public static  void add(){

	       boolean flag = false;

	       System.out.println("add a recipe \n");

	       System.out.println("Please type in name of the dish");

	       Scanner input = new Scanner(System.in);
	       

	       String dishName = input.next();
	       
	       //fishinput.close();

	       for(int i=0;i<dishList.size();i++){

	           if(dishList.get(i).getDishName().equalsIgnoreCase(dishName)){

	              System.out.println("This dish is already in the recipes");

	              flag = true;

	              break;

	           }

	       }

	       if(!flag){
	    	   
	    	   System.out.println("what is the colories");
		       Scanner inputColories = new Scanner(System.in);
		       int colories = inputColories.nextInt();
		       //inputColories.close();
	    	   
		       
		       System.out.println("what is the cookTime");
		       Scanner inputCookTime = new Scanner(System.in);
		       int cookTime = inputCookTime.nextInt();
		       //inputCookTime.close();
		       
		       System.out.println("what is the cuisineType");
		       Scanner inputCuisineType = new Scanner(System.in);
		       String cuisineType = inputCuisineType.next();
		       //inputCuisineType.close();
		       
		       System.out.println("please type in ingredients of the dish, type stop to stop");
		       ArrayList<String> ingridents = new ArrayList<String>();
		       addingredients( ingridents, 1);
		       //String dishName, ArrayList<String> ingredients,int cookTime, int colories, String cuisineType, String [] comment
	           recipe oneRecipe = new recipe(dishName, ingridents, cookTime,colories, cuisineType  );

	           dishList.add(oneRecipe);

	           System.out.println("success add "+ dishName +" to the website");

	       }

	       System.out.println("*************************************************");

	    }
	public void search(){}
	
	public static void addingredients(ArrayList<String> ingridients,int ingredientNumber){
		System.out.println("what is the "+ ingredientNumber+ "th ingrident");
		Scanner inputIngredient = new Scanner(System.in);
	    String ingridient = inputIngredient.next();
	    //inputIngredient.close();
	    // stop if type in stop
	    if (ingridient.equals("stop") ) {
	    	return;
	    }
	    // continue to type in if the input is not stop
		ingridients.add(ingridient);
		addingredients(ingridients, ingredientNumber+1);
		
		return;
		
	}
	
//	public static void main(String[] args) {
//
//	       add();
//
//	}
        
        
		
}
