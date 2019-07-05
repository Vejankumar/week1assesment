package com.bawarchi.comparators;

import java.util.Comparator;

import com.bawarchi.model.Dishes;


public class Comparators {
	public static Comparator<Dishes> getComparator(int type)
	{
		switch(type)
		{
		case 1:
			return new CaloriesLTComparator();
		case 2:
			return new CaloriesGTComparator();
		case 3:
			return new PriceLTComparator();
		case 4:
			return new PriceGTComparator();
		default :
			return new PriceLTComparator();
		
		}
	}
}

class CaloriesLTComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
	
		return (int) (dish1.getCalories()-dish2.getCalories());
	}
	
}

class CaloriesGTComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
			
		return (int) (dish2.getCalories()-dish1.getCalories());
	}
	
}

class PriceLTComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
			
		return (int) (dish1.getPrice()-dish2.getPrice());
	}
	
}

class PriceGTComparator implements Comparator<Dishes>{

	@Override
	public int compare(Dishes dish1, Dishes dish2) {
		
		return (int) (dish2.getPrice()-dish1.getPrice());
	}
	
}


