package com.arpit.strings;

//s - for white spaces

//d- digits

//[^\\[A-Za-z] - Just keep Letters and remove special characters

//W - Just keep Letters  and remove special characters

public class ReplaceAllSpecialCharacters {

	public static void main(String[] args) {
		String s1 = "Hey@ Man Hello!! HowR123U?";
		String finalString = s1.replaceAll("\\W", "").replaceAll("\\d", "").replaceAll("\\s", "");
		System.out.println(finalString);

	}

}
