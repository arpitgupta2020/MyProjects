package com.arpit.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html

//https://www.youtube.com/watch?v=GuTPwotSdYw

class PermutationSolution {

	//Using recursion
	public static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}

	//Using heap's Algorithm

	public static void printArray(char[] a, int n) {

		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < n; i++) {
			list.add(a[i]);
		}
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
	}

	public static void usingHeapAlgorithm(char[] a, int size, int n) {

		if (size == 1) {
			printArray(a, n);
		}

		for (int i = 0; i < size; i++) {
			usingHeapAlgorithm(a, size - 1, n);

			if (size % 2 == 1) {
				char temp = a[0];
				a[0] = a[size - 1];
				a[size - 1] = temp;
			}

			if (size % 2 == 0) {
				char temp = a[i];
				a[i] = a[size - 1];
				a[size - 1] = temp;
			}

		}
	}
	
	//Using swapping technique
	
	public static String swap(String str, int i, int j) {
		
		char[] c = str.toCharArray();
		char temp = c[i];
		c[i] = c[j];
		c[j] = temp;
		return String.valueOf(c);
	}
	
	public static void usingSwappingTechnique(String str, int l, int r) {

		if (l == r) {
			System.out.println(str);
		} else {

			for (int i = l; i <= r; i++) {

				str = swap(str, l, i);
				usingSwappingTechnique(str, l + 1, r);
				str = swap(str, l, i);
			}
		}

	}
}

public class FindPermutationsOfAString {

	public static void main(String[] args) {
		//PermutationSolution.permutation("", "ABC");

		String s = "ABC";
		char[] a = s.toCharArray();
		//PermutationSolution.usingHeapAlgorithm(a, a.length, a.length);
		PermutationSolution.usingSwappingTechnique(s, 0, s.length()-1);
	}

}
