package com.arpit.general;

//https://www.geeksforgeeks.org/count-pairs-array-whose-sum-less-x/
//{1,2,3,4}

// X=6

class CountPairsOfNumbersWhoseSumIsLessThanXSolution {

	public static int testCountPairsOfNumbersWhoseSumIsLessThanX(int[] arr, int x) {
		int l = 0, r = arr.length - 1;
		int result = 0;
		while (l < r) {
			
			// If current left and current 
            // right have sum smaller than x, 
            // the all elements from l+1 to r 
            // form a pair with current l. 
			if (arr[l] + arr[r] < x) {
				result += (r - l);
				l++;
			}

			// Move to smaller value 
			else
				r--;
		}

		return result;

	}
}

public class CountPairsOfNumbersWhoseSumIsLessThanX {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };
		int x = 6;
		System.out.println(
				CountPairsOfNumbersWhoseSumIsLessThanXSolution.testCountPairsOfNumbersWhoseSumIsLessThanX(arr, x));

	}

}
