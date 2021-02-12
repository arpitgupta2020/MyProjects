package com.arpit.mostliked.leetcode;

//https://leetcode.com/problems/number-of-1-bits/solution/



class NumberOf1BitsSolution {
	
	//In the binary representation, the least significant 1-bit in n always corresponds to a 0-bit in n - 1. Therefore, anding the two numbers n and n - 1 always flips the least significant 1-bit in n to 0, and keeps all other bits the same.
    //Using this trick, the code becomes very simple.
	public static int testNumberOf1BitsSolution(int n) {
		
		int count =0;
		while(n!=0) {
			count ++;
			n = n & (n-1);
		}
		
		return count;
	}
	
	//The solution is straight-forward. We check each of the 32 bits of the number. If the bit is 1, we add one to the number of 1-bits.
    //We can check the i^{th} bit of a number using a bit mask. We start with a mask m=1, because the binary representation of 1 is,
    //0000 0000 0000 0000 0000 0000 0000 000100000000000000000000000000000001 Clearly, a logical AND between any number and the mask 1 gives us the least significant bit of this number. To check the next bit, we shift the mask to the left by one.
	
	public int hammingWeight(int n) {
	    int count = 0;
	    int mask = 1;
	    for (int i = 0; i < 32; i++) {
	        if ((n & mask) != 0) {
	            count++;
	        }
	        mask <<= 1;
	    }
	    return count;
	}
}

public class NumberOf1Bits {

	public static void main(String[] args) {
		int n = 00000000000000000000000000001011;
		int n1 = 2;
		System.out.println(NumberOf1BitsSolution.testNumberOf1BitsSolution(n));

	}

}
