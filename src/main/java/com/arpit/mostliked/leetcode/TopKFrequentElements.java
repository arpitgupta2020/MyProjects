package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.youtube.com/watch?v=WrNsuS7XWdY
//https://leetcode.com/problems/top-k-frequent-elements/solution/

class TopKFreqElementsSolution {

	public static List<Integer> testTopKFreqElements(int[] nums, int k) {

		List<Integer> result = new ArrayList<Integer>();

		if (nums == null || nums.length == 0) {
			return result;
		}

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

		}

		List<Integer>[] buckets = new ArrayList[nums.length + 1];

		for (int key : map.keySet()) {
			int freq = map.get(key);
			if (buckets[freq] == null) {
				buckets[freq] = new ArrayList<Integer>();
				buckets[freq].add(key);
			}
		}

		for (int pos = nums.length; pos >= 0 && result.size()<k ; pos--) {

			if (buckets[pos] != null) {
				result.addAll(buckets[pos]);
			}

		}

		return result;
	}
}

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		int k =2;
		System.out.println(TopKFreqElementsSolution.testTopKFreqElements(nums, k));

	}

}
