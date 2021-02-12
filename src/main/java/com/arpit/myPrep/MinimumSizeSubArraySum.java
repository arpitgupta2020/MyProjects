package com.arpit.myPrep;

//https://www.youtube.com/watch?v=jKF9AcyBZ6E

public class MinimumSizeSubArraySum {
	
	public static int minSubArrayLen(int s, int[] nums) {
		int result= Integer.MAX_VALUE;
		int val_sum=0;
		int left=0;
		
		for(int i=0; i<nums.length; i++) {
			val_sum+= nums[i];
			
			while(val_sum>= s) {
				result= Math.min(result, i+1-left);
				val_sum -= nums[left];
				left++;
			}
		}
		
		return (result != Integer.MAX_VALUE) ? result : 0 ;
        
    }

	public static void main(String[] args) {
		int[] arr= {2,3,1,2,4,3};
		int s=7;
		System.out.println(minSubArrayLen(s, arr));
	}

}
