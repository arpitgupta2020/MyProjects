package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.List;

/*
* Approach 1: Using Array (Similar to HashMap)
* Instead of making use of a special HashMap data structure just to store the frequency of occurence of characters,
* we can use a simpler array data structure to store the frequencies.
* Then we just need to compare the two map is the same or not.
*/

/*
s: "cbaebabacd" p: "abc"
Output:
[0, 6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
*/

//https://leetcode.com/problems/find-all-anagrams-in-a-string/

class FindAllAnagramsInAStringSolution {
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> rst = new ArrayList<>();
		if (s == null || s.length() == 0 || s.length() < p.length()) {
			return rst;
		}

		int[] map_p = new int[26];
		for (int i = 0; i < p.length(); i++) {
			map_p[p.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length() - p.length(); i++) {
			int[] map_s = new int[26];
			for (int j = 0; j < p.length(); j++) {
				map_s[s.charAt(i + j) - 'a']++;
			}
			if (isMatch(map_p, map_s)) {
				rst.add(i);
			}
		}
		return rst;
	}

	public static boolean isMatch(int[] arr1, int[] arr2) {
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}

public class FindAllAnagramsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
