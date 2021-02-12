package com.arpit.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpecialCharactersFromString {

	public static void main(String[] args) {
		String s = "Hel@#$%lo";
		String newString = "";
		Pattern pattern = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		String[] split = pattern.split(s);
		
		for(String str: split) {
			Matcher specialCharacters = pattern.matcher(str);
			
			if(!specialCharacters.find()) {
				newString = newString + str;
			}
		}
		System.out.println(newString);
		
	}

}
