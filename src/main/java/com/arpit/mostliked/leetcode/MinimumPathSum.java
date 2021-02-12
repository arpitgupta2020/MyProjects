  package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=0JONSdOAj9c

//https://leetcode.com/problems/minimum-path-sum/

class MinimumPathSumSolution {

	// tc -> m*n, sc-> 1
	public int minPathSum(int[][] grid) {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (i > 0 && j == 0) { // this is for rows
					grid[i][j] += grid[i - 1][j]; // we add the top side
				} else if (i == 0 && j > 0) { // this is for columns
					grid[i][j] += grid[i][j - 1]; // we add the left side
				} else if (i > 0 && j > 0) {
					grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
				}
			}
		}
		return grid[grid.length - 1][grid[0].length - 1];
	}
}

public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
