package com.mta.SE.Tema5.basic.factories;

import com.mta.SE.Tema5.basic.interfaces.IDrink;
import com.mta.SE.Tema5.basic.interfaces.IFood;

/**
 * abstract class used to get factories 
 * @author ADY
 * @since 2014-11-14
 */
public abstract class AbstractFactory {
	
	/**
	 * method used to get a specific object of type food
	 * @return an object of type food 
	 */
	abstract IFood getFood(String foodType);
	
	/**
	 * method used to get a specific object of type drink
	 * @return
	 */
	abstract IDrink getDrink(String drinkType);

}
