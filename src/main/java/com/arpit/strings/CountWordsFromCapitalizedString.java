package com.arpit.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Arpit Gupta
*/
public class CountWordsFromCapitalizedString {

	public static void main(String[] args) {
		String str = "ThisIsInCapitalizedStringFormat";
		
		//Method1
		int count1 = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				count1++;
			}
		}
		System.out.println(count1);
		
		//Method2 (using ASCII values)
		int count2 = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) > 65 && str.charAt(i) < 90) {
				count2++;
			}
		}
		System.out.println(count2);
		
		//Method3 (using Character class method)
		int count3 = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				count3++;
			}
		}
		System.out.println(count3);
		
		//Method4 (using Streams)		
		long count4 = str.chars().filter(e -> Character.isUpperCase(e)).count();
		System.out.println(count4);
		
		//Method5 (using Streams)		
		long count5 = str.chars().filter(e -> (e >= 'A' && e <= 'Z')).count();
		System.out.println(count5);
		
		//Method5 (using reg expression)		
		String matchString = "[A-Z]+";
		Pattern p = Pattern.compile(matchString);
		Matcher matcher = p.matcher(str);
		int count6 = 0;
		while(matcher.find()) {
			count6+=matcher.group(0).length();
		}
		System.out.println(count6);
	}

}
