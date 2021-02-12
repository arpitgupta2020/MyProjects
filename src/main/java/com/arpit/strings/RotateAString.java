package com.arpit.strings;

import java.util.Arrays;

public class RotateAString {
	
	public static void leftRotate(String[] s1, int n) {
		
		String temp = null;
		for(int i=0;i<n;i++) {
			temp = s1[0];
			
			for(int j=0;j<s1.length-1;j++) {
				s1[j] = s1[j+1];
			}
	        s1[s1.length-1] = temp;
		}
		System.out.println(Arrays.toString(s1));
	}
	
	public static void main(String[] args) {
		
		String s1 = "Hello How are you my friend";
		String[] s1Array = s1.split(" ");
		
		RotateAString.leftRotate(s1Array, 2);
		
		
	}

}

/*class testDummy {

public static void swap(String[] str, int start, int end){
  
  while(start < end) {
    
    String temp = str[start];
    str[start] = str[end];
    str[end] = temp;
    start++;
    end--;
  }
}


public static void testThreeSum(String[] str, int r, int n) {
  
  swap(str, 0, n-1);
  swap(str, 0, r-1);
  swap(str, r, n-1);
  
  for(int i=0; i<str.length;i++){
    
    System.out.println(str[i]);
    
  }
  
}

}
class Solution {
public static void main(String[] args) {
  String input = "Lord Balaji is Great God";
  String[] str = input.split(" ");
  int r = 2;
  int n = str.length;
  testDummy.testThreeSum(str,r,n);
  
  
}
}
*/