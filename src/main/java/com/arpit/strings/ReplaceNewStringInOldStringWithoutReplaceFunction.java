package com.arpit.strings;

//Write a java program to replace a new string in place of old string from Input string. 

class ReplaceStringSolution {
	
	public static String replaceAll(String old, String newWord, String input) {

	    boolean loop = true;

	    do {
	        int i = input.indexOf(old);

	        if (i > 0) {

	            String partBefore = input.substring(0, i);
	            String partAfter = input.substring(i + old.length());
	            input = partBefore + newWord + partAfter;

	        } else
	            loop = false;

	    } while (loop);

	    return input;
	}
}

public class ReplaceNewStringInOldStringWithoutReplaceFunction {

	public static void main(String[] args) {
		String old = "is";
		String newWord = "IS";
		String input = "This is some string. replace lower case is with IS";
		System.out.println(ReplaceStringSolution.replaceAll(old, newWord, input));
		

	}

}
