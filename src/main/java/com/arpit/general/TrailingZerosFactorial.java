package com.arpit.general;

//https://www.youtube.com/watch?v=wdz_KouqHx4

class TrailingZeros {

	public static void trailingZerosTest(int factorialNum) {

		int sum = 0;
		int l = 2;
		int num = 0;
		int result = 5;

		while ((factorialNum / result) > 0) {

			num = (int) (factorialNum / result);
			sum = sum + num;
			result = (int) Math.pow(5, l);
			l++;

		}
		System.out.println(sum);

	}

}

public class TrailingZerosFactorial {

	public static void main(String[] args) {
		TrailingZeros.trailingZerosTest(125);

	}

}
