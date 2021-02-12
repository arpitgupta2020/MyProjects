package com.arpit.strings;

import java.io.File;

public class FilesExample {
	
	public static void main(String[] args) {
		
		File f = new File("/Users/kabothu/Documents/Java Training/Basics/src/StringClass");
		if(f.isDirectory()) {
			File [] listOfFiles = f.listFiles();
			for(File f2 : listOfFiles) {
				System.out.println(f2.getName());
			}
		}
	}

}
