package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=uHAToNgAPaM

//https://leetcode.com/problems/climbing-stairs/

class ClimbingStairsSolution {

	public int climbStairs(int n) {

		int[] dp = new int[n + 1];
		//No of ways to climb 0 steps is 1 as we don't climb it
		dp[0] = 1;

		//No of ways to climb 1 step is 1 as we don't climb it

		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2]; // Previous step and Previous to Previous step
		}

		return dp[n];
	}

}

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
