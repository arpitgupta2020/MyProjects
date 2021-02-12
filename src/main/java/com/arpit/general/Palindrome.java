package com.arpit.general;
import java.util.Scanner;


public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number= scanner.nextInt();
		int n=number;
		int reverse=0,reminder;
		while(number>0){
			reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
			
		}
        if(reverse==n){
        	System.out.println("Is a Palindrome Number");
        }
        else{
        	System.out.println("Not a Palindrome number");
        }
	}

}
