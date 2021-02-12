package com.arpit.general;

import java.util.HashMap;

//https://www.youtube.com/watch?v=Aql6zHkONek

//https://leetcode.com/problems/two-sum/submissions/

class TwoSumCheckSolution {
	public static int[] twoSum(int[] nums, int target) {

		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			int diff = target - nums[i];

			if (map.containsKey(diff)) {
				result[0] = i;
				result[1] = map.get(diff);
				return result;
			} else {
				map.put(nums[i], i);
			}
		}
		if (result[0] == 0 || result[1] == 0) {
			return null;
		} else {
			return result;
		}

	}
}

public class TwoSumCheck {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		int[] result = TwoSumCheckSolution.twoSum(nums, target);
		for(int i:result) {
			System.out.println(i);
		}

	}

}
