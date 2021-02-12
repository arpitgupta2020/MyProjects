package com.arpit.strings;

public class ConvertString {

	public static void convertStringToInt(String num){
		int result=0;
		int zeroAscii=48;
		int nineAscii=57;
		for(char c: num.toCharArray()){
		  if(c>=zeroAscii && c<=nineAscii){
		  result=result*10+(c-zeroAscii);
		 }else
		  System.out.println(-1);
		 }
		System.out.println(result); 
		}
	public static void main(String[] args) {
		ConvertString.convertStringToInt(")8989");

	}

}
