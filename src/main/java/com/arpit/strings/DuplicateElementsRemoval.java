package com.arpit.strings;

import java.util.Arrays;
import java.util.HashSet;


//Print only unique elements
public class DuplicateElementsRemoval {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3};

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			while (i < arr.length - 1 && arr[i] == arr[i + 1])
				i++;
			System.out.print(arr[i] + " ");
		}
	}

}
