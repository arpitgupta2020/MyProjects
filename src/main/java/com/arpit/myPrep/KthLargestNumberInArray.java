package com.arpit.myPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KthLargestNumberInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Kthposition= sc.nextInt();
		
		Integer[] input= {2,8,5,3,7};
		
		System.out.println(Kthposition+"thlargest element is : "+kthLargestNumberInArray(input, Kthposition));
	}

	private static Integer kthLargestNumberInArray(Integer[] input, int kthposition) {
		List<Integer> inputArray = (ArrayList<Integer>) 
                Arrays.stream(input).collect(Collectors.toList());
		
		List<Integer> reverseList= inputArray.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		return reverseList.get(kthposition-1);
	}

}
