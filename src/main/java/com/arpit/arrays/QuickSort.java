package com.arpit.arrays;

class QuickSortSolution {

	public static int PartitionLogic(int[] a, int start, int end) {

		int pivot = a[end];
		int partitionIndex = start;

		for (int i = start; i < end; i++) {

			if (a[i] <= pivot) {
                
				//swap a[i], a[partitionIndex]
				int temp = a[i];
				a[i] = a[partitionIndex];
				a[partitionIndex] = temp;
				partitionIndex++;

			}
		}

		//a[end], a[partitionIndex]
		int temp = a[end];
		a[end] = a[partitionIndex];
		a[partitionIndex] = temp;

		return partitionIndex;
	}

	public static void QuickSortLogic(int a[], int start, int end) {

		if (start < end) {

			int partitionIndex = PartitionLogic(a, start, end);
			QuickSortLogic(a, start, partitionIndex - 1);
			QuickSortLogic(a, partitionIndex + 1, end);
		}
	}
}

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 7, 2, 1, 6, 8, 5, 3, 4 };
		QuickSortSolution.QuickSortLogic(a, 0, a.length - 1);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
