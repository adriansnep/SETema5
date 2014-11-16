package com.mta.SE.Tema5.basic.classes;

import com.mta.SE.Tema5.basic.interfaces.IDrink;


/**
 * this is a class for all kinds of whiskey
 * @author ADY
 * @since 2014-11-15
 */

public class Whiskey implements IDrink{
	
	/**
	 * name of the whiskey
	 */
	private String mName;
	
	/**
	 * this is the constructor of the class
	 * @param name name of a specific whiskey
	 */
	
	public Whiskey(String name)
	{
		this.setmName(name);
	}

	@Override
	public void SpecifyQuantity(String customerChoice, int numberOfChoices) {
		if(customerChoice.equalsIgnoreCase("Jack Daniels"))
			System.out.println("Quantity of Jack Daniels whiskey required is "+numberOfChoices*0.4+"liters.");
		if(customerChoice.equalsIgnoreCase("Red Label"))
			System.out.println("Quantity of Red Label whiskey required is "+numberOfChoices*0.4+"liters.");
		
	}

	@Override
	public void CalculatePrice(float quantity, String chosenDrink) {
		if(chosenDrink.equalsIgnoreCase("Jack Daniels"))
			System.out.println("Price of Jack Daniels whiskey ordered is "+quantity*30+".");
		if(chosenDrink.equalsIgnoreCase("Red Label"))
			System.out.println("Price of Red Label whiskey tea ordered is "+quantity*30+".");
		
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

}
