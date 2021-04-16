package com.arpit.myPrep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.internal.junit.ArrayAsserts;

// 3, 2, 1, 6, 5, 4, 9, 8, 7, 10
public class Oracle_Task1 {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6,7,8,9,10};
		int k = 3;

		printReverseSequence(array, k);
	}

	private static void printReverseSequence(int[] array, int k) {
		int size= array.length;
		int totalSubsets = size/k;
		int subsetCount=0;
		int counter=0;
		List<Integer> result= new ArrayList<>();
		List<Integer> reverseSequence= new ArrayList<>();
		
		for(int i =0; i< size; i++) {
			
			if(subsetCount < k && counter < totalSubsets) {
				result.add(array[i]);
				subsetCount++;
				if(subsetCount == k) {
					Collections.reverse(result);
					reverseSequence.addAll(result);
					result= new ArrayList<>();
					subsetCount=0;
					counter++;
				}
				
			}else if(counter == totalSubsets) {
				result.add(array[i]);
				if(i == size-1) {
					Collections.reverse(result);
					reverseSequence.addAll(result);
				}
			}
		}
		
		System.out.println(reverseSequence);
	}

}















