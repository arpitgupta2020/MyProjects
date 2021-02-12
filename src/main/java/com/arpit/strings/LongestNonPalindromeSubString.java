package com.arpit.strings;

//https://www.geeksforgeeks.org/longest-non-palindromic-substring/

class NonPalindromeSubStringCheck {

	public static boolean checkStringPalindromeOrNot(String str) {

		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			reverseString = reverseString + str.charAt(i);

		}

		if (reverseString.equals(str)) {
			return true;
		}

		return false;
	}

	public static int testNonPalindromeSubString(String s1) {

		char ch = s1.charAt(0);
		int k = 1;
		int n = s1.length();
		for (int i = 1; i < n; i++) {
			if (s1.charAt(i) != ch) {
				break;
			}
		}

		if (k == s1.length())
			return 0;

		if (checkStringPalindromeOrNot(s1))
			return n - 1;
		return n;
	}

}

public class LongestNonPalindromeSubString {

	public static void main(String[] args) {

		String s1 = "abcd";

		System.out.println(NonPalindromeSubStringCheck.testNonPalindromeSubString(s1));

	}

}
