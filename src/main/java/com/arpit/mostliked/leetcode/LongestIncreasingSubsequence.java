package com.arpit.mostliked.leetcode;

import java.util.HashSet;

//https://www.youtube.com/watch?v=mouCn3CFpgg

//https://leetcode.com/problems/longest-increasing-subsequence/

//https://www.geeksforgeeks.org/maximum-consecutive-numbers-present-array/

class LongestIncreasingSubsequenceSolution {
	
	
	//Solution -1 using dp O(n^2) - T and O(n) -S
	public static int testLongestIncreasingSubsequenceSolution(int[] nums) {
		if(nums == null || nums.length==0) {
			return 0;
		}
		
		int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 1;
        
        for (int i = 1; i < nums.length; i++ ) 
    	{ 
    		dp[i] = 1; 
    		for (int j = 0; j < i; j++ ) 
    			if ( nums[i] > nums[j] && dp[i] < dp[j] + 1) 
    				dp[i] = dp[j] + 1; 
    		max = Math.max(max, dp[i]);
    	} 
        return max;
	}
	
	//Solution -2 O(2^n)-T  Size of recursion tree will be 2^n
	// Space - O(n^2) - memory array of size n*n is used.
	
	
	public int lengthOfLIS(int[] nums) {
        return lengthofLIS(nums, Integer.MIN_VALUE, 0);
    }

    public int lengthofLIS(int[] nums, int prev, int curpos) {
        if (curpos == nums.length) {
            return 0;
        }
        int taken = 0;
        if (nums[curpos] > prev) {
            taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
        }
        int nottaken = lengthofLIS(nums, prev, curpos + 1);
        return Math.max(taken, nottaken);
    }
    
    //O(n)
    
    public static int findLongestConseqSubseq(int arr[], int n) 
    { 
        /* We insert all the array elements into 
        unordered set. */
        HashSet<Integer> S = new HashSet<Integer>(); 
        for (int i = 0; i < n; i++) 
            S.add(arr[i]); 
      
        // check each possible sequence from the start 
        // then update optimal length 
        int ans = 0; 
        for (int i = 0; i < n; i++)  
        { 
      
            // if current element is the starting 
            // element of a sequence 
            if(S.contains(arr[i]))  
            { 
      
                // Then check for next elements in the 
                // sequence 
                int j = arr[i]; 
      
                // increment the value of array element 
                // and repeat search in the set 
                while (S.contains(j)) 
                    j++;  
      
                // Update optimal length if this length 
                // is more. To get the length as it is  
                // incremented one by one 
                ans = Math.max(ans, j - arr[i]);  
            } 
        } 
        return ans; 
    } 
    
	
}

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int[] nums = {1, 94, 93, 1000, 5, 92, 78};
		System.out.println(LongestIncreasingSubsequenceSolution.findLongestConseqSubseq(nums, nums.length));
	}

}
