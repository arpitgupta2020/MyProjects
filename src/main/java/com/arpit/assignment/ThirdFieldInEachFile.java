package com.arpit.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*There is a directory called "TestLogs". In that directory there are many different files. 
 * Files that end in .log contain information that we are interested in. 
 * There is a line in the file that begins with "DeviceInfo". 
 * That line contains 5 fields separated by tabs. 
 * Write a Java Program that prints out the 3rd field in each file that ends in .log
*/
class ThirdFieldInEachFileSolution {

	private static final String word = "DeviceInfo";
	private static final String tab = "\t";

	// Check if the file contains Device Info and prints 3rd field in each file
	public static void checkIfContains(File file) {

		if (file == null || file.length() == 0 || !file.exists()) {
			System.out.println("Please check if the file exists and is proper");
		}
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while (scanner.hasNextLine()) { // Keep scanning till EOF
				final String line = scanner.nextLine();
				if (line.startsWith(word)) { // Check if line starts with device info
					String[] fields = line.split(tab);
					if (fields == null || fields.length < 3)
						continue;
					System.out.println(line.split(tab)[3]); // prints the 3rd field
					break;
				}
			}
		} catch (FileNotFoundException e) {
			e.getMessage();
		}

	}

}

public class ThirdFieldInEachFile {

	public static void main(String[] args) {

		String currentDir = System.getProperty("user.dir");
		String directory = (currentDir + "/src/main/resources/TestLogs").replace('\\', '/');
		File dir = new File(directory);// Reading into directories
		File[] files = dir.listFiles((d, fileName) -> fileName.endsWith(".log"));// Filter files which ends with .log as extension

		for (File file : files) {
			try {
				ThirdFieldInEachFileSolution.checkIfContains(file);
			} catch (Exception e) {
				e.getMessage();
			}
		}

	}

}
