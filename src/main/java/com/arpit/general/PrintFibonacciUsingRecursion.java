package com.arpit.general;

public class PrintFibonacciUsingRecursion {

	public static void main(String args[]) {
	
		PrintFibonacciUsingRecursion p= new PrintFibonacciUsingRecursion();
		p.printFibonacciSeries(0,1,1);
	}
	
	public void printFibonacciSeries(int a, int b, int num) {
		
		if(num > 2 && num <= 10 ) {
			int c=a+b;
			System.out.println(c);
			printFibonacciSeries(b, c, num+1);
		}else if (num ==1 ) {
			System.out.println(a);
			printFibonacciSeries(a, b, num+1);
		}else if (num == 2 ) {
			System.out.println(b);
			printFibonacciSeries(a, b, num+1);
		}
	}

}
