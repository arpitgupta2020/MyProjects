package com.arpit.general;
import java.util.Scanner;


public class Fibanocci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int f1,f2=0,f3=1;
		for(int i=1;i<=n;i++){
			System.out.println(""+f2+"");
			f1=f2;
			f2=f3;
			f3=f1+f2;
			
		}

	}

}
