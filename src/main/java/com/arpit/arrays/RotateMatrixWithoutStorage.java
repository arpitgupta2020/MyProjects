package com.arpit.arrays;

import java.util.Arrays;
import java.util.Collections;

//https://www.youtube.com/watch?v=K4JJCXaKibY
//https://leetcode.com/problems/rotate-image/

//https://www.youtube.com/watch?v=V9dZ-qqCLmc

class RotateMatrixWithoutStorageSolution {

	//Rotate Matrix by 90 (clock-wise)
	//First Reverse the matrix
	//Transpose the matrix
	public static void testRotateMatrixBy90WithoutStorage(int[][] matrix) {

		Collections.reverse(Arrays.asList(matrix)); // Reverse the matrix

		// One way to transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[j][i] + "   ");
			}
			System.out.println(" ");
		}

		// Other way to transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	//Rotate Matrix by 90 (Anti clock-wise)
	//Transpose the matrix
	//Reverse elements the matrix
	public static void testRotateMatrixBy90AntiClockWiseWithoutStorage(int[][] matrix) {

		// One way to transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[j][i] + "   ");
			}
			System.out.println(" ");
		}

		// Other way to transpose
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		Collections.reverse(Arrays.asList(matrix)); // Reverse the matrix
	}
}

public class RotateMatrixWithoutStorage {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		RotateMatrixWithoutStorageSolution.testRotateMatrixBy90WithoutStorage(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "   ");
			}
			System.out.println(" ");
		}

	}

}
