package com.arpit.informaticaTasks;

import java.util.HashMap;
import java.util.Map;

public class Informatica_Round3_Program4 {

	//O/p- 
	public static void main(String[] args) {
		
		String str= "isis is not israelis not is is isis";
		
		String key= "is";
		
		findMaximumOccurenceOfWordInString(str);
		findCountOfSubstring(str, key);
		
	}

	private static void findMaximumOccurenceOfWordInString(String str) {
		String[] str1= str.split(" ");
		
		HashMap<String, Integer> wordFreq= new HashMap<>();
		
		for(int i=0; i< str1.length; i++) {
			wordFreq.put(str1[i], wordFreq.getOrDefault(str1[i], 0)+1);
		}
		
		String result="";
		int largest= wordFreq.get(str1[0]);
		for(int i=1; i< str1.length; i++) {
			if(wordFreq.get(str1[i])>largest) {
				result= str1[i];
				largest= wordFreq.get(str1[i]);
			}
		}
		
		System.out.println("Largest word : "+result +" and occurence is: "+largest);
	}
	
	

	
	  private static void findCountOfSubstring(String str, String key) {	  
		  int count=0; 
		  String temp= str;	  
		  while(temp.contains(key)) { 
			  count++; 
			  temp= temp.replaceFirst(key, ""); 
		  }
		  System.out.println(count); 
	  }
}

