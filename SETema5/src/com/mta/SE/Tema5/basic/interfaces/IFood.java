package com.mta.SE.Tema5.basic.interfaces;

import java.util.List;

import com.mta.SE.Tema5.basic.exceptions.FoodException;



/**
 * implements methods for different kinds of food 
 * @author ADY
 * @since 2014-11-14
 */

public interface IFood {
	
	/**
	 * method used to establish quantity to be cooked in grams of a specific food
	 * @param customerChoice type of serving :little,medium,large
	 * @param numberOfChoices number of servings ordered from a specific food 
	 */
	public void SpecifyQuantity(String customerChoice,int numberOfChoices ) throws FoodException;
	
	/**
	 * method used to calculate price of a specific food 
	 * @param ingredients ingredients required to cook a specific food 
	 * @param ingredientPrice price of each ingredient required
	 * @param ingredientsQuantity quantity of each ingredient required in grams
	 */
	public void CalculatePrice(List<String> ingredients,List<Integer> ingredientPrice,List<Integer> ingredientsQuantity);
	
	/**
	 * method used to calculate time to cook for a specific food
	 * @param ingredients ingredients required to cook a specific food 
	 * @return time required to cook a specific food in minutes
	 */
	public int  CookingTimeRequired(List<String> ingredients) throws FoodException;

}
