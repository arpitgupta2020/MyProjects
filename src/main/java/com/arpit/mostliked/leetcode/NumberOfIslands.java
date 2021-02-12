package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=CLvNe-8-6s8

//https://leetcode.com/problems/number-of-islands/

class NumberOfIslandsSolution {

	public static int testNumberOfIslands(char[][] grid) {

		if (grid == null || grid.length == 0) {
			return 0;
		}

		int islandCount = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == '1') {
					// You hit a 1 and increment island Count
					++islandCount;

					//change any other 1's(land) that are connected horizontally or vertically to zero's(water)
					changeLandToWater(grid, i, j);
				}
			}
		}
		return islandCount;
	}

	private static void changeLandToWater(char[][] grid, int i, int j) {

		//Base conditions
		//row less than 0
		//row greather than or equal to row length
		//column less than 0
		//column greather than or equal to column length
		//if position is a '0'(water)

		if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0')
			return;
		// we know the position must be a '1' then make that to '0'
		grid[i][j] = '0';
		changeLandToWater(grid, i - 1, j); // top
		changeLandToWater(grid, i + 1, j); // down
		changeLandToWater(grid, i, j - 1); // left
		changeLandToWater(grid, i, j + 1); // right
	}
}

public class NumberOfIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
