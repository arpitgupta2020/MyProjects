package com.arpit.arrays;

class MergeSortAlgorithmSolution {

	public static void MergeLogic(int a[], int[] left, int[] right, int leftCount, int rightCount) {

		int i, j, k;

		i = 0;
		j = 0;
		k = 0;

		while (i < leftCount && j < rightCount) {

			if (left[i] < right[j]) {
				a[k++] = left[i++];
			} else {
				a[k++] = right[j++];
			}
		}

		while (i < leftCount) {
			a[k++] = left[i++];
		}

		while (j < rightCount) {
			a[k++] = right[j++];
		}
	}

	public static void MergeSort(int[] a, int n) {

		if (n < 2) {
			return;
		}

		int mid = n / 2;

		int[] left = new int[mid];
		int[] right = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			left[i] = a[i];
		}

		for (int i = mid; i < n; i++) {
			right[i - mid] = a[i];
		}
		MergeSort(left, mid);
		MergeSort(right, n - mid);
		MergeLogic(a, left, right, mid, n - mid);
	}
}

public class MergeSortAlgorithm {

	public static void main(String[] args) {
		int[] a = { 7, 2, 1, 6, 8, 5, 3, 4 };
		MergeSortAlgorithmSolution.MergeSort(a, a.length);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
