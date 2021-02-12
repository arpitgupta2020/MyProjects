package com.arpit.general;

class PrintDisplayBoard {
	
	public static void displayBoard(int numOfChar, int numOfLines) {
		
		String s;
		for(int i=1;i<=numOfLines;i++) {
			  s = "";
			for(int j=1;j<=numOfChar;j++) {
				if(j%2==0) {
				 s = s+"o";	
				}else {
				 s = s+"x";
				}
				
			}
			System.out.println(s);
			System.out.println("\n");
		}
	}
	
}

public class PrintAlternateValues {
	
	public static void main(String[] args) {
		PrintDisplayBoard.displayBoard(2, 2);
	}

}
