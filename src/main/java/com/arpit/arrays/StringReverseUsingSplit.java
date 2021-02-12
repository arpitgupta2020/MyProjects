package com.arpit.arrays;

public class StringReverseUsingSplit {

	public static void main(String[] args) {
		String s1 = "Welcome to Tirumala";
		String[] split = s1.split(" ");
		
		for(int i=split.length-1; i>=0; i--) {
			System.out.println(split[i]);
		}

	}

}
