package com.arpit.arrays;

class MatrixTransposeSolution {

	public static void testMatrixTransposeSolution(int[][] matrix) {

		int rows = matrix.length;
		int columns = matrix.length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println(" ");//new line    
		}
        System.out.println("-----------------------------");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[j][i] + "   ");
			}
			System.out.println(" ");
		}

	}
}

public class MatrixTranspose {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		MatrixTransposeSolution.testMatrixTransposeSolution(matrix);

	}

}
