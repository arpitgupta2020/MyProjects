package com.arpit.latestPractisePrograms;

import java.util.function.IntPredicate;

import com.google.common.base.CharMatcher;

/**
* Arpit Gupta
*/

/*Vowels Count within a String using : 
	Java, 
	Java 8 Streams 
	and Google Guava library.*/

public class VowelsCountInString {
	
	public static boolean isVowel(char c) {
		return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
				c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
	}

	public static void main(String[] args) {
		
		// Method1 (Using Java)
		String st1= "Vouldermot";
		int count1 = 0;
		for(int i=0; i< st1.length(); i++){
			if(isVowel(st1.charAt(i))) {
				count1++;
			}
		}
		System.out.println("Total Vowels:"+ count1);
		
		// Method2 (Using Java 8)
		IntPredicate vowel= new IntPredicate() {
			
			@Override
			public boolean test(int c) {
				// TODO Auto-generated method stub
				return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
						c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
			}
		};
		String st2= "ArpitAutomation";
		long count2= st2.chars().filter(vowel).count();		
		System.out.println("Total Vowels:"+ count2);
		
		//Method3 (Google Guava library)
		String st3= "Java Examples";
		int count3= CharMatcher.anyOf("aeiouAEIOU").countIn(st3);
		System.out.println("Total Vowels:"+ count3);
	}

}
