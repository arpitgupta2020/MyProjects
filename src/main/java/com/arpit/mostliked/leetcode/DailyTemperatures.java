package com.arpit.mostliked.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/

//https://www.youtube.com/watch?v=BkLbVlvMOFs
class DailyTemperaturesSolution {
 // tc -> n, sc-> n
 public static int[] dailyTemperatures(int[] T) {
     Stack<Integer> stack = new Stack<Integer>();
     int[] res = new int[T.length];
     for(int i=0; i<T.length; i++){
         while(!stack.isEmpty() && T[i]>T[stack.peek()]){
             int index = stack.pop();
             res[index] = i-index;
         }
         stack.push(i);
     }
     return res;
 }
}

public class DailyTemperatures {

	public static void main(String[] args) {
		int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res = DailyTemperaturesSolution.dailyTemperatures(T);
		for(int i :res) {
			System.out.println(i);
		}

	}

}
