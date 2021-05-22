package com.arpit.latestPractisePrograms;

import java.util.stream.IntStream;

/**
* Arpit Gupta
*/

/*
 * Print 1 to 100 Without Using for/while/do-while Loop in Code 
 * 1.Using Recursive
 * 2.Using Streams
 */

public class PrintNumberSeriesWithoutUsingLoop {

	public static void main(String[] args) {
		
		System.out.println("**********Using Recursion****************");
		printNumbers(1);
		System.out.println("**********Using Recursion between Start and End Range****************");
		printNumbers(5, 40);
		System.out.println("**********Using Streams****************");
		printNumbersUsingStream();
	}

	private static void printNumbers(int num) {
		if(num <= 20) {
			System.out.println(num);
			num++;
			printNumbers(num);
		}
	}
	
	// Print numbers within start and end range
	private static void printNumbers(int num_start, int num_end) {
		if(num_start <= num_end) {
			System.out.println(num_start);
			num_start++;
			printNumbers(num_start, num_end);
		}		
	}
	
	private static void printNumbersUsingStream() {
		IntStream.range(9, 91).forEach(e -> System.out.println(e));
	}

}
