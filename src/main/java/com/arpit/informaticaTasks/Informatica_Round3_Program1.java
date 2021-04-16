package com.arpit.informaticaTasks;

import java.util.Arrays;

//O/p- 111110000022222(pattern)

public class Informatica_Round3_Program1 {

	public static void main(String[] args) {
				
		int[] arr= {0,1,1,2,0,1,1,0,1,2,2,1,0,1,2,2,0,0,0,1,1,1,2};
		int i= 0;
		int j= arr.length-1;
		int start=0;
		int end= arr.length-1;
		Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
		while(j >= start || i <= end) {
			if(arr[j] == 1) {
				while(arr[start] == 1) {
					start++;
				}
				if(start < j) {
					arr[j] = arr[start];
					arr[start] = 1;
				}
			}
			if(arr[i] == 2) {
				while(arr[end] == 2) {
					end--;
				}
				if(end > i) {
					arr[i] = arr[end];
					arr[end] = 2;
				}
			}
			i++;
			j--;
		}
		System.out.println();
		Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
		
	}

}
