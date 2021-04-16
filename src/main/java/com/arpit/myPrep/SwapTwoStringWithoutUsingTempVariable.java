package com.arpit.myPrep;

public class SwapTwoStringWithoutUsingTempVariable {

	public static void main(String[] args) {
		String s1= "Arrie";
		String s2= "Sakhi";
		
		s1= s1.concat(s2);
		s2= s1.substring(0, (s1.length()- s2.length()));
		s1= s1.replace(s2, "");
	}

}
