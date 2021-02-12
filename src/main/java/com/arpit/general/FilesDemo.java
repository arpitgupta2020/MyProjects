package com.arpit.general;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;


//https://www.youtube.com/watch?v=awVeBIkhlcE


public class FilesDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("/Users/kabothu/Documents/MyProjects/MyProjects/MyPrep/WordCountFile.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		
		
		//String[] split = br.readLine().split(" ");
		
		//System.out.println(split[0]);

		File file = new File("/Users/kabothu/Documents/MyProjects/MyProjects/MyPrep/WordCountFile.txt");

		//List<String> lines = FileUtils.readLines(file, "UTF-8");
		
		String input = "Tirupathi Balaji";
		
		
		/*List<String> lines = FileUtils.readLines(file);
		
		for(String s : lines) {
			
			if(s.equals("Orange")) {
				FileUtils.write(file, "\n", true);
				FileUtils.write(file, input, true);
			}
		}*/
		
		String fc = FileUtils.readFileToString(file);
		
		StringBuffer sbf = new StringBuffer(fc);
		
		if(fc.contains("Orange")) {
			sbf.append("Guava");
		}
		
		
		

		

	}

}
