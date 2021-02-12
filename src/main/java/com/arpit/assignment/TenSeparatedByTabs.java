package com.arpit.assignment;

import java.io.FileOutputStream;
import java.io.IOException;

/*Write a Java Program that creates a file called "Numbers.txt" 
 * and prints numbers from 1 to 100 in columns of ten separated by tabs. 
 * However, for any number ending in 5 or 0, print an asterisk instead of the number.
*/

class TenSeparatedByTabsSolution {

	private final static String tab = "\t";
	private final static String asterisk = "*";
	private final static String newLine = "\n";

	public static boolean isDivisible(int val) { // function to check if it is divisible by 5

		return (val % 5) == 0;
	}

	public static void testTenSeperateByTabSolution(String filePath) throws IOException {

		if (filePath == null || filePath.length() == 0) {
			System.out.println("Please provide a valid file path");
		}

		try {

			FileOutputStream fout = new FileOutputStream(filePath);

			for (int i = 0; i <= 9; i++) { //Generating 1 to 100 using multiplicative rules
				StringBuilder sb = new StringBuilder();

				for (int j = 1; j <= 10; j++) {

					int temp = (10 * i) + j;
					if (isDivisible(temp)) { // To check if the last digits are divisible by 5 or 0
						sb.append(asterisk);
						sb.append(tab);
					} else {
						sb.append(String.valueOf(temp)); //If not add temp and append with a tab
						sb.append(tab);
					}
				}
				fout.write(sb.toString().getBytes());// Write the entire string to a file
				fout.write(newLine.getBytes()); // Write new line to a file.
			}
			fout.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class TenSeparatedByTabs {

	public static void main(String[] args) throws IOException {
		String currentDir = System.getProperty("user.dir");
		String filePath = (currentDir + "/Numbers.txt").replace('\\', '/');
		TenSeparatedByTabsSolution.testTenSeperateByTabSolution(filePath);

	}

}
