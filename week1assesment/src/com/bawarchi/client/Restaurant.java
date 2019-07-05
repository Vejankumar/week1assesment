package com.bawarchi.client;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bawarchi.comparators.Comparators;
import com.bawarchi.model.Dishes;



public class Restaurant {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		List<Dishes> listofdishes = new ArrayList<>();
		Dishes dish = new Dishes(1,"Neer-Dosa",50,100);
		listofdishes.add(dish);
		dish = new Dishes(2,"Idli-Vada",40,200);
		listofdishes.add(dish);
		dish = new Dishes(3,"Roti-Curry",100,250);
		listofdishes.add(dish);
		dish = new Dishes(4,"Dosa",50,300);
		listofdishes.add(dish);
		dish = new Dishes(5,"Pulav",80,330);
		listofdishes.add(dish);
		
		System.out.println("\n=================  WELCOME  =====================\n\nPlease choose from the below options"
				+ "\n\n\n1 => To sort the dishes in the increasing order of calories\n"
				+ "2 => To sort the dishes in the decreasing order of calories\n"
				+ "3 => To sort the dishes in the increasing order of price\n"
				+"4 => To sort the dishes in the decreasing order of price\n\n"
				+"===============================================");
		int sort_type = kb.nextInt();
		
		
		Collections.sort(listofdishes,Comparators.getComparator(sort_type));
		
		//System.out.println("ID             NAME                 PRICE           CALORIES");
		System.out.println(" =================Please select the Dish Id and hit enter==="
				+ "============================");
		System.out.println(listofdishes);
		
		System.out.println();
		System.out.println("============================================================" + 
				"=============================");
		System.out.println();
		
		System.out.println("Enter the Dish Id you want");
		int dishid = kb.nextInt();
		
		Dishes selectedDish = null;

		for(Dishes i:listofdishes)
		{
			if(i.getId() == dishid) {
				selectedDish = i;
				break;
				
			}
		}
		
		if(selectedDish == null){
			System.out.println("The dish ID is not present ");
		}
		else {
			System.out.println("==========You have selected "+selectedDish.getName()+" =================="
					+ "===");
		}
		
		System.out.println();
		kb.nextLine();
		System.out.print("Please enter your name:  ");
		
		String customer_name = kb.nextLine();
		
		System.out.println("Please pay the bill of Rs "+selectedDish.getPrice());
		
		Double customer_paid = kb.nextDouble();
		if(customer_paid < selectedDish.getPrice())
			System.out.println("========Amount paid is less than Bill Amount ================");
		else if(customer_paid == selectedDish.getPrice())
			System.out.println("========Thanks for your order. ================");
		else
			System.out.println("========Thanks for your order. Please "
					+ "collect the change = Rs "+(customer_paid - selectedDish.getPrice())+" ================");
		

	}

	}


