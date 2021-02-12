package com.arpit.arrays;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//https://www.youtube.com/watch?v=GmHengYK3Nk&t=587s

class CountElementsOfXandXPlusOne {

	public static int testCountElementsOfXandXPlusOne(int[] nums) {

		if (nums == null || nums.length == 0) {

			return 0;
		}

		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (!map.containsKey(nums[i])) {

				map.put(nums[i], 1);

			} else {
				map.put(nums[i], map.get(nums[i]) + 1);

			}

		}

		if (!map.isEmpty()) {
			Set<Integer> set = map.keySet();

			for (Integer key : set) {

				if (map.containsKey(key) == map.containsKey(key + 1)) {

					count = count + map.get(key);

				}

			}
		}
		return count;

	}

}

public class CountElementsInArray {

	public static void main(String[] args) {
		int[] nums = {1,1,2,2,3};
		System.out.println(CountElementsOfXandXPlusOne.testCountElementsOfXandXPlusOne(nums));

	}

}
