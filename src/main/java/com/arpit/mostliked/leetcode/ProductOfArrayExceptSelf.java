package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=vB-81TB6GUc

//https://leetcode.com/problems/product-of-array-except-self/

class ProductOfArrayExceptSelfSolution {

	public static int[] testProductOfArrayExceptSelf(int[] nums) {

		int[] leftArray = new int[nums.length];
		int left = 1;
		for (int i = 0; i < nums.length; i++) {
			leftArray[i] = left;
			left = left* nums[i];
		}
		
		int[] productArray = leftArray;
		int right =1;
		
		for(int j=nums.length-1 ; j>=0; j--) {
			
			productArray[j] = right * productArray[j];
			right = right * nums[j];
			
		}
		
		return productArray;
	}
}

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		int[] productArray = ProductOfArrayExceptSelfSolution.testProductOfArrayExceptSelf(nums);
		
		for(int result: productArray) {
			System.out.println(result);
		}

	}

}
