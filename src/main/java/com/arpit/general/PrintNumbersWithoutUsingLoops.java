package com.arpit.general;

public class PrintNumbersWithoutUsingLoops {
	
	public static void main(String args[]) {
		int start=1;
		PrintNumbersWithoutUsingLoops p= new PrintNumbersWithoutUsingLoops();
		p.printNum(start);
	}
	
	
	
	public void printNum(int start) {
		
		if(start <= 10 ) {
			System.out.println(start);
			printNum(start+1);
		}
	}

}
