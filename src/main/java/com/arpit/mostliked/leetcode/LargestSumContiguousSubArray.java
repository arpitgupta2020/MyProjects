package com.arpit.mostliked.leetcode;

//Solved using Kadane's Algorithm(Dynamic programming)
//Complexity= O(n)

public class LargestSumContiguousSubArray {
	
	public static int largestSumOfSubArray(int array[]) {
		int current_max=0, max_so_far=0;
		int start=0, end=0;
		
		for(int i=0;i<array.length; i++) {
			current_max= current_max+array[i];
			if(current_max<0) {
				current_max=0;
				start= i+1;
			}
			if(max_so_far<current_max) {
				max_so_far=current_max;
				end= i;
			}
		}
		for(int j= start; j<= end; j++) {
			System.out.print(array[j]+" ");
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int[] arr= {-6,-4,4,5,-2,-1,5,-3};
		int maxSum=LargestSumContiguousSubArray.largestSumOfSubArray(arr);
		System.out.println("\n"+maxSum);
	}

}
