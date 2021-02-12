package com.arpit.general;

public class TopTwoMaxNumbers {
	
	public static void main(String[] args) {
		int[] nums = {5,34,78,2,45,1,99,23};
		int topMaxOne = 0;
		int topMaxTwo = 0;
		for(int n:nums) {
			if(topMaxOne < n) {
				topMaxTwo = topMaxOne;
				topMaxOne = n;
			}else if(topMaxTwo < n) {
				topMaxTwo = n;
			}
		}
		System.out.println(topMaxOne);
		System.out.println(topMaxTwo);
	}

}
