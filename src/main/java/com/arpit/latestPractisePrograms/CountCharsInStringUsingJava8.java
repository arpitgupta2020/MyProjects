package com.arpit.latestPractisePrograms;
/**
* Arpit Gupta
*/
public class CountCharsInStringUsingJava8 {

	public static void main(String[] args) {
		String str= "This string is for Testing purpose";
		
		System.out.println(getCharCounts(str, 's'));
		
		System.out.println(getCharCounts(str, 's', 'i'));
	}

	//Utility for one character count
	private static long getCharCounts(String str, char c) {
		
		return str
				.chars()
					.filter(e -> (char)e == c)
						.count();
	}	
	
	//Overloaded Utility for two character counts
	private static long getCharCounts(String str, char c, char c2) {
		
		return str
				.chars()
					.filter(e -> (char)e == c || (char)e == c2)
						.count();
	}
	

}
