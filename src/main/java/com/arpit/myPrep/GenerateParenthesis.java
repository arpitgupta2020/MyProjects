package com.arpit.myPrep;

import java.util.ArrayList;
import java.util.List;

import org.testng.internal.junit.ArrayAsserts;

public class GenerateParenthesis {
	
	public static List<String> backTrack(List<String> output_arr, String current_str, int n, int open, int close){
		
		if(current_str.length()==n*2) {
			output_arr.add(current_str);
			return output_arr;
		}
		
		if(open< n) {
			backTrack(output_arr, current_str+"(",  n, open+1, close);
		}
		if(close<open) {
			backTrack(output_arr, current_str+")", n, open, close+1);
		}
		return output_arr;
	}
	
	
	public static List<String> printParenthesis(int n) {
		List<String> output_arr= new ArrayList<>();
		backTrack(output_arr, "", n, 0, 0);
		return output_arr;
	}

	public static void main(String[] args) {
		int n=3;
	//	printParenthesis(n);
		for(String s: printParenthesis(n)) {
			System.out.println(s);
		}
	}

}
