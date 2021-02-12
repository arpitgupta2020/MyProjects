package com.arpit.assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//Write a Java Program that prints all lines containing "Apple" from a file called “file.txt". 

class FindAllLines {

	public static void testFindAllLines(String word, String filePath) {

		//Base Conditions to check null case and if the length is 0
		if (filePath == null || filePath.length() == 0) {
			System.out.println("Please enter a valid File Path");
		}

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.getMessage();
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String line;
		try {
			while ((line = br.readLine()) != null) { //read file line by line in a loop
				if (line.contains(word)) { // check if line contain that word then prints the line
					System.out.println(line);
				}
			}
		} catch (IOException e) {
			e.getMessage();
		}
	}

}

public class AllLinesContainingString {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		String filePath = (currentDir + "/file.txt").replace('\\', '/');
		FindAllLines.testFindAllLines("Apple", filePath);
	}

}
