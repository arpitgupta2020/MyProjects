package com.arpit.informaticaTasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

//Geeks for geeks
public class Informatica_Round2_Program2 {

	
	public static void main(String[] args) {
		String input= "geeks for geeks";
		printFirstNonRepeatedCharacter(input);
	}

	private static void printFirstNonRepeatedCharacter(String input) {
		
		Map<Character, Integer> charCounts= new HashMap<>();
		
		for(Character element: input.toCharArray()) {
			charCounts.put(element, charCounts.getOrDefault(element, 0)+1);
		}
		
	//	System.out.println(charCounts);
		
		for(int i=0; i< input.length(); i++) {
			if(charCounts.get(input.charAt(i)) == 1) {
				System.out.println(input.charAt(i));
				break;
			}
		}
	}

}
