package com.arpit.strings;

import java.util.HashMap;
import java.util.Map;

//for
//abcfor

class SubStringOfOther {
	
	public static boolean isSubSequence(String str1, String str2,int m,int n) {
		{ 
			// Base Cases 
			if (m == 0) 
				return true; 
			if (n == 0) 
				return false; 
				
			// If last characters of two strings are matching 
			if (str1.charAt(m-1) == str2.charAt(n-1)) 
				return isSubSequence(str1, str2, m-1, n-1); 

			// If last characters are not matching 
			return isSubSequence(str1, str2, m, n-1); 
		} 
		
	}
}

public class IsSubStringOfOther {

	public static void main(String[] args) {
		String str1 ="for";
		String str2 ="geeksfor";
		int m = str1.length(); 
		int n = str2.length(); 
		boolean res = SubStringOfOther.isSubSequence(str1, str2, m, n); 
		if(res)  {
			System.out.println("Yes"); 
		}
		else {
			System.out.println("No"); 
		}
	}

}
