package com.arpit.general;
import java.util.Scanner;


public class ScannerExample {
	
	 static  Scanner scanInput = new Scanner(System.in);
     static double p  = scanInput.nextDouble();
     static int t =scanInput.nextInt();
     static double rate =scanInput.nextDouble();
	
	public static double calculateSimpleInterest(double p,int t,double rate)
	{
		double si= p*t*rate/100;
		return si;
	}
	
	public static void main(String[] args)
	{
		
	    double res=calculateSimpleInterest(p,t,rate);
	 	System.out.println("Simple Interest"+ res);
	}

}
