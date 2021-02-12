package com.arpit.general;
import java.util.Scanner;


public class EventAndOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number= scanner.nextInt();
		int cntEven=0,cntOdd=0,sumEven=0,sumOdd=0;
		while(number>0){
			if(number%2==0){
				cntEven++;
				sumEven=sumEven+number;
			}
			else{
				cntOdd++;
				sumOdd=sumOdd+number;
			}
			number--;
			
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}

}
