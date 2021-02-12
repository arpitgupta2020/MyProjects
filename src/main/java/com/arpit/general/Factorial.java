package com.arpit.general;
import java.util.Scanner;


public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number= scanner.nextInt();
		int result=1;
		while(number>0){
			result=result*number;
			number--;
			
		}
		System.out.println(result);
	}

}
