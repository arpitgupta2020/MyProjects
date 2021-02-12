//Program to convert number into a binary format
package com.arpit.strings;

class Binary{
	
	String binaryresult = "";
	int rem = 0;
	void testBinary(int n){
		while (n > 0) {
		    rem = (n % 2);// find the reminder of the number
		    n = n / 2; //find the Quotient of the number
		 binaryresult = (rem) + binaryresult;
		}
		System.out.print(binaryresult);
	}
}
public class BinaryNumber {

	public static void main(String[] args) {
		
		Binary b1= new Binary();
		b1.testBinary(25);
    }

}
