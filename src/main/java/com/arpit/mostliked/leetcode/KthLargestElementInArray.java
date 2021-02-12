package com.arpit.mostliked.leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

//https://www.youtube.com/watch?v=hGK_5n81drs

//https://www.youtube.com/watch?v=FrWq2rznPLQ

//https://leetcode.com/problems/kth-largest-element-in-an-array/

class KthLargestElementSolution {
	
	public static int KthLargestElementInUnSortedArraySolution(int[] nums, int k) {
		
		if(nums==null || nums.length==0) {
			return 0;
		}
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		
		for(int i: nums) {
			minHeap.add(i);
			if(minHeap.size() > k) {
				minHeap.remove();
			}
		}
		
		return minHeap.remove();
		
	}
}

class KthSmallestElementSolution {
	
	public static int KthSmallestElementInUnSortedArraySolution(int[] nums, int k) {
		
		if(nums==null || nums.length==0) {
			return 0;
		}
		
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		for(int i: nums) {
			maxHeap.add(i);
			if(maxHeap.size() > k) {
				maxHeap.remove();
			}
		}
		
		return maxHeap.remove();
		
	}
}

public class KthLargestElementInArray {

	public static void main(String[] args) {
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		System.out.println(KthLargestElementSolution.KthLargestElementInUnSortedArraySolution(nums, k));
		System.out.println(KthSmallestElementSolution.KthSmallestElementInUnSortedArraySolution(nums, k));

	}

}
