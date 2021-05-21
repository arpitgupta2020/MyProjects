package com.arpit.myPrep;

public class String_Test {

	public static void main(String[] args) {
		
		String s1= "Arpit";
		String s2= "Arpit";
		String s3= new String("Arpit");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
	

	}

}
