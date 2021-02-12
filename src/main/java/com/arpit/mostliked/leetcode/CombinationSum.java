package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=MTI2wc8s0BY

class CombinationSumSolution {

	public static List<List<Integer>> testCombinationSum(int[] candidates, int target) {

		List<List<Integer>> res = new ArrayList<>();
		helper(res, new ArrayList<>(), candidates, target, 0);
		return res;

	}

	private static void helper(List<List<Integer>> res, List<Integer> combinations, int[] candidates, int target, int index) {

		if (target <= 0) {
			if (target == 0) {
				res.add(new ArrayList<>(combinations));
			}

			return;
		}

		for (int i = index; i < candidates.length; i++) {

			combinations.add(candidates[i]);
			helper(res, combinations, candidates, target - candidates[i], i);
			combinations.remove(combinations.size() - 1);

		}

	}

}

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		System.out.println(CombinationSumSolution.testCombinationSum(candidates, target));

	}

}
