package com.arpit.informaticaTasks;

import java.util.Arrays;

//O/p- 111110000022222(pattern)

public class Informatica_Round3_Program1_Solution2 {

	public static void main(String[] args) {
				
		int[] arr= {0,1,1,2,0,1,1,0,1,2,2,1,0,1,2,2,0,0,0,1,1,1,2};
		int left= 0;
		int right= arr.length-1;
		int start=0;
		int end= arr.length-1;
		Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
		while(start <= right || end >= left) {
			if(arr[end] == 1) {
				if(arr[left] == 1) {					
					left++;
					continue;
				}
				if(left < end) {
					arr[end] = arr[left];
					arr[left] = 1;
				}			
			}
			if(arr[start] == 2) {
				if(arr[right] == 2){
						right--;
						continue;
					}
					if(right > start) {
						arr[start] = arr[right];
						arr[right] = 2;
					}		
			}
			start++;
			end--;
			
		}
		System.out.println();
		Arrays.stream(arr).forEach(value -> System.out.print(value+" "));
		
	}

}
