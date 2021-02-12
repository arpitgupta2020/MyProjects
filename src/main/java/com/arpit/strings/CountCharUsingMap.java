package com.arpit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountCharUsingMap {

	public static void main(String[] args) {

		String s1 = "Balaji";
		char[] c1 = s1.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : c1) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
        Set<Character>  keys = map.keySet();
        for(Character ch : keys) {
        	if(map.get(ch)>0) {
        		System.out.println(ch +" count of characters repeated  "+map.get(ch));
        	}
        }
	}

}
