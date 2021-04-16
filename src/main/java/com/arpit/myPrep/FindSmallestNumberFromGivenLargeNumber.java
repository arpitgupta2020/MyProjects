package com.arpit.myPrep;

//Given a number K of length N, the task is to find the smallest possible number that 
//can be formed from K of N digits by swapping the digits any number of times.

/*	Input: N = 15, K = 325343273113434
	Output: 112233333344457
	Explanation:
	The smallest number possible after swapping the digits of the given number is 112233333344457*/

public class FindSmallestNumberFromGivenLargeNumber {
	
	  
	// Function for finding the smallest 
	// possible number after swapping 
	// the digits any number of times 
	static String smallestPoss(String s, int n) 
	{ 
	    // Variable to store the final answer 
	    String ans = ""; 
	  
	    // Array to store the count of 
	    // occurrence of each digit 
	    int arr[] = new int[10]; 
	  
	    // Loop to calculate the number 
	    // of occurrences of every digit 
	    for (int i = 0; i < n; i++) 
	    { 
	        arr[Integer.parseInt(String.valueOf(s.charAt(i)))]++; 
	    } 
	  
	    // Loop to get smallest number 
	    for (int i = 0; i < 10; i++) 
	    { 
	        for (int j = 0; j < arr[i]; j++) 
	            ans = ans + String.valueOf(i); 
	    } 
	  
	    // Returning the answer 
	    return ans; 
	} 
	  
	
	// Driver code 
	public static void main(String[] args) 
	{ 
	    int N = 15; 
	    String K = "325343273113434"; 
	  
	    System.out.print(smallestPoss(K, N)); 
	} 
}
