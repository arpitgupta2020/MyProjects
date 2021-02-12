package com.arpit.general;
import java.util.Scanner;

class recurrsion{
	public static int displayInfo(int x){
		if(x==0){
			return 1;
		}
		return x*displayInfo(x-1);
	}
}
public class RecursionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(recurrsion.displayInfo(5));
		
		
		

	}

}
