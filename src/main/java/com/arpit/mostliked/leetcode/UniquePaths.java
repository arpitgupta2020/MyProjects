package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=rdu3YVZ3KD4
//https://leetcode.com/problems/unique-paths/

class UniquePathsSolution {
	
	public static int testUniquePaths(int m, int n) {
		
		if(m==0 || n==0) {
			return 0;
		}
		
		int[][] dp = new int[m][n];
		
		for(int j=0; j<n; ++j) {
			dp[0][j] =1;
		}
		
		for(int i=0; i<m; ++i) {
			dp[i][0] =1;
		}
		
		for(int i=1; i<m; ++i) {
			for(int j=1; j<n; ++j) {
				
				dp[i][j] = dp[i][j-1]+ dp[i-1][j]; // robo can go left or top
			}
		}
		
		return dp[m-1][n-1];
		
		
	}
}

public class UniquePaths {

	public static void main(String[] args) {
		int m = 7; int n=3;
		System.out.println(UniquePathsSolution.testUniquePaths(m, n));

	}

}
