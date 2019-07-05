package com.bawarchi.model;


public class Dishes {
	private int id;
	private String name;
	private double price;
	private double calories;
	
	public Dishes(int id,String name,double price,double calories)
	{
		this.id = id;
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	public double getPrice() {
		return price;
	}

	public double getCalories() {
		return calories;
	}

	public String toString()
	{
		return "\nDish Id: "+ id +"            name: "+ name +"                 Price: " + price+"      "
				+ "         Calories: " + calories;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj == this)
				return true;
		if(obj == null || obj.getClass() != this.getClass())
			return false;
		
		Dishes dish = (Dishes) obj;
		
		return id == dish.getId() && price == dish.getPrice() && calories == dish.getCalories() && 
				(name == dish.getName() || (name != null && name.equals(dish.getName())));
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 97;
		int result = 1;
		result = prime*result + ((name == null) ? 0 : name.hashCode());
		result = prime*result + id;
		result = (int) (prime*result + price);
		result = (int) (prime*result + calories);
		
		return result;
		
	}
	
}
