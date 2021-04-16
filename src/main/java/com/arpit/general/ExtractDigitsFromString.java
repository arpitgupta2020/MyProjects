package com.arpit.general;

public class ExtractDigitsFromString {

	public static void main(String[] args) {
		String str="sdfvsdf68fsdfsf8999fsdf09";
		str= str.replaceAll("[\\D]+", "");
		System.out.println(str);
	}

}
