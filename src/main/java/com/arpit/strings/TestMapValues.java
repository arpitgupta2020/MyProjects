package com.arpit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// //For example:
// //Docusign, 1988
// //Krishna , 1988
// //Ashwin, 1978
// //Hello, 1978
// //blah, 1978

public class TestMapValues {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("Docusign", 1988);
		map.put("Krishna", 1988);
		map.put("Ashwin", 1978);
		map.put("Hello", 1978);
		map.put("Blah", 1978);
		map.put("MrRishi", 1977);

		TreeMap<Integer, Integer> hmap = new TreeMap<>();

		for (Map.Entry<String, Integer> e : map.entrySet()) {

			if (!hmap.containsKey(e.getValue())) {
				hmap.put(e.getValue(), 1);
			} else {
				hmap.put(e.getValue(), hmap.get(e.getValue()) + 1);
			}

		}

		for (Map.Entry<Integer, Integer> e : hmap.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
