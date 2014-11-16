package com.mta.SE.Tema5.basic.interfaces;

import com.mta.SE.Tema5.basic.exceptions.DrinkException;


/**
 * implements methods for different kinds of drink
 * @author ADY
 * @since 2014-11-14
 */
public interface IDrink {

	/**
	 * method used to establish quantity to be cooked in grams of a specific food
	 * @param customerChoice type of serving :little,medium,large
	 * @param numberOfChoices number of servings ordered from a specific food 
	 */
	public void SpecifyQuantity(String customerChoice,int numberOfChoices ) throws DrinkException;
	
	/**
	 * method used to calculate price for a specific drink
	 * @param quantity quantity of a drink in liters
	 * @param chosenDrink name of chosen drink
	 */
	public void CalculatePrice(float quantity,String chosenDrink); 
}
