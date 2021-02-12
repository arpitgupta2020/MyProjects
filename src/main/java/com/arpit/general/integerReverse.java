package com.arpit.general;

public class integerReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 2345678;
		int reverse=0;
		int reminder;
		while(number >0){
			reminder = number%10;
			reverse= reverse*10+reminder;
			number= number/10;
		}
		   System.out.println(reverse);
	}

}
