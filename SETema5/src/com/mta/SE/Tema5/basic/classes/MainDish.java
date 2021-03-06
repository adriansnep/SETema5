package com.mta.SE.Tema5.basic.classes;

import java.util.List;

import com.mta.SE.Tema5.basic.interfaces.IFood;

/**
 * this is a class for all kinds of consistent food
 * @author ADY
 * @since 2014-11-15
 */
public class MainDish implements IFood{
	
	/**
	 * name of the food
	 */
	private String mName;
	
	/**
	 * this is the constructor of the class
	 * @param name name of a specific food
	 */
    public MainDish(String name)
    {
    	this.setmName(name);
    }
	@Override
	public void SpecifyQuantity(String customerChoice, int numberOfChoices) {
		if(customerChoice.equalsIgnoreCase("Pizza Salami"))
			System.out.println("Quantity of Pizza Salami required is "+numberOfChoices+"servings.");
		if(customerChoice.equalsIgnoreCase("Pizza Margherita"))
			System.out.println("Quantity of Pizza Margherita required is "+numberOfChoices+"servings.");
		
	}

	@Override
	public void CalculatePrice(List<String> ingredients,
			List<Integer> ingredientPrice, List<Integer> ingredientsQuantity) {
		int price=0;
		System.out.println("Ingredients contained: ");
		for(int i=0;i<ingredients.size();i++)
		{
			System.out.println(""+ingredients.get(i));
			price=price+ingredientPrice.get(i)*ingredientsQuantity.get(i)/1000;
		}
		System.out.println("Total price is: "+price);
	}

	@Override
	public int CookingTimeRequired(List<String> ingredients) {
		int timeRequired=0;
		if(ingredients.contains("carne"))
			timeRequired=timeRequired+20;
		if(ingredients.contains("paste"))
			timeRequired=timeRequired+15;
		if(ingredients.contains("morcovi"))
			timeRequired=timeRequired+5;
		if(ingredients.contains("varza"))
			timeRequired=timeRequired+10;
		if(ingredients.contains("cartofi"))
			timeRequired=timeRequired+20;
		return timeRequired;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}

}
