package com.arpit.evenOddUsingThread;

public class PrintEvenOdd {
	int start;
	int maxNumber;
	
	public PrintEvenOdd(int start, int maxNum) {
		super();
		this.start=start;
		this.maxNumber=maxNum;
	}
	
	public void printEven() {
		while(this.start<=maxNumber) {
			synchronized (this) {
				if(this.start%2==0) {
					System.out.println(Thread.currentThread().getName()+ start);
					start++;
					this.notify();					
				}else {
					try {
						wait();
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public void printOdd() {
		while(this.start<=maxNumber) {
			synchronized (this) {
				if(this.start%2!=0) {
					System.out.println(Thread.currentThread().getName()+ start);
					start++;
					this.notify();					
				}else {
					try {
						wait();
					}catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
