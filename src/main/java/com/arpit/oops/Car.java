package com.arpit.oops;

public class Car extends Vehicle_Abstract {

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Starts with key");
	}
	
	public static void main(String[] args) {
		Bike carObj= new Bike();
		carObj.start();
			
	}
	
	
}
