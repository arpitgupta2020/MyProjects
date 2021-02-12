package com.arpit.strings;

class RomanToIntegerSolution {

	public static int value(char ch) {

		if (ch == 'I') {
			return 1;
		} else if (ch == 'V') {
			return 5;
		} else if (ch == 'C') {
			return 100;
		} else if (ch == 'D') {
			return 500;
		} else if (ch == 'M') {
			return 1000;
		}
		return -1;
	}

	public static int testRomanToInteger(String str) {

		int result = 0;

		for (int i = 0; i < str.length(); i++) {

			int s1 = RomanToIntegerSolution.value(str.charAt(i));

			if (i + 1 < str.length()) {
				int s2 = RomanToIntegerSolution.value(str.charAt(i + 1));

				if (s1 >= s2) {
					result = result + s1;

				} else {
					result = result + s2 - s1;
					i++;
				}
			} else {
				result = result + s1;
				i++;
			}

		}
		return result;
	}
}

public class RomanToInteger {

	public static void main(String[] args) {
		String str = "MCDI";
		System.out.println(RomanToIntegerSolution.testRomanToInteger(str));

	}

}
