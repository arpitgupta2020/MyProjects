package com.arpit.arrays;

//https://www.youtube.com/watch?v=j5uXyPJ0Pew

//https://www.geeksforgeeks.org/binary-search/

// https://www.youtube.com/watch?v=-bQ4UzUmWe8

class BinarySearch {

	public static int testBinarySearch(int[] array, int key) {

		int start = 0;
		int end = array.length - 1;
		int mid;

		while (start <= end) {

			mid = start + (end - start) / 2;

			if (key == array[mid]) {
				return mid;
			} else if (key < array[mid]) {
				end = mid - 1;
			} else if (key > array[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}
	
	// In case if the array contains element 0 and target key to find is 0
	// https://leetcode.com/problems/search-in-rotated-sorted-array/
	public static int testBinarySearchIfTargetIs0(int[] array, int key) {

		int start = 0;
		int end = array.length - 1;
		int mid;

		while (start <= end) {

			mid = (start + end) / 2;

			if (key == array[mid]) {
				return mid;
			} 
			
			if(array[start] <= array[mid]) {
				
				if(key < array[mid] &&  key >= array[start]) 
					end = mid - 1;
				else 
					start = mid + 1;
			}else {
				if(key > array[mid] &&  key <= array[end]) 
					start = mid + 1;
				else 
					end = mid - 1;
			}
		}
		return -1;
	}
}

public class BinarySearchOfElements {

	public static void main(String[] args) {
		int[] array = {4, 5, 6, 7, 0, 1, 2 };
		int result = BinarySearch.testBinarySearch(array, 0);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);

	}

}


 
 
