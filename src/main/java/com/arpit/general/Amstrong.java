package com.arpit.general;
import java.util.Scanner;



public class Amstrong {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number= scanner.nextInt();
		int result = 0;
        int orig = number;
        while(number != 0){
            int remainder = number%10;
            result = result + remainder*remainder*remainder;
            number = number/10;
        }
        //number is Armstrong return true
        if(orig == result){
            System.out.println("Is an Amstrong");;
        }
        else {
			System.out.println("Not an amstrong");
		}
      
    } 
  

}
