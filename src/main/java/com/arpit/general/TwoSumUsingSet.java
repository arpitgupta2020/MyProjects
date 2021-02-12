package com.arpit.general;

import java.util.HashSet;
import java.util.Set;

class TwoSumProblemUsingSet {
	
	public static void testTwoSumProblemUsingSet(int a[], int sum) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length; i++) {
			set.add(a[i]);
			
			int diff = sum-a[i];
			
			if(set.contains(diff)) {
				System.out.println("Pairs of numbers..."+diff +", " +a[i]);
			}
			
		}
	}
}

public class TwoSumUsingSet {

	public static void main(String[] args) {
		int a [] ={ 19, 5, 1, 2, 18, 6, 8, 9, 0, -1, -9, 10, -2 };
		int sum =1;
		TwoSumProblemUsingSet.testTwoSumProblemUsingSet(a,sum);
	}

}
