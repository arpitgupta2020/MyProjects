package com.arpit.general;

import java.util.Arrays;
import java.util.List;

public class WeightedAverage {
	public static double mean(List<Integer> numbers, List<Integer> weights) {
		int total = 0;
		double totalWeights = 0;
		if (numbers == null || weights == null || numbers.isEmpty() || weights.isEmpty()) {
			throw new IllegalArgumentException();
		}
		for (int i = 0; i < numbers.size(); i++) {
			total += numbers.get(i) * weights.get(i);
			totalWeights += weights.get(i);
		}

		return total / totalWeights;
	}

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
		List<Integer> b = Arrays.asList(new Integer[] { 4, 2 });
		System.out.println(WeightedAverage.mean(a, b));
	}
}
