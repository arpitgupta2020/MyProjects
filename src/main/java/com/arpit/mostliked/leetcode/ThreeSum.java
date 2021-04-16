package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// leetcode- https://www.youtube.com/watch?v=qJSPYnS35SE

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums, int sumTotal) {
		
		Arrays.sort(nums);
		List<List<Integer>> threeSumList= new ArrayList<>();
		
		for(int i=0; i< nums.length-2; i++) {
			if(i==0 || (i>0 && nums[i] != nums[i-1])) {
				int low=i+1;
				int high= nums.length-1;
				int sum= sumTotal - nums[i];
				
				while(low<high) {
					if(nums[low] + nums[high] == sum) {
						threeSumList.add(Arrays.asList(nums[i], nums[low], nums[high]));
						while(low<high && nums[low] == nums[low+1])low++;
						while(low<high && nums[high] == nums[high-1])high--;
						low++;
						high--;
					}else if (nums[low] + nums[high] > sum) {
						high--;
					}else {
						low++;
					}
				}
			}
		}
		
		return threeSumList;
        
    }

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,4};
		int sumTotal= 3;
		System.out.println(threeSum(nums, sumTotal));
	}

}
