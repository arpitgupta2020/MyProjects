package com.arpit.informaticaTasks;

public class Informatica_Round2_Program1 {

	public static void main(String[] args) {
		int[] array= {12, 2, 13, 1, 10, 34, 1};
		findMinimumNumber(array);
	}

	private static void findMinimumNumber(int[] array) {
		int largest= array[0];
		int sec_largest=array[1];
		for(int i=2; i< array.length; i++) {
		//	sec_largest= array[i];
			
			if(largest < sec_largest) {
				sec_largest = largest;
				largest = array[i];
			}
		}
		System.out.println(sec_largest);
	}

}
