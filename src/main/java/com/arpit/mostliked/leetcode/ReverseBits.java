package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=K0EHvvbUdEg

//https://leetcode.com/problems/reverse-bits/

class ReverseBitsSolution {

	public static int testReverseBitsSolution(int n) {

		//Base -10 : rev = rev * 10 + num % 10 ; num = num / 10;
		//Base -2 : rev = rev * 2 + num % 2 ; num = num / 2;
		//Bit wise  rev = (rev <<1) | (n & 1); n >>=1;

		int rev = 0;
		for (int i = 0; i < 32; ++i) {
			rev = (rev << 1) | (n & 1);
			n >>= 1; // n right shift by 1
		}

		return rev;
	}

}

public class ReverseBits {

	public static void main(String[] args) {
		int input = 00110;
		
		//output should be - 01100
		System.out.println(ReverseBitsSolution.testReverseBitsSolution(input));

	}

}
