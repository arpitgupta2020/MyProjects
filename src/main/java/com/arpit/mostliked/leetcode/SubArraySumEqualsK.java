package com.arpit.mostliked.leetcode;

import java.util.HashMap;

//https://leetcode.com/problems/subarray-sum-equals-k/

//https://www.youtube.com/watch?v=Ofl4KgFhLsM

class SubArraySumEqualsKSolution {
	public static int subarraySum(int[] nums, int k) {
		int count = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

	public static void testSubArraySumSolution2(int[] nums, int k) {

		int currentSum = 0;
		int rightPointer = 0;
		int leftPointer = 0;
		while (currentSum < k) {

			currentSum = currentSum + nums[rightPointer];
			rightPointer++;
		}
		int rightPointerPosition = rightPointer-1;
		
		while (currentSum >= k) {

			currentSum = currentSum - nums[leftPointer];
			leftPointer++;
		}
		int leftPointerPosition = leftPointer-1;
		for(int i= leftPointerPosition; i<=rightPointerPosition; i++) {
			System.out.println(nums[i]);
		}
	}
	
}

public class SubArraySumEqualsK {

	public static void main(String[] args) {
		int[] nums = {1,4,20,3,10,5};
		int k = 33;
		SubArraySumEqualsKSolution.testSubArraySumSolution2(nums, k);

	}

}
