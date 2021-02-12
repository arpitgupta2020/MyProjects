package com.arpit.arrays;

/*
    0  1
    
0   0  1

1   2  3 */

class SolveRoverProblem {

	static int[][] matrix = new int[2][2];
	int i = 0, j = 0;
	static int currentPosition;
	int presentPosition;

	public void getRoverPosition (String command) {

			if (command.equals("L")) {
				j = j - 1;
				presentPosition = currentPosition(i, j);
				
			}else if (command.equals("R")) {
				j = j + 1;
				presentPosition = currentPosition(i, j);
				
			}else if (command.equals("U")) {
				i = i - 1;
				presentPosition = currentPosition(i, j);
				
			}else if (command.equals("D")) {
				i = i + 1;
				presentPosition = currentPosition(i, j);
			}
}
	
	public static int currentPosition(int i, int j) {
		if (i < 0 || j < 0) {
			System.out.println("Invalid command");
		} else if (i < matrix.length && j < matrix.length) {
			currentPosition = matrix[i][j];
		} else {
			System.out.println("Matrix size exceeded");
		}
		return currentPosition;
	}
}

public class RoverControl {

	public static void main(String[] args) {

	}

}
