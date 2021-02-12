package com.arpit.strings;

import java.util.HashSet;
import java.util.Set;

class TestPermutations {
	
	public static boolean testPermutationCombinations(String s) {
		char[] c = s.toCharArray();
		Set<Character> set = new HashSet<Character>();
		
		for(char k:c) {
			if(set.contains(k)) {
				set.remove(k);
			}else {
				set.add(k);
			}
		}
		return set.size() < 2;
	}
}

public class CheckPermutationStringHasPalidrome {

	public static void main(String[] args) {
		String s1 ="tiitc";
		System.out.println(TestPermutations.testPermutationCombinations(s1));
		
	}

}