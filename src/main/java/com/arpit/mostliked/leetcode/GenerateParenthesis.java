package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=tyVBx-OtDug
//https://leetcode.com/problems/generate-parentheses/

//t -2^n and s- 2^n

class GenerateParenthesisSolution {

	public static List<String> testGenerateParenthesis(int n) {

		List<String> result = new ArrayList<String>();
		helper("", n, n, result);
		return result;
	}

	private static void helper(String current, int left, int right, List<String> result) {

		if (left < 0 || left > right) {
			return;
		}

		if (left ==0 && right==0) {
			result.add(current);
			return;
		}

		helper(current + "(", left - 1, right, result);
		helper(current + ")", left, right - 1, result);
	}
}

public class GenerateParenthesis {

	public static void main(String[] args) {
		int n = 2;
		System.out.println(GenerateParenthesisSolution.testGenerateParenthesis(n));

	}

}
