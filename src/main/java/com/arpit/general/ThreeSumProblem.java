package com.arpit.general;

//https://www.youtube.com/watch?v=X5UhF3xS5Dk

//https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/

// O(n^3) complexity

class ThreeSum {

	public static boolean testThreeSum(int[] array, int sum) {

		for (int i = 0; i < array.length - 2; i++) {
			for (int j = i + 1; j < array.length - 1; j++) {
				for (int k = j + 1; k < array.length; k++) {
                   if(array[i]+array[j]+array[k] == sum) {
                	   System.out.print("Triplet is " + array[i] + ", " + array[j] + ", " + array[k]); 
                	   return true;
                   }
				}
			}
		}
		return false;
	}
}

public class ThreeSumProblem {

	public static void main(String[] args) {
		int[] array = { -1, 0, 1, 2, -1, -4};
		ThreeSum.testThreeSum(array, 2);

	}

}
