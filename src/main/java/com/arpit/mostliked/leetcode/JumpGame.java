package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=Zb4eRjuPHbM

//https://leetcode.com/problems/jump-game/

class JumpGameSolution {
	
	public static boolean testJumpGameSolution(int[] nums) {
		
		int lastGoodIndexPosition = nums.length-1;
		
		for(int i=nums.length-1; i>=0; i--) {
			
			if(i+ nums[i] >= lastGoodIndexPosition) {
				lastGoodIndexPosition = i;
			}
		}
		
		return lastGoodIndexPosition == 0;
	}
}

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = {2,3,1,1,4};
		System.out.println(JumpGameSolution.testJumpGameSolution(nums));
		

	}

}
