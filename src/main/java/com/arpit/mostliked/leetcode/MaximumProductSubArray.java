package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=1s0r7Ixir80

//https://leetcode.com/problems/maximum-product-subarray/

class MaximumProductSubArraySolution {

	public static int testMaximumProductSubArray(int[] nums) {

		if (nums == null || nums.length == 0) {
			return -1;
		}
		int current_max = nums[0];
		int current_min = nums[0];
		int final_max = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int temp = current_max;
			current_max = Math.max(Math.max(current_max * nums[i], current_min * nums[i]), nums[i]);
			current_min = Math.min(Math.min(temp * nums[i], current_min * nums[i]), nums[i]);
			if (current_max > final_max) {
				final_max = current_max;
			}
		}

		return final_max;
	}
}

public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] nums = {2,3,-2,4};
		System.out.println(MaximumProductSubArraySolution.testMaximumProductSubArray(nums));

	}

}
