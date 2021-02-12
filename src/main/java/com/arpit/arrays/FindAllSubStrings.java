package com.arpit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://www.youtube.com/watch?v=VdnvmfzA1pw&t=801s

class SolutionTest {

	public static List<List<Integer>> subsets(int[] num) {

		List<List<Integer>> results = new ArrayList<List<Integer>>();

		if (num == null || num.length == 0) {
			return results;
		}

		Arrays.sort(num);
		List<Integer> subset = new ArrayList<Integer>();
		toFindAllSubSets(num, results, subset, 0);
		return results;

	}

	public static void toFindAllSubSets(int[] num, List<List<Integer>> results, List<Integer> subset, int startIndex) {

		results.add(new ArrayList<Integer>(subset));

		for (int i = startIndex; i < num.length; i++) {
			subset.add(num[i]);
			toFindAllSubSets(num, results, subset, i + 1);
			subset.remove(subset.size() - 1);
		}

	}
}

public class FindAllSubStrings {

	public static void main(String[] args) {

		int[] nums = { 3, 2, 1 };
		System.out.println(SolutionTest.subsets(nums));

	}

}
