package com.arpit.strings;

public class SubStringTest {

	public static void main(String[] args) {
		String s1 = "Balaji";
		System.out.println(s1.length());
		System.out.println(s1.substring(1));//from 1
		System.out.println(s1.substring(1, 4));//Upper Boundary 4 will be minus to 1(1,3)
		System.out.println(s1.indexOf("ji"));
		System.out.println(s1.indexOf('j'));
		System.out.println(s1.indexOf('l', 0));
		System.out.println(s1.indexOf("ji", 0));
		String s2 = s1.concat("Tirupathi");
		System.out.println(s2);
		
		//Swap two string without using 3rd variable
		
		String str1 = "first";
		String str2 = "second";

		str1 = str1+str2;
		str2 = str1.substring(0,(str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		

		System.out.println(str1);
		System.out.println(str2);
		
		String name = "Mr.Perfect";
		String newName = name.replaceAll("\\W", "").toLowerCase();
		System.out.println("Hello........."+newName);
		

	}

}
