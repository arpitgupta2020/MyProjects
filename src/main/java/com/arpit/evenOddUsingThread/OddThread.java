package com.arpit.evenOddUsingThread;

public class OddThread implements Runnable{
	
	PrintEvenOdd peo;
	
	public OddThread(PrintEvenOdd peo) {
		this.peo=peo;
	}

	@Override
	public void run() {
		peo.printOdd();		
	}

}
