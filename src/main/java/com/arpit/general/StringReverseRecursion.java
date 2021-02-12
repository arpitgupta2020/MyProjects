package com.arpit.general;

public class StringReverseRecursion {

	public static String recursiveMethod(String str) {
		if ((null == str) || (str.length() <= 1)) {
			return str;
		}

		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}

	//https://www.geeksforgeeks.org/reverse-a-string-using-recursion/
	/* Function to print reverse of the passed string */
	public static void reverseAllWords(String str) {
		if ((str == null) || (str.length() <= 1))
			System.out.println(str);
		else {
			System.out.print(str.charAt(str.length() - 1));
			reverseAllWords(str.substring(0, str.length() - 1));
		}
	}

	public static String reverseWords(String s) {

		int index = s.indexOf(" ");

		return index == -1 ? s : reverseWords(s.substring(index + 1)) + " " + s.substring(0, index);

	}

	public static void main(String[] args) {

		String s1 = "Java2novice";
		//System.out.println(StringReverseRecursion.recursiveMethod(s1));
		String str = "today is good day";
		//StringReverseRecursion.reverseAllWords(str);
		String newString = StringReverseRecursion.reverseWords(str);
		System.out.println(newString);

	}

}
