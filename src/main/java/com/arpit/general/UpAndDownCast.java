package com.arpit.general;
class k1{
	void test1(){
		System.out.println("test1");
	}
}
class k2 extends k1{
	void test1(){
		System.out.println("test2");
	}
	
}
class k3 extends k2{
	void test1(){
		System.out.println("test3");
	}
	
}
public class UpAndDownCast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		k1 k=new k3();
		k.test1();
		/*System.out.println("Down Casting");
		k3 dc=(k3)k;
		dc.test1();*/
		
		

	}

}
