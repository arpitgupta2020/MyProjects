package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/longest-repeating-character-replacement/

//https://www.youtube.com/watch?v=00FmUN1pkGE

class LongestRepeatingCharacterReplacementSolution {

	public static int testLongestRepeatingCharacterReplacement(String s, int k) {

		int n = s.length();
		int[] charCounts = new int[26];

		int windowStart = 0;
		int maxLength = 0;
		int maxCount = 0;

		for (int windowEnd = 0; windowEnd < n; windowEnd++) {
			charCounts[s.charAt(windowEnd) - 'A']++;
			int currentCharCount = charCounts[s.charAt(windowEnd) - 'A'];
			maxCount = Math.max(maxCount, currentCharCount);

			while (windowEnd - windowStart - maxCount + 1 > k) {
				
				// Sliding Window - Similar characters(maxCount) + 1(as we are adding new character)
				charCounts[s.charAt(windowStart) - 'A']--;
				windowStart++;

			}

			maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

		}

		return maxLength;

	}
}

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		String s = "AABABBA";
		int k =1;
		System.out.println(LongestRepeatingCharacterReplacementSolution.testLongestRepeatingCharacterReplacement(s, k));

	}

}
