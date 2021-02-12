package com.arpit.evenOddUsingThread;

public class EvenOddDriver {

	public static void main(String[] args) {
		PrintEvenOdd peo= new PrintEvenOdd(1, 30);
		
		Thread even= new Thread(new EvenThread(peo));
		even.setName("Even Thread : ");
		
		Thread odd= new Thread(new OddThread(peo));
		odd.setName("Odd Thread  : ");
		
		even.start();
		odd.start();
	}

}
