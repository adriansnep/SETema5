package com.mta.SE.Tema5.basic.classes;

import com.mta.SE.Tema5.basic.interfaces.IDrink;

/**
 * this is a class for all kinds of tea
 * @author ADY
 * @since 2014-11-15
 */
public class Tea implements IDrink{

	/**
	 * name of the cocktail
	 */
	private String mName;
	
	/**
	 * specifies type of tea:green,black
	 */
	private String mType;
	/**
	 * this is the constructor of the class
	 * @param name name of a specific tea
	 */
	public Tea(String name,String type)
	{
		this.setmType(type);
		this.setmName(name);
	}
	@Override
	public void SpecifyQuantity(String customerChoice, int numberOfChoices) {
		if(customerChoice.equalsIgnoreCase("Eyebrow"))
			System.out.println("Quantity of Eyebrow tea required is "+numberOfChoices*0.5+"liters.");
		if(customerChoice.equalsIgnoreCase("Chun Mee"))
			System.out.println("Quantity of Chun Mee tea required is "+numberOfChoices*0.5+"liters.");
		
	}

	@Override
	public void CalculatePrice(float quantity, String chosenDrink) {
		if(chosenDrink.equalsIgnoreCase("Eyebrow"))
			System.out.println("Price of Eyebrow tea ordered is "+quantity*30+".");
		if(chosenDrink.equalsIgnoreCase("Chun Mee"))
			System.out.println("Price of Chun Mee tea ordered is "+quantity*30+".");
		
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getmType() {
		return mType;
	}
	public void setmType(String mType) {
		this.mType = mType;
	}

}
