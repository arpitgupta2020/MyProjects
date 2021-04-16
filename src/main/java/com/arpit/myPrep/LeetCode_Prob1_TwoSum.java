 package com.arpit.myPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import kotlin.ResultKt;

// https://leetcode.com/problems/two-sum/solution/

public class LeetCode_Prob1_TwoSum {

	//Sol-1 with Brute Force
	public int[] twoSumWithBruteForce(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	    	int complement= target - nums[i];
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == complement) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
	
	
	// HashMap solution for All combinations
		 public HashMap<Integer, Integer>  twoSumCombinations(int[] nums, int target) {
		        Map<Integer, Integer> index_map= new HashMap<>();
		        
		        HashMap<Integer, Integer> result_map= new HashMap<>();
		        
		        for(int i=0 ; i<nums.length; i++){
		            int complement= target- nums[i];
		            if(index_map.containsKey(complement)){
		                result_map.put(index_map.get(complement), nums[i]);
		            }
		            index_map.put(nums[i], nums[i]);
		        }
		        return result_map;
		        
		  }
		 
	// HashMap solution Optimized 
	 public int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> index_map= new HashMap<>();
	        
	        for(int i=0 ; i<nums.length; i++){
	            int complement= target- nums[i];
	            if(index_map.containsKey(complement)){
	                return new int[] {index_map.get(complement), i};
	            }
	            index_map.put(nums[i], i);
	        }
	        throw new IllegalArgumentException("No match found");
	        
	  }
	 
	public static void main(String[] args) {
		int[] nums = {5,6,7,8,3,4,11,0,1};
		int target = 11;
		LeetCode_Prob1_TwoSum twosum= new LeetCode_Prob1_TwoSum();
		int[] result= twosum.twoSumWithBruteForce(nums, target);
		
		for(int i=0; i< result.length; i++) {
			System.out.println(result[i]+" ");
		}
		
		HashMap<Integer, Integer> result_Map= twosum.twoSumCombinations(nums, target);
		
		for(Entry<Integer, Integer> entry: result_Map.entrySet()) {
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
