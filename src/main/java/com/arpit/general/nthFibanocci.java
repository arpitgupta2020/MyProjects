package com.arpit.general;
class fibanocciTestExample{
	
	public static int fibanocciTest(int n){
		if(n==0){
			return 0;
		}
		if(n<=2){
			return 1;
		}
		return fibanocciTest(n-1)+fibanocciTest(n-2);
	}
	
}
public class nthFibanocci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fibanocciTestExample.fibanocciTest(5));
		

	}

}
