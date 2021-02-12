package com.arpit.strings;

import java.util.ArrayList;
import java.util.List;

//https://stackoverflow.com/questions/15635585/remove-adjacent-duplicate-characters-in-a-stringjava-i-e-inputaaaabbbccdbbaae


class SingleOccurence {
	
	// Traverse from end to start of the string
	public static StringBuffer singleOccurence(String s) {
		StringBuffer sb = new StringBuffer(s);
		for (int i = sb.length() - 2; i >= 0; i--)
			if (sb.charAt(i) == sb.charAt(i + 1))
				sb.deleteCharAt(i + 1);
		return sb;
	}
	
	public static List<Character> adjacentRepeatingCharactersOnly(String s) {
		
		String newString = "";
		List<Character> list = new ArrayList<Character>();
		
		for(int i =0; i<s.length()-1; i++) {
			
			if(s.charAt(i) == s.charAt(i+1)) {
				list.add(s.charAt(i));
				list.add(s.charAt(i+1));
			}
		}
		
		return list;
	}
	
}

public class RemoveAllAdjacentDuplicates {

	public static void main(String[] args) {
		//System.out.println(SingleOccurence.singleOccurence("aaaabbbccdbbaae").toString());
		List<Character> list = SingleOccurence.adjacentRepeatingCharactersOnly("abbcdabsssc");
		String newString = "";
		for(Character c: list) {
			newString = newString + c;
		}
        System.out.println(newString);
	}

}
