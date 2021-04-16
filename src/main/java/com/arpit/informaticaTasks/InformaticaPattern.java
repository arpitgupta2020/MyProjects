package com.arpit.informaticaTasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

//input patten: xxxxyyzzzz, output should be: x4y2z4.

public class InformaticaPattern {

	public static void main(String[] args) {
		String str= "xxxxyyzzzzaaacwwwwwwxxtttttt";
		System.out.println(printChararcterWithFrequency(str));
	}

	private static String printChararcterWithFrequency(String str) {
		String result="";
		LinkedHashMap<Character, Integer> charFreq= new LinkedHashMap<>();
		for(int i=0; i< str.length(); i++) {
			charFreq.put(str.charAt(i), charFreq.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for(Entry<Character, Integer> entry: charFreq.entrySet()) {
			result= result+ entry.getKey()+ entry.getValue();
		}
		return result;
	}

}
