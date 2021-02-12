package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//https://leetcode.com/problems/pacific-atlantic-water-flow/

//https://www.youtube.com/watch?v=LVlihRYfVVw

class PacificAtlanticWaterFlowSolution {

	public List<List<Integer>> pacificAtlantic(int[][] matrix) {

		int[][] pactificOcean = new int[matrix.length][matrix[0].length];
		int[][] atlanticOcean = new int[matrix.length][matrix[0].length];

		//top and bottom

		for (int col = 0; col < matrix[0].length; col++) {
			dfs(matrix, 0, col, Integer.MIN_VALUE, pactificOcean); // first row
			dfs(matrix, matrix.length - 1, col, Integer.MIN_VALUE, atlanticOcean); // last row
		}

		//left and right
		for (int row = 0; row < matrix.length; row++) {
			dfs(matrix, row, 0, Integer.MIN_VALUE, pactificOcean); // first col
			dfs(matrix, row, matrix.length - 1, Integer.MIN_VALUE, atlanticOcean); // last col
		}

		List<List<Integer>> res = new ArrayList<List<Integer>>();

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (pactificOcean[i][j] == 1 && atlanticOcean[i][j] == 1) {

					LinkedList<Integer> sol = new LinkedList<Integer>();
					sol.add(i);
					sol.add(j);
					res.add(sol);

				}
			}
		}
		return res;

	}

	private static void dfs(int[][] matrix, int row, int col, int preVal, int[][] ocean) {

		//1. Check necessary conditions

		if (row < 0 || row > matrix.length - 1 || col < 0 || col > matrix[0].length - 1 || ocean[row][col] == 1
				|| matrix[row][col] < preVal) {
			return;
		}

		// Process the cells
		ocean[row][col] = 1;

		//3. Call DFS as needed
		dfs(matrix, row - 1, col, matrix[row][col], ocean);
		dfs(matrix, row + 1, col, matrix[row][col], ocean);
		dfs(matrix, row, col - 1, matrix[row][col], ocean);
		dfs(matrix, row, col + 1, matrix[row][col], ocean);

	}
}

public class PacificAtlanticWaterFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
