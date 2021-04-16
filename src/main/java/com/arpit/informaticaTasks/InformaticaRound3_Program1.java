package com.arpit.informaticaTasks;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//User should buy multiple fruits from market and check all fruits after returning home
//also should not buy any fruits twice
public class InformaticaRound3_Program1 {

	public static void main(String[] args) {
		
		Set<String> fruits= new HashSet<>();
		boolean buyMoreFruitFlag= true;
		
		Scanner sc1= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		
		while(buyMoreFruitFlag) {
			System.out.println("Buy more Fruits?");
			boolean wantsMoreFruit= sc1.nextBoolean();
			if(wantsMoreFruit) {
				System.out.println("Enter new fruit name: ");
				String fruit= s2.nextLine();
				fruits.add(fruit);
			}else {
				buyMoreFruitFlag= false;
			}		
		}
		sc1.close();
		s2.close();
		
		Iterator<String>   iter= fruits.iterator();
		System.out.println("Toatl fruits in Bag after returning home: ");
		//Returned Home, now find all fruits in bag
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}	
	}

	
}



