package com.arpit.arrays;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

/**
* Arpit Gupta
*/


/*Calculate average of array using:
Simple Loop,
Java 8 and 
Google Guava Library*/
public class AverageOfIntegerArray {

	public static void main(String[] args) {
		int nums[] = {1,2,3,9,4,11,19,16,71,31,21};
		
		//Method1
		int sum=0;
		for(int e: nums) {
			sum+= e;
		}
		System.out.println("Avg num is:"+ (sum/nums.length));
		
		//Method2 (Java 8: Streams)
		OptionalDouble avg2= Arrays.stream(nums).average();
		System.out.println("Avg num is:"+ avg2.getAsDouble());
		
		//Method3 (Google Guava library)
		double avg3= DoubleMath.mean(nums);
		System.out.println("Avg num is:"+ avg3);
	}

}
