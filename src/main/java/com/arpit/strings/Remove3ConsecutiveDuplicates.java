package com.arpit.strings;

import java.util.*;

// Return a string with no instances of 3 identical consecutive letters

// eedaaad --> eedaad

//uuuuxaaaxuuu -->uuxaaxuu
public class Remove3ConsecutiveDuplicates {

	public static void main(String[] args) {
		String str = "eedaaad";

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		Queue<Character> q = new LinkedList<>();

		String newString = "";

		map.put(str.charAt(0), 1);
		q.add(str.charAt(0));

		for (int i = 1; i <= str.length() - 1; i++) {

			if (!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
				q.add(str.charAt(i));
			} else {

				if (str.charAt(i - 1) == str.charAt(i)) {
					if (map.get(str.charAt(i - 1)) < 2) {
						q.add(str.charAt(i));
						map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
					}
				} else {
					q.add(str.charAt(i));
					if (map.containsKey(str.charAt(i))) {
						map.replace(str.charAt(i), 1);
					}
				}

			}

		}

		while (!q.isEmpty()) {

			newString = newString + String.valueOf(q.poll());
		}

		System.out.println(newString);
	}

}
