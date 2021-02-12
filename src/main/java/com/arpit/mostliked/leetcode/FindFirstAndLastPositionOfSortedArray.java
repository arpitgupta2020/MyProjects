package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=bU-q1OJ0KWw

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class FindFirstAndLastPositionOfSortedArraySolution {

	public static int[] testFindFirstAndLastPositionOfSortedArray(int[] nums, int target) {

		int[] result = new int[2];
		result[0] = findStartingIndex(nums, target);
		result[1] = findEndingIndex(nums, target);
		return result;
	}

	private static int findStartingIndex(int[] nums, int target) {

		int index = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int midpoint = start + (end - start) / 2;

			if (nums[midpoint] >= target) {
				end = midpoint - 1;
			} else {
				start = midpoint + 1;

			}
			if (nums[midpoint] == target)
				index = midpoint;
		}
		return index;
	}

	private static int findEndingIndex(int[] nums, int target) {

		int index = -1;
		int start = 0;
		int end = nums.length - 1;

		while (start <= end) {

			int midpoint = start + (end - start) / 2;

			if (nums[midpoint] <= target) {
				start = midpoint + 1;
			} else {
				end = midpoint - 1;

			}
			if (nums[midpoint] == target)
				index = midpoint;
		}
		return index;
	}
}

public class FindFirstAndLastPositionOfSortedArray {

	public static void main(String[] args) {
		int[] nums = { 5, 7, 7, 8, 8, 10 };
		int target = 8;
		int[] result = FindFirstAndLastPositionOfSortedArraySolution.testFindFirstAndLastPositionOfSortedArray(nums,
				target);
		for (int i : result) {
			System.out.println(i);
		}
	}

}
