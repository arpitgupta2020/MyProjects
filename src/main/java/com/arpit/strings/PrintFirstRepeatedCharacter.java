package com.arpit.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

class PrintFirstRepeatedCharacterSolution {

	// Approach-1
	public static void testPrintFirstRepeatedCharacter(String str) {

		HashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		char[] c = str.toCharArray();
		Arrays.sort(c);

		for (int i = 0; i < c.length; i++) {

			if (map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i]) + 1);
			} else {
				map.put(c[i], 1);
			}

		}

		Set<Character> set = map.keySet();

		for (Character key : set) {
			if (map.get(key) > 1) {
				System.out.println(key + "First Repeated Character" + map.get(key));
				return;
			}
		}

	}

	//Approach-2

	public static char testPrintFirstRepeatedCharacterUsingSet(String str) {

		char[] c = str.toCharArray();

		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < c.length; i++) {

			if (set.contains(c[i])) {
				return c[i];
			} else {
				set.add(c[i]);
			}
		}

		return '\0';

	}

	//Approach-3

	public static void testPrintFirstRepeatedCharacterUsingArray(String str) {

		char[] c = str.toCharArray();

		int[] count = new int[256];

		for (char x : c) {
			count[x]++;
		}

		for (int i = 0; i < count.length; i++) {

			if (count[i] > 1) {
				System.out.println((char) i + "First repeated character" + count[i]);
				return;
			}
		}
	}

}

public class PrintFirstRepeatedCharacter {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		//PrintFirstRepeatedCharacterSolution.testPrintFirstRepeatedCharacter(str);
		//System.out.println(PrintFirstRepeatedCharacterSolution.testPrintFirstRepeatedCharacterUsingSet(str));
		PrintFirstRepeatedCharacterSolution.testPrintFirstRepeatedCharacterUsingArray(str);
	}

}
