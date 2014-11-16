package com.mta.SE.Tema5.basic.factories;

import java.util.ArrayList;
import java.util.List;

import com.mta.SE.Tema5.basic.exceptions.DrinkException;
import com.mta.SE.Tema5.basic.exceptions.FoodException;
import com.mta.SE.Tema5.basic.interfaces.IDrink;
import com.mta.SE.Tema5.basic.interfaces.IFood;

/**
 * this is the main class which is used to model a restaurant
 * @author ADY
 * @since 20114-11-14
 */

public class AbstractFactoryPatternDemo {

	/**
	 * method that perform the main functions of the program
	 * @param args used for call from command line
	 */
	public static void main(String[] args) {
		
		  //get food factory
	      AbstractFactory foodFactory = FactoryProducer.getFactory("Food");

	      //get an object of type food
	      IFood food1=null;
		try {
			food1 = foodFactory.getFood("MainDish");
		} catch (Exception e3) {
			System.out.println("Exception:"+e3.getMessage());
			e3.printStackTrace();
		}

	      //call draw method of food MainDish
	      List<String> ingredients=null;
		try {
			ingredients = new ArrayList<String>();
			  ingredients.add("morcovi");
			  ingredients.add("carne");
			  int timeRequired=food1.CookingTimeRequired(ingredients);
			  System.out.println("Time required to cook main dish is "+timeRequired);
		} catch (FoodException e2) {
			System.out.println("Exception:"+e2.getMessage());
			e2.printStackTrace();
		}

	      //get an object of food 
	      IFood food2=null;
		try {
			food2 = foodFactory.getFood("Dessert");
		} catch (Exception e2) {
			System.out.println("Exception:"+e2.getMessage());
			e2.printStackTrace();
		}

	      //call draw method of food dessert
	      try {
			List<Integer> ingredientPrice = new ArrayList<Integer>();
			  ingredientPrice.add(12);
			  ingredientPrice.add(13);
			  List<Integer> ingredientsQuantity = new ArrayList<Integer>();
			  ingredientsQuantity.add(100);
			  ingredientsQuantity.add(140);
			  food2.CalculatePrice(ingredients, ingredientPrice, ingredientsQuantity);
		} catch (Exception e2) {
			System.out.println("Exception:"+e2.getMessage());
			e2.printStackTrace();
		}
	      
	      //get drink factory
	      AbstractFactory drinkFactory=null;
		try {
			drinkFactory = FactoryProducer.getFactory("Drink");
		} catch (Exception e2) {
			System.out.println("Exception:"+e2.getMessage());
			e2.printStackTrace();
		}

	      //get an object of drink type
	      IDrink drink1=null;
	      
		try {
			drink1 = drinkFactory.getDrink("Juice");
		} catch (Exception e1) {
			System.out.println("Exception:"+e1.getMessage());
			e1.printStackTrace();
		}

	      //call method
	      
	      try {
			drink1.SpecifyQuantity("Fanta", 3);
		} catch (DrinkException e) {
			System.out.println("Exception:"+e.getMessage());
			e.printStackTrace();
		}
	    
	      //get an object of Color Green
	     IDrink drink2=null;
		try {
			drink2 = drinkFactory.getDrink("Whiskey");
		} catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
			e.printStackTrace();
		}

	      //call method
	      try {
			drink2.CalculatePrice(2, "Fanta");
		} catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
			e.printStackTrace();
		}

	}

}
