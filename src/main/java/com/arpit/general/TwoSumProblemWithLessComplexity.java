package com.arpit.general;

// Java implementation using Hashing
import java.io.*;
import java.util.Arrays;

//O(n) complexity
class TwoSumProblemWithLessComplexity {
	private static final int MAX = 100000; // Max size of Hashmap

	static void printpairs(int arr[], int sum) {

		Arrays.sort(arr);
		int max = arr[arr.length-1];
		// Declares and initializes the whole array as false
		int booleanArrayLength = Math.max(max, sum);
		boolean[] binmap = new boolean[booleanArrayLength];
		int count = 0;
		for (int i = 0; i < arr.length; ++i) {
			int temp = sum - arr[i];

			// checking for condition
			if (temp >= 0 && binmap[temp]) {
				count++;
				System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")" + " "
						+ "and count of such pairs" + " " + count);
			}
			binmap[arr[i]] = true;
		}
	}

	// Main to test the above function
	public static void main(String[] args) {
		int A[] = { 1,0,3,2,6,4,12 };
		int sum = 16;
		printpairs(A, sum);
	}
}

// This article is contributed by Aakash Hasija
