package com.arpit.strings;

//https://www.youtube.com/watch?v=8ZlmgBcQzMM&t=45s

///https://webrewrite.com/longest-substring-without-repeating-characters/

import java.util.HashSet;
import java.util.Set;

class LongestSubString {
	public int lengthOfLongestSubstring(String s) {

		int maxCount = 0;
		int i = 0;
		int j = 0;
		Set<Character> set = new HashSet<Character>();

		if (s == null || s.length() == 0) {
			return 0;
		}

		while (i < s.length() && j < s.length()) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				maxCount = Math.max(maxCount, set.size());
				j++;
			} else {
				set.remove(s.charAt(i));
				i++;
			}
		}
		return maxCount;

	}
}

public class FindLongestSubString {

	public static void main(String[] args) {
		String s1 = "pwwwkew";
		LongestSubString longest = new LongestSubString();
		System.out.println(longest.lengthOfLongestSubstring(s1));

	}

}
