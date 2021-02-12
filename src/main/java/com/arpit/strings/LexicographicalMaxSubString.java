package com.arpit.strings;

//https://www.geeksforgeeks.org/lexicographical-maximum-substring-string/

public class LexicographicalMaxSubString {

	public static void main(String[] args) {
		
		String mx="";
		String str = "aaa";
		
		for(int i=0; i<str.length(); i++) {
			
			if(mx.compareTo(str.substring(i))<=0) {
				mx= str.substring(i);
			}
			
		}
		System.out.println(mx);
	}

}
