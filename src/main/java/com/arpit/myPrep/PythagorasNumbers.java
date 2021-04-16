package com.arpit.myPrep;

import java.util.Arrays;

public class PythagorasNumbers {

	public static void main(String[] args) {
		int arr[]= {4,1, 25, 16, 9, 125, 36};
		
		Arrays.sort(arr);
		
		int last= arr[arr.length-1];
		
		
		for(int j=arr.length-2; j>0; j--) {
			for(int i=0; i< j; i++) {
				if(arr[i]+arr[j] == last) {
					
					System.out.println(last+" is square of- "+arr[i]+" & "+arr[j]);
					break;
				}
			}
			last= arr[j-1];
			
		}
		
	}

}
