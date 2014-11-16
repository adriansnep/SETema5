package com.mta.SE.Tema5.basic.factories;

import com.mta.SE.Tema5.basic.classes.Dessert;
import com.mta.SE.Tema5.basic.classes.MainDish;
import com.mta.SE.Tema5.basic.interfaces.IDrink;
import com.mta.SE.Tema5.basic.interfaces.IFood;


/**
 * abstract class used to create a factory of type food 
 * @author ADY
 * @since 2014-11-14
 */
public class FoodFactory extends AbstractFactory{

	@Override
	IFood getFood(String foodType) {
		if(foodType==null)
			return null;
		if(foodType.equalsIgnoreCase("MainDish"))
			return new MainDish("Pizza Salami");
		if(foodType.equalsIgnoreCase("Dessert"))
			return new Dessert("Savarin");
		if(foodType.equalsIgnoreCase("Soup"))
			return new MainDish("Barley");
		return null;
	}

	@Override
	IDrink getDrink(String drinkType) {
		
		return null;
	}

	

}
