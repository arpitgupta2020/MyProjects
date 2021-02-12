package com.arpit.mostliked.leetcode;

import java.util.ArrayList;
import java.util.List;

//https://www.youtube.com/watch?v=IPWmrjE1_MU&t=1120s

//https://leetcode.com/problems/permutations/

//https://www.programcreek.com/2013/02/leetcode-permutations-java/

//https://www.geeksforgeeks.org/heaps-algorithm-for-generating-permutations/

class Solution {
	
	// Using BackTracking
	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> lists = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return lists;
		}

		dfs(nums, lists, new ArrayList<Integer>());
		return lists;
	}

	private static void dfs(int[] nums, List<List<Integer>> lists, List<Integer> cur) {
		if (cur.size() == nums.length) {
			lists.add(new ArrayList<>(cur));
		}

		for (int i = 0; i < nums.length; i++) {
			if (cur.contains(nums[i])) {
				continue;
			}
			cur.add(nums[i]);
			dfs(nums, lists, cur);
			cur.remove(cur.size() - 1);
		}
	}
	
	
}

public class Permutations {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(Solution.permute(nums));

	}

}


/*// Java program to print all permutations using 
// Heap's algorithm 
class HeapAlgo 
{ 
    //Prints the array 
    void printArr(int a[], int n) 
    { 
        for (int i=0; i<n; i++) 
            System.out.print(a[i] + " "); 
        System.out.println(); 
    } 
  
    //Generating permutation using Heap Algorithm 
    void heapPermutation(int a[], int size, int n) 
    { 
        // if size becomes 1 then prints the obtained 
        // permutation 
        if (size == 1) 
            printArr(a,n); 
  
        for (int i=0; i<size; i++) 
        { 
            heapPermutation(a, size-1, n); 
  
            // if size is odd, swap first and last 
            // element 
            if (size % 2 == 1) 
            { 
                int temp = a[0]; 
                a[0] = a[size-1]; 
                a[size-1] = temp; 
            } 
  
            // If size is even, swap ith and last 
            // element 
            else
            { 
                int temp = a[i]; 
                a[i] = a[size-1]; 
                a[size-1] = temp; 
            } 
        } 
    } */
