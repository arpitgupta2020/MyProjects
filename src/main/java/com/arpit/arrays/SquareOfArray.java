package com.arpit.arrays;

//-6,-4,1,2,3,5

//https://www.youtube.com/watch?v=4eWKHLSRHPY&t=616s

class SquareOfArraySolution {
	
	public static int[] testSquareOfArraySolution(int[] nums) {
		
		int[] result = new int[nums.length];
		int right = nums.length-1;
		int left =0;
		for(int i=nums.length-1; i>=0; i--) {
			
			if(Math.abs(nums[left]) > Math.abs(nums[right])) {
				
				result[i] = Math.abs(nums[left])*Math.abs(nums[left]);
				left ++;
			}else {
				result[i] = Math.abs(nums[right])*Math.abs(nums[right]);
				right--;
			}
		}
		return result;
	}
}

public class SquareOfArray {

	public static void main(String[] args) {
		int[] nums = {-6,-4,1,2,3,5};
		int[] newArray = SquareOfArraySolution.testSquareOfArraySolution(nums);
		for(int i: newArray) {
			System.out.println(i);
		}

	}

}
