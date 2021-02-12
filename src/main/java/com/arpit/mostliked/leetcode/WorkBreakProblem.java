package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.youtube.com/watch?v=hLQYQ4zj0qg
//https://leetcode.com/problems/word-break/

class WordBreakSolution {

	// Using Recursion
	public static boolean testWordBreakSolution(String s, List<String> list) {

		if (s == null || s.length() == 0 || list == null) {
			return true;
		}

		for (int i = 1; i <= s.length(); i++) {
			if (list.contains(s.substring(0, i)) && testWordBreakSolution(s.substring(i, s.length()), list))
				return true;
		}
		return false;
	}

	//Using Memoization

	public static boolean testWordBreakSolutionMemomization(String s, List<String> list) {

		if (s.equals("")) {
			return true;
		}

		Map<String, Boolean> map = new HashMap<>();

		if (map.containsKey(s))
			return map.get(s);
		for (int i = 1; i <= s.length(); i++) {
			if (list.contains(s.substring(0, i)) && testWordBreakSolutionMemomization(s.substring(i, s.length()), list))
				map.put(s.substring(i, s.length()), true);
			return true;
		}
		map.put(s, false);
		return false;
	}

	//Using Dynamic Programming

	public static boolean testUsingDynamicProgramming(String s, List<String> list) {

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;

		for (int len = 1; len <= s.length(); len++) {

			for (int i = 0; i < len; i++) {

				if (dp[i] && list.contains(s.substring(0, len))) {
					dp[len] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}
}

public class WorkBreakProblem {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("c");
		list.add("x");
		list.add("de");
		String s = "code";
		System.out.println(WordBreakSolution.testWordBreakSolution(s, list));

	}

}
