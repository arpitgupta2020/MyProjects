package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/sum-of-two-integers/

//https://github.com/bephrem1/backtobackswe/blob/master/Arrays,%20Primitives,%20Strings/AdditionWithOnlyBitshifting/AdditionWithOnlyBitshifting.java

//https://www.youtube.com/watch?v=qq64FrA2UXQ

class SumOfIntegersSolution {

	public static int testSumOfIntegersSolution(int a, int b) {

		//& - Both needs to be true

		//XOR - Either can be true but not both

		//<<- leftshit: 0010 will be 0100(shift one bit to left and add 0 at the end)

		while (b != 0) {

			int carry = a & b;

			a = a ^ b;

			b = carry << 1;
		}
         return a;
	}
}

public class SumOfIntegers {

	public static void main(String[] args) {
		System.out.println(SumOfIntegersSolution.testSumOfIntegersSolution(3, 2));

	}

}
