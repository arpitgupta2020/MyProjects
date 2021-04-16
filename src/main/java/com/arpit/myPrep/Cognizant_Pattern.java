package com.arpit.myPrep;


/*Sample
Sampl
Samp
Sam
Sa
S*/

public class Cognizant_Pattern {

	public static void main(String[] args) {
		String str= "sample";
		printPattern(str);
	}

	private static void printPattern(String str) {
		
		for(int i= str.length(); i>=0; i--) {
			if(i < str.length()) {
				str= str.replace(str.charAt(i), ' ');
			}
			System.out.println(str);
		}
	}

}
