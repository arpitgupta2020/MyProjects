package com.arpit.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class UnSortedArrayToSortedArraySolution {
	
	public static List<Integer> testUnSortedArrayToSorted(int[] array) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		for(int i=0; i<array.length; i++) {
			minHeap.add(array[i]);
			
			
		}
		while(!minHeap.isEmpty()) {
			
			list.add(minHeap.remove());
			
		}
		
		return list;
	}
}

public class UnSortedArrayToSorted {

	public static void main(String[] args) {
		int[] array = {5,7,1,4,9,23,11};
		List<Integer> list = UnSortedArrayToSortedArraySolution.testUnSortedArrayToSorted(array);
		for(int i:list) {
			System.out.println(i);
		}

	}

}
