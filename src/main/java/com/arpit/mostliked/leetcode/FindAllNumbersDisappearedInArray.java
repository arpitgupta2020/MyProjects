package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://www.youtube.com/watch?v=efU_3Da3DV0

class FindAllNumbersDisappearedInArraySolution {
	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> missingNumbers = new ArrayList<Integer>();

		HashSet<Integer> set = new HashSet<Integer>();

		// This will remove all duplicates from nums array
		for (int i : nums) {
			set.add(i);
		}

		for (int j = 1; j <= nums.length; j++) {
			if (!set.contains(j)) {
				missingNumbers.add(j);
			}
		}

		return missingNumbers;
	}
}

public class FindAllNumbersDisappearedInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
