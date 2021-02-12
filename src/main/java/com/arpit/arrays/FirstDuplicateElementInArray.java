package com.arpit.arrays;

//https://www.youtube.com/watch?v=XSdr_O-XVRQ
// 2,1,3,5,3,2 -6

class FirstDuplicateElementInArraySolution {
	
	public static int testFirstDuplicateElementInArray(int[] a) {
		
		int min = a.length;
		
		for(int i =0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] == a[j]) {
					min = Math.min(min, j);
				}
			}
		}
		if(min == a.length) return -1;
		return a[min];
	}
}

public class FirstDuplicateElementInArray {

	public static void main(String[] args) {
		int[] a = {2,1,3,5,3,2};
		System.out.println(FirstDuplicateElementInArraySolution.testFirstDuplicateElementInArray(a));

	}

}
