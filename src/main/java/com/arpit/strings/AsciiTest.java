package com.arpit.strings;

// String to Integer

class StringToIntegerSolution {

	public static void StringToInteger(String s1) {

		int finalNumber = 0;
		int result = 0;

		for (int i = 0; i < s1.length(); i++) {
			result = result * 10;
			int number = (int) s1.charAt(i);
			finalNumber = number - 48;
			result = result + finalNumber;

		}
		System.out.println(result);

	}

}

public class AsciiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s1 = "210";
		StringToIntegerSolution.StringToInteger(s1);

	}

}
