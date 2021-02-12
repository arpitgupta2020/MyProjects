package com.arpit.strings;

import java.util.LinkedList;
import java.util.Queue;

//Output is formed from the Input Strings
//Characters order is maintained

//INPUT1: BOY 
//INPUT2: GIRL

//VALID OUTPUTS: BGIORYL,BOYGIRL,GIRLBOY,BGIRLOY,BOGIRLY
//INVALID OUTPUT: BYORLIG, YOBGIRL, BIGRLOY

class testDummy {

	public static boolean testThreeSum(String input1, String input2, String output) {

		Queue<Character> q1 = new LinkedList<Character>();

		Queue<Character> q2 = new LinkedList<Character>();

		for (Character c1 : input1.toCharArray()) {

			q1.offer(c1);

		}

		for (Character c2 : input2.toCharArray()) {

			q2.offer(c2);

		}

		for (int i = 0; i < output.length(); i++) {

			if (!q1.isEmpty() && output.charAt(i) == q1.peek()) {

				q1.poll();
			} else if (!q2.isEmpty() && output.charAt(i) == q2.peek()) {

				q2.poll();

			} else {

				return false;

			}

		}

		return q1.isEmpty() && q2.isEmpty();
	}

}

public class OrderMaintainingOfOutputString {

	public static void main(String[] args) {
		String input1 = "BOY";
		String input2 = "GIRL";
		String output = "BOYGIRL";
		System.out.println(testDummy.testThreeSum(input1, input2, output));
	}

}


/*
 * class testDummy {
  
  
  public static boolean testThreeSum(String input1, String input2, String output) {
    
    char[] c1 = input1.toCharArray();
    
    char[] c2 = input2.toCharArray();
    
    int j=0, k=0;
    
    boolean flag = false;
    
    for(int i=0; i<output.length(); i++){
      
      
      
      if(j<c1.length && output.charAt(i)==c1[j]){
          
             j++;
      
      }else if(k<c2.length && output.charAt(i)==c2[k]) {
          
             k++;
      }else {
        
         return false;
      }
      
    }
    
    return true;
  }
  
}
class Solution {
  public static void main(String[] args) {
    String input1 = "BOY";
    String input2 = "GIRL";
    String output = "BOGIRLY";
    System.out.println(testDummy.testThreeSum(input1,input2,output));
      
  }
}*/
