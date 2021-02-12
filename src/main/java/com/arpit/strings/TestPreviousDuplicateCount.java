package com.arpit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class testDummyCode {

	public static Map<Character, Integer> testThreeSum(String str) {

		if (str == null || str.length() <= 1) {
			System.out.println("Print Nothing");
		}

		Stack<Character> stack = new Stack<Character>();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		Map<Character, Integer> finalMap = new HashMap<Character, Integer>();

		char[] c = str.toLowerCase().replaceAll("\\s", "").toCharArray();

		stack.push(c[0]);

		for (int i = 1; i < c.length; i++) {

			int count = 1;
			if (c[i] == stack.peek()) {
				count++;
				if (count < 3) {
					map.put(c[i], count);
					if (finalMap.containsKey(c[i])) {
						finalMap.put(c[i], map.get(c[i]) + count);
					} else {
						finalMap.put(c[i], count);
					}

				}
				map.replace(c[i], 0);
			} else {

				stack.push(c[i]);
			}

		}

		return finalMap;

	}

}

public class TestPreviousDuplicateCount {

	public static void main(String[] args) {
		String input = "successp";
		Map<Character, Integer> map = testDummyCode.testThreeSum(input);

		if (map.isEmpty()) {
			System.out.println("Print nothing");
		} else {
			for (Map.Entry<Character, Integer> entry : map.entrySet()) {

				System.out.println(entry.getKey() + "  " + entry.getValue());
			}
		}

	}

}
