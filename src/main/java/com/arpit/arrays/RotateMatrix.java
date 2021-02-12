package com.arpit.arrays;

public class RotateMatrix {

	public static void main(String[] args) {
		new RotateMatrix();
	}

	public RotateMatrix() {
		int[][] matrix = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };;

		System.out.println("Original Matrix :");
		printMatrix(matrix);

		int[][] rotatedMatrix = rotateMatrixBy90DegreeClockwise(matrix);
		System.out.println("Rotated Matrix :");
		printMatrix(rotatedMatrix);
	}

	// Rotate Matrix to 90 degree toward Right(clockwise)
	private int[][] rotateMatrixBy90DegreeClockwise(int[][] matrix) {

		int totalRowsOfRotatedMatrix = matrix[0].length; // Total columns of Original Matrix
		int totalColsOfRotatedMatrix = matrix.length; // Total rows of Original Matrix

		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[j][(totalColsOfRotatedMatrix - 1) - i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	// Rotate Matrix to 90 degree toward Left(counter clockwise)
	private int[][] rotateMatrixBy90DegreeCounterClockwise(int[][] matrix) {

		int totalRowsOfRotatedMatrix = matrix[0].length; // Total columns of Original Matrix
		int totalColsOfRotatedMatrix = matrix.length; // Total rows of Original Matrix

		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix][totalColsOfRotatedMatrix];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				rotatedMatrix[(totalRowsOfRotatedMatrix - 1) - j][i] = matrix[i][j];
			}
		}
		return rotatedMatrix;
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println();
		}
	}
}