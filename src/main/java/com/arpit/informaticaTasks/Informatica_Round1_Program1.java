package com.arpit.informaticaTasks;

import org.openqa.selenium.JavascriptExecutor;

//{5,6}, {8,3}, {11,0}
public class Informatica_Round1_Program1 {

	public static void main(String[] args) {
		int[] array= {5,6,7,8,3,4,11,0,1};
		int k= 11;
		
		printSumCombinations(array, k);
	}

	
	//Solution 1
	private static void printSumCombinations(int[] array, int k) {
		
		int num_sum=0;
		for(int i= 0; i< array.length-1; i++) {
			for(int j=i+1; j< array.length; j++ ) {
				num_sum= array[i]+ array[j];
				if(num_sum == k) {
					System.out.println(array[i]+" "+array[j]);
					break;
				}
			}
		}
	}

}
