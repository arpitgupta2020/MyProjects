package com.arpit.general;

public class StringReverseWithoutRecursion {

	public static void main(String[] args) {
		String s1 = "Balaji";
		char[] c1 = s1.toCharArray();
		
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.println(s1.charAt(i));
		}

	}

}
