package com.arpit.mostliked.leetcode;

import java.util.Arrays;

//Here I'm using XOR operation

//https://leetcode.com/problems/single-number/

class IntegerCountSolution {
	public static int singleNumber(int[] nums) {

		int result = 0;
		for (int x : nums) {
			result = result ^ x;
		}
		return result;

	}

	public static void hasDuplicates(int[] arrA) {

		for (int i = 0; i < arrA.length; i++) {
			//check if element is negative, if yes the we have found the duplicate
			if (arrA[Math.abs(arrA[i])] < 0) {
				System.out.println("Array has duplicates : " + Math.abs(arrA[i]));
			} else {
				arrA[Math.abs(arrA[i])] = arrA[Math.abs(arrA[i])] * -1;
			}
		}
	}

	public static void hasDuplicatesSolution(int[] arrA) {

		Arrays.sort(arrA);

		for (int i = 0; i < arrA.length-1; i++) {
			if (!(arrA[i] == arrA[i + 1])) {
				continue;
			} else {
				System.out.println("Array has duplicates  "+ arrA[i]);
			}
		}
	}
}

public class IntegerCount {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3,-4, 4,4,2,-4};
		System.out.println(IntegerCountSolution.singleNumber(nums));
		//IntegerCountSolution.hasDuplicates(nums);
		IntegerCountSolution.hasDuplicatesSolution(nums);

	}

}
