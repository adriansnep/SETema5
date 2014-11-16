package com.mta.SE.Tema5.basic.classes;

import com.mta.SE.Tema5.basic.interfaces.IDrink;

/**
 * this is a class for all juices
 * @author ADY
 * @since 2014-11-15
 */
public class Juice implements IDrink{
	/**
	 * name of the juice
	 */
	private String mName;
	
	/**
	 * this is the constructor of the class
	 * @param name name of a specific juice
	 */
	public Juice(String name)
	{
		this.setmName(name);
	}

	@Override
	public void SpecifyQuantity(String customerChoice, int numberOfChoices) {
		
		if(customerChoice.equalsIgnoreCase("Fanta"))
			System.out.println("Quantity of Fanta juice required is "+numberOfChoices*0.3+"liters.");
		if(customerChoice.equalsIgnoreCase("CocaCola"))
			System.out.println("Quantity of CocaCola juice required is "+numberOfChoices*0.2+"liters.");
	}

	@Override
	public void CalculatePrice(float quantity, String chosenDrink) {
		if(chosenDrink.equalsIgnoreCase("Fanta"))
			System.out.println("Price of Fanta juice ordered is "+quantity*10+".");
		if(chosenDrink.equalsIgnoreCase("Mojito"))
			System.out.println("Price of CocaCola juice ordered is "+quantity*10+".");
		
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

}
