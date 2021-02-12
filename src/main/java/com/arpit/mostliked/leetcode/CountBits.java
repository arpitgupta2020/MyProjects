package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=rr0PoPHmmGo

//https://leetcode.com/problems/counting-bits/


class CountBitsSolution {
	public static int[] countBits(int num) {
	    int[] result = new int[num+1];
	 
	    int p = 1; //p tracks the index for number x
	    int pow = 1;
	    for(int i=1; i<=num; i++){
	        if(i==pow){
	            result[i] = 1;
	            pow = pow *  2;
	            p = 1;
	        }else{
	            result[i] = result[p]+1;
	            p++;
	        }
	 
	    }
	 
	    return result;
	}
}

public class CountBits {

	public static void main(String[] args) {
		int num = 7;
		int[] result = CountBitsSolution.countBits(num);
		
		for(int i : result) {
			System.out.println(i);
		}

	}

}
