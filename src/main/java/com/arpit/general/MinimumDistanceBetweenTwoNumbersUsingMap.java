package com.arpit.general;

import java.util.ArrayList;
import java.util.HashMap;

class MinimumDistanceBetweenTwoNumbersMap {
	
	public static int testMinimumDistanceBetweenTwoNumbers(int[] a, int x, int y) {
		
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		
		for(int i=0; i<a.length;i++) {
			
			if(map.containsKey(a[i])) {
				map.get(a[i]).add(i);
			}else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map.put(a[i], list);
			}
		}
		ArrayList<Integer> l1 = map.get(x);
		ArrayList<Integer> l2 = map.get(y);
		
		int result = Integer.MAX_VALUE;
		
		for(int i1:l1) {
			for(int i2:l2) {
				result = Math.min(result, Math.abs(i1-i2));
			}
		}
		return result;
		
		
	}
}

public class MinimumDistanceBetweenTwoNumbersUsingMap {

	public static void main(String[] args) {
		int a[] = {2, 5, 3, 5, 4, 4, 2, 3};
		int x = 3, y = 2;
		int result = MinimumDistanceBetweenTwoNumbersMap.testMinimumDistanceBetweenTwoNumbers(a, x, y);
		System.out.println("Minimum Distance:  " +result);

	}

}
