package com.arpit.arrays;

//Solution-1

// (N+1)*(N+2)/2 - Sum of all elements in an array where N is length of array

// N*(N+1)/2 - Where N is the last element

//Solution-2

// XOR all the elements in an array using for loop like A1 ^ A2 ^ A4 ^ A5 ^ A6 and let it be X1

// XOR all elements from 1 to 6 in for loop A1 ^ A2 ^A3 ^ A4 ^ A5 ^ A6 and let it be X2

// XOR again X1 ^ X2

class MissingElement {

	public static int testMissingElement(int[] array) {

		int length = array.length;

		int nthElement = ((length + 1) * (length + 2)) / 2;

		int sumOfElements = 0;

		for (int i = 0; i < array.length; i++) {

			sumOfElements = sumOfElements + array[i];
		}

		return (nthElement - sumOfElements);

	}

	public static int testUsingXor(int[] array) {

		int x1 = array[0];

		int x2 = 1;

		for (int i = 1; i < array.length; i++) {

			x1 = x1 ^ array[i];

		}

		for (int i = 2; i <= array.length + 1; i++) {

			x2 = x2 ^ i;

		}

		return x1 ^ x2;
	}
}

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] array = { 1, 2, 4, 5, 6 };

		System.out.println(MissingElement.testMissingElement(array));

	}

}
