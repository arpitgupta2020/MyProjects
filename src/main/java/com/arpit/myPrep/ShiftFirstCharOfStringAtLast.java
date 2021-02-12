package com.arpit.myPrep;

public class ShiftFirstCharOfStringAtLast {
	
	public String shiftFirstCharOfStringAtLast(String s) {
		char[] charArr= s.toCharArray();
		s= s.replace(String.valueOf(s.charAt(0)), "");
		s= s+charArr[0];
		return s;
		
	}
	public static void main(String[] args) {
		String str= "HelloBrother";
		ShiftFirstCharOfStringAtLast sf= new ShiftFirstCharOfStringAtLast();
		System.out.println(sf.shiftFirstCharOfStringAtLast(str));
	}

}
