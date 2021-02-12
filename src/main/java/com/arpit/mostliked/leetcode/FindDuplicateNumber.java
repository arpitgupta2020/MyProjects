package com.arpit.mostliked.leetcode;

import java.util.Arrays;

class FindDuplicateNumberSolution {

	public static int findDuplicate(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		Arrays.sort(nums);
		int max = nums[nums.length-1];
		int count[] = new int[max+1];

		int finalResult = 0;
		for (int x : nums) {
			count[x]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= 2)
				finalResult = i;
		}
		return finalResult;
	}
}

public class FindDuplicateNumber {

	public static void main(String[] args) {
		int[] nums = { 3,1,3,4,2,4};
		System.out.println(FindDuplicateNumberSolution.findDuplicate(nums));
		
	}

}
