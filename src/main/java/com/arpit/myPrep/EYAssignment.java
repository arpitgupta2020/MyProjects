package com.arpit.myPrep;

public class EYAssignment {

	public static void main(String[] args) {
		String sourcestring = "My Name is Vine et Kuma r Samal";
		
		String outputstring = "";
		
		for(int i= sourcestring.length()-1, j=0; i>=0 && j< sourcestring.length() ; i--, j++) {
			if(sourcestring.charAt(j) == ' ') {
				outputstring= outputstring+" ";
			}if(sourcestring.charAt(i) != ' ') {
				outputstring= outputstring+ sourcestring.charAt(i);
			}
		}
		System.out.println(outputstring);
	}

}
