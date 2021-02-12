package com.arpit.general;

//https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/

//https://www.geeksforgeeks.org/find-a-triplet-that-sum-to-a-given-value/

//O(n^2) time complexity

import java.util.Arrays;

class ThreeSumProblemWithLessComplexity {
	
	public static boolean testThreeSumWithLessComplexity(int[] a, int arraySize, int sum) {
		
		Arrays.sort(a);
		int l, r;
		
		for(int i=0; i<a.length-2; i++) {
			
			l = i+1;
			r= a.length-1;
			
			while (l < r) { 
	            if (a[i] + a[l] + a[r] == sum) { 
	            	System.out.print("Triplet is " + a[i] + ", " + a[l] + ", " + a[r]); 
	                return true; 
	            } 
	            else if (a[i] + a[l] + a[r] < sum) 
	                l++; 
	            else // a[i] + a[l] + a[r] > sum 
	                r--; 
	        } 
		}
		return false;
		
	}
}

public class ThreeSumWithLessComplexity {

	public static void main(String[] args) {
		
		int[] array = { -1, 0, 1, 2, -1, -4};
		int size = array.length;
		ThreeSumProblemWithLessComplexity.testThreeSumWithLessComplexity(array, size, 2);
	}

}
