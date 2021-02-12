package com.arpit.myPrep;

public class CreditCardType_Luxsoft {

	private static String returnCardType(String cardNumber) {
		
		int sum=0;
		String[] cardDelimeters= cardNumber.split("\s");
		for(int i=0; i< cardDelimeters[0].length(); i++) {
			sum= sum + Integer.parseInt(String.valueOf(cardDelimeters[0].charAt(i)));
		}
		if(sum == 16) {
			return "VISA";
		}else {
			return "Mastercard";
		}
		
	}

	public static void main(String[] args) {
		String cardNumber= "5190 6674 6557 9000";
		System.out.println(returnCardType(cardNumber));

	}
}
