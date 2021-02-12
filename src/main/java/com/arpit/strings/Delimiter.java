package com.arpit.strings;

public class Delimiter {

	public static void main(String[] args) {
		String str = "I am peaceful.What are you doing? I am not well. So happy person";
		String delimiters = "[,!]+";
		String[] tokensVal = str.split(delimiters);
		for(int i=0;i<tokensVal.length;i++) {
			System.out.println(tokensVal[i].replace("\\n", "\n"));
		}
	}

}
