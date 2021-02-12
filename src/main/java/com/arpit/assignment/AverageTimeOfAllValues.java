package com.arpit.assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class AverageTimeCalculation {

	public static float testAverageTimeCalculation(String filePath) {

		//Base Conditions to check null case and if the length is 0
		if (filePath == null || filePath.length() == 0) {
			System.out.println("Please enter a valid File Path");
		}
		float totalTime = 0;
		int countRecords = 0;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.getMessage();
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String readLine = "";
		try {
			while ((readLine = br.readLine()) != null) {
				String[] completeStatement = readLine.split("=");

				if (completeStatement == null || completeStatement.length == 0) {
					System.out.println("Please check entries in the file");// Show proper message to ender user to take some action
				}

				String[] timePeriod = completeStatement[1].split(" ");
				if (timePeriod == null || timePeriod.length == 0) {
					System.out.println("Please check entries in the file");// Show proper message to ender user to take some action
				}
				totalTime = totalTime + Float.valueOf(timePeriod[1]);
				countRecords++;

			}
		} catch (IOException e) {

			e.getMessage();
		}

		return totalTime / countRecords;
	}
}

public class AverageTimeOfAllValues {

	public static void main(String[] args) throws IOException {
		String currentDir = System.getProperty("user.dir");
		String filePath = (currentDir + "/results.txt").replace('\\', '/');
		float averageTimeTaken = AverageTimeCalculation.testAverageTimeCalculation(filePath);
		System.out.println("Average time taken in seconds" + "  " + averageTimeTaken);

	}

}
