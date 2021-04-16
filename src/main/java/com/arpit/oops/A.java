package com.arpit.oops;

class B{
	void show() {
		System.out.println("Show in class B");
	}
	
	void show1() {
		System.out.println("Show1 in class B");
	}
}

class  C extends B{
	void show() {
		System.out.println("Show in class C");
	}
	
	void show2() {
		System.out.println("Show2 in class C");
	}
}

public class A extends C{
	
	void show() {
		System.out.println("Show in class A");
	}
	
	void show3() {
		System.out.println("Show3 in class A");
	}
	
	public static void main(String[] args) {
		A ob= new A();
		
		ob.show();
		ob.show2();
	}

}
