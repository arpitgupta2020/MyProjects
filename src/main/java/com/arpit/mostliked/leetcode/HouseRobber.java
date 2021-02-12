package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/house-robber/submissions/

//https://www.youtube.com/watch?v=xlvhyfcoQa4



class HouseRobberSolution {
	public static int rob(int[] nums) {

		if (nums == null || nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];

		} else if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);

		} else {

			int[] dp = new int[nums.length];
			dp[0] = nums[0];
			dp[1] = Math.max(nums[0], nums[1]);
			for (int i = 2; i < dp.length; i++) {

				dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
			}
			return dp[nums.length - 1];
		}
	}
}

public class HouseRobber {

	public static void main(String[] args) {
		int[] nums = {1,3, 1 };
		System.out.println(HouseRobberSolution.rob(nums));

	}

}
