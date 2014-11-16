package com.mta.SE.Tema5.basic.factories;

/**
 * this class is used to create a factory of a specific class
 * @author ADY
 * @since 2014-11-14
 */

public class FactoryProducer {
	
   /**
    * this method is used create specific factories
    * @param choice factory name
    * @return an object of a specific factory
    */
	 public static AbstractFactory getFactory(String choice){
	      if(choice.equalsIgnoreCase("Food")){
	         return new FoodFactory();
	      } else if(choice.equalsIgnoreCase("Drink")){
	         return new DrinkFactory();
	      }
	      return null;
	   }
}

