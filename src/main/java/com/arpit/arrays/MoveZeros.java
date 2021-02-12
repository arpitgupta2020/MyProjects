package com.arpit.arrays;

//https://github.com/cherryljr/LeetCode/blob/master/Move%20Zeroes.java

class Solution {
	
	public int[] moveZeroes(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				j++;
			}
		}
		return nums;
	}
}

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = {0, 1, 0, 3, 12};
		Solution sol = new Solution();
		int[] newNums = sol.moveZeroes(nums);
		for(int x: newNums) {
			System.out.println(x);
		}
		
	}

}
