package com.arpit.arrays;

public class StringReverseUsingSwappingTechnique {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str = "hello";
		char[] c = str.toCharArray();

		int start = 0;
		int end = c.length - 1;

		while (start < end) {

			char temp = c[start];
			c[start] = c[end];
			c[end] = temp;
			start++;
			end--;
		}

		System.out.println(String.valueOf(c));

	}

}
