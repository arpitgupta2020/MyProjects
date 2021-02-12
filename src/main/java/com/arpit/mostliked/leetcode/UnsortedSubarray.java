package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/shortest-unsorted-continuous-subarray/solution/

import java.util.Arrays;

class UnsortedSubarraySolution {
	
	//[2, 6, 4, 8, 10, 9, 15]
	
	public static int findUnsortedSubarray(int[] nums) {
		int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = snums.length, end = 0;
        for (int i = 0; i < snums.length; i++) {
            if (snums[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        return (end - start >= 0 ? end - start + 1 : 0);
        
	}
}

public class UnsortedSubarray {

	public static void main(String[] args) {
		int[] nums = {2, 6, 4, 8, 10, 9, 15};
		System.out.println(UnsortedSubarraySolution.findUnsortedSubarray(nums));

	}

}
