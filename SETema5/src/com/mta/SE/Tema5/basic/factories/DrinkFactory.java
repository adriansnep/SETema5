package com.mta.SE.Tema5.basic.factories;

import com.mta.SE.Tema5.basic.classes.Cocktail;
import com.mta.SE.Tema5.basic.classes.Juice;
import com.mta.SE.Tema5.basic.classes.Tea;
import com.mta.SE.Tema5.basic.classes.Whiskey;
import com.mta.SE.Tema5.basic.interfaces.IDrink;
import com.mta.SE.Tema5.basic.interfaces.IFood;

/**
 * abstract class used to create a factory of type drink
 * @author ADY
 * @since 2014-11-14
 */
public class DrinkFactory extends AbstractFactory{

	@Override
	IFood getFood(String foodType) {
		
		return null;
	}

	@Override
	IDrink getDrink(String drinkType) {
		if(drinkType==null)
			return null;
		if(drinkType.equalsIgnoreCase("Whiskey"))
			return new Whiskey("Red Label");
		if(drinkType.equalsIgnoreCase("Tea"))
			return new Tea("Chun Mee","green");
		if(drinkType.equalsIgnoreCase("Juice"))
			return new Juice("Fanta");
		if(drinkType.equalsIgnoreCase("Cocktail"))
			return new Cocktail("Sunrise");
		return null;
	}

}
