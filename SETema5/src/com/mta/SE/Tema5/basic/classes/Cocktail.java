package com.mta.SE.Tema5.basic.classes;

import com.mta.SE.Tema5.basic.interfaces.IDrink;

/**
 * this is a class used for all cocktails
 * @author ADY
 * @since 2014-11-15
 */

public class Cocktail implements IDrink {
	
	/**
	 * shows how much alcohol a drink contains as percentage
	 */
	private int mAlcoholLevel;
	/**
	 * name of the cocktail
	 */
	private String mName;
    
	/**
	 * this is the constructor of the class
	 * @param drinkName name of a specific cocktail
	 */
	public Cocktail(String drinkName)
	{
		this.setmName(drinkName);
	    if(drinkName.equalsIgnoreCase("Sunrise"))
	    	this.setMalcoholLevel(23);
	    if(drinkName.equalsIgnoreCase("Mojito"))
	    	this.setMalcoholLevel(18);
	}
	
	@Override
	public void SpecifyQuantity(String customerChoice, int numberOfChoices) {
		if(customerChoice.equalsIgnoreCase("Sunrise"))
			System.out.println("Quantity of Sunrise cocktail required is "+numberOfChoices*0.3+"liters.");
		if(customerChoice.equalsIgnoreCase("Mojito"))
			System.out.println("Quantity of Mojito cocktail required is "+numberOfChoices*0.2+"liters.");
	}

	@Override
	public void CalculatePrice(float quantity, String chosenDrink) {
		if(chosenDrink.equalsIgnoreCase("Sunrise"))
			System.out.println("Price of Sunrise cocktail ordered is "+quantity*100+".");
		if(chosenDrink.equalsIgnoreCase("Mojito"))
			System.out.println("Price of Mojito cocktail ordered is "+quantity*200+".");
		
	}
	public int getMalcoholLevel() {
		return mAlcoholLevel;
	}
	public void setMalcoholLevel(int malcoholLevel) {
		this.mAlcoholLevel = malcoholLevel;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

}
