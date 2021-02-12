package com.arpit.mostliked.leetcode;

//https://www.youtube.com/watch?v=MK-NZ4hN7rs
 
/**
 * Find the max sum subarray of a fixed size K
 *
 * Example input:
 * [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
 *
 */
/*public class MaxSumSubarray {

    public static int findMaxSumSubarray(int[] arr, int k) {
        int maxValue = Integer.MIN_VALUE;
        int currentRunningSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentRunningSum += arr[i];

            if (i >= k - 1) {
                maxValue = Math.max(maxValue, currentRunningSum);
                currentRunningSum -= arr[i - (k - 1)];
            }
        }

        return maxValue;
    }


    public static void main(String[] args) {
        System.out.println(findMaxSumSubarray(new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0}, 3));
    }
}*/	

//SmallestSubarrayGivenSum.java
/*
public class SmallestSubarrayGivenSum {

    public static int smallestSubarray(int targetSum, int[] arr) {
        int minWindowSize = Integer.MAX_VALUE;
        int currentWindowSum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            currentWindowSum += arr[windowEnd];

            while(currentWindowSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize, windowEnd - windowStart + 1);
                currentWindowSum -= arr[windowStart];
                windowStart++;
            }
        }

        return minWindowSize;
    }

    public static void main(String[] args) {
        int[] input = new int[]{4,2,2,7,8,1,2,8,10};
        int targetSum = 8;
        System.out.println(smallestSubarray(targetSum, input));
    }
}*/

//LongestSubstringKDistinct
/*class LongestSubstringKDistinct {
	  public static int findLength(String str, int k) {
	    int windowStart = 0, maxLength = 0;
	    Map<Character, Integer> charFrequencyMap = new HashMap<>();
	    for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
	      char rightChar = str.charAt(windowEnd);
	      charFrequencyMap.put(rightChar, charFrequencyMap.getOrDefault(rightChar, 0) + 1);

	      while (charFrequencyMap.size() > k) {
	        char leftChar = str.charAt(windowStart);
	        charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) - 1);
	        if (charFrequencyMap.get(leftChar) == 0) {
	          charFrequencyMap.remove(leftChar);
	        }
	        windowStart++;
	      }
	      maxLength = Math.max(maxLength, windowEnd - windowStart + 1); 
	    }*/

public class SlidingWindowProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
