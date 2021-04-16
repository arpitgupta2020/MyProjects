package com.arpit.myPrep;

import java.util.HashMap;

public class Amazon_FirstNonRepeatingCharacter {

	//Solution1 using built-in string methods
	private static char firstNonRepeatingCharacter_Solution1(String s) {
		for(int i=0;i< s.length(); i++) {
			if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
				return s.charAt(i);
			}
		}
		return '_';
	}
	
	//Solution2 using Hashmap
	private static char firstNonRepeatingCharacter_Solution2(String s) {
		HashMap<Character, Integer> occurences= new HashMap<>();
		
		for(int i=0;i< s.length(); i++) {
			occurences.put(s.charAt(i), occurences.getOrDefault(s.charAt(i), 0)+1);
			
//			  if(occurences.containsKey(s.charAt(i))) { 
//				  occurences.put(s.charAt(i), occurences.get(s.charAt(i))+1);
//			  }else {
//				  occurences.put(s.charAt(i), 1);
//			  }
			 
		}
		for(int i=0;i< s.length(); i++) {
			if(occurences.get(s.charAt(i)) == 1) {
				return s.charAt(i);
			}
		}
		return '_';
	}
	
	public static void main(String[] args) {
		String s2="aaabccdebef";
		String s="aaabccdeef";
		
		System.out.println(firstNonRepeatingCharacter_Solution1(s));
		
		System.out.println(firstNonRepeatingCharacter_Solution2(s2));
	}

}
