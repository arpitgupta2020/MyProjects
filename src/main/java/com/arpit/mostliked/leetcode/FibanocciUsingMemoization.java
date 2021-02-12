package com.arpit.mostliked.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://www.youtube.com/watch?v=UxICsjrdlJA

class FibanocciUsingMemoizationSolution {

	private static Map<Integer, Integer> memo = new HashMap<>();

	public static int testFibanocciUsingMemoization(int n) {

		if (n == 0) {
			return 0;
		}
		if (n <= 2) {
			return 1;
		}
		if (memo.containsKey(n)) {
			System.out.printf("grabbing memo[%d]\n", n);
			return memo.get(n);
		}

		System.out.printf("computing fib(%d)\n", n);
		int result = testFibanocciUsingMemoization(n - 1) + testFibanocciUsingMemoization(n - 2);

		// memoize
		memo.put(n, result);

		return result;

	}
}

public class FibanocciUsingMemoization {

	public static void main(String[] args) {
		System.out.println(FibanocciUsingMemoizationSolution.testFibanocciUsingMemoization(10));

	}

}
