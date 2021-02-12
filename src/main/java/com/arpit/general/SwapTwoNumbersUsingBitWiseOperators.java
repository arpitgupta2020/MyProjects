package com.arpit.general;

public class SwapTwoNumbersUsingBitWiseOperators {

	public static void main(String[] args) {
		int a =15;
		int b =9;
		
		a= a ^ b;
		b= a ^ b;
		a= a ^ b;
		
		System.out.println(a);
		System.out.println(b);

	}

}
