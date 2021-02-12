package com.arpit.mostliked.leetcode;

//Not need to look for now

//https://leetcode.com/problems/target-sum/

class TargetSumSolution {
	
	static int count =0;
	
	public static int testTargetSumSolution(int[] num, int S) {
		
		calculateSum(num, 0, 0, S);
		return count;
	}
	
	private static void calculateSum(int[] num, int i, int sum, int S) {
		
		if(i== num.length) {
			
			if(sum == S) {
				count ++;
			}
		}else {
			calculateSum(num, i+1, sum + num[i], S); // for positive
			calculateSum(num, i+1, sum - num[i], S); // for negative
		}
	}
}

public class TargetSum {

	public static void main(String[] args) {
		int[] num = {1, 1, 1, 1, 1};
		int S = 3;
		System.out.println(TargetSumSolution.testTargetSumSolution(num, S));

	}

}
