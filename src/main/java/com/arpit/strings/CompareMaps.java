package com.arpit.strings;

import java.util.Map;
import java.util.TreeMap;

//Test Anagrams using Maps
public class CompareMaps {

	public static void main(String[] args) {

		String s1 = "aafe";
		String s2 = "fafe";

		Map<Character, Integer> map1 = new TreeMap<Character, Integer>();
		Map<Character, Integer> map2 = new TreeMap<Character, Integer>();

		for (int i = 0; i < s1.length(); i++) {

			if (!map1.containsKey(s1.charAt(i))) {
				map1.put(s1.charAt(i), 1);
			} else {
				map1.put(s1.charAt(i), map1.get(s1.charAt(i)) + 1);
			}
		}

		for (int j = 0; j < s2.length(); j++) {

			if (!map2.containsKey(s2.charAt(j))) {
				map2.put(s2.charAt(j), 1);
			} else {
				map2.put(s2.charAt(j), map2.get(s2.charAt(j)) + 1);
			}
		}

		System.out.println(map1.equals(map2));

	}

}
