package com.arpit.myPrep;

//https://www.youtube.com/watch?v=7wT5sFELf7Q

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArrayForDegreeOfArray {
	
	public static int findShortestSubArray(int[] nums) {
		
		HashMap<Integer, Integer> nums_count= new HashMap<>();
		HashMap<Integer, Integer> first_seen= new HashMap<>();
		int degree=0;
		int min_length=0;
		
		for(int i=0; i< nums.length; i++) {
			//Store number if not present and its first seen index
			first_seen.putIfAbsent(nums[i], i);
			//Frequency of all numbers in array
			nums_count.put(nums[i], nums_count.getOrDefault(nums[i],0)+ 1);
			
			if(nums_count.get(nums[i])>degree) {
				degree= nums_count.get(nums[i]);
				min_length= i- first_seen.get(nums[i])+1;
			}else if (nums_count.get(nums[i]) == degree) {
				min_length= Math.min(min_length, i- first_seen.get(nums[i])+1);
			}
		}
		
		
		return min_length;
        
    }

	public static void main(String[] args) {
		int[] arr= {1,2,2,3,1,2,3,1};
		System.out.println(findShortestSubArray(arr));
	}

}
