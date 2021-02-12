package com.arpit.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class AnagramTest{
	
	public boolean isAnagramOrNot(String s, String t) {
	    if(s.length()!=t.length())
	        return false;
	 
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();    
	 
	    for(int i=0; i<s.length(); i++){
	        char c1 = s.charAt(i);
	        if(map.containsKey(c1)){
	            map.put(c1, map.get(c1)+1);
	        }else{
	            map.put(c1,1);
	        }
	    }
	 
	    for(int i=0; i<s.length(); i++){
	        char c2 = t.charAt(i);
	        if(map.containsKey(c2)){
	            if(map.get(c2)==1){
	                map.remove(c2);
	            }else{
	                map.put(c2, map.get(c2)-1);
	            }
	        }else{
	            return false;
	        }    
	    }
	 
	    if(map.size()>0)
	        return false;
	 
	    return true;
	}
	
	public boolean isAnagram(String s, String t) {
		
		//We increment the count of each character in the first array and decrement the count of each character in the second array. 
		//If the resulting counts array is full of zeros, the strings are anagrams. Can be expanded to include other characters by increasing the size of the counts array.
	    if(s==null || t==null)
	        return false;
	 
	    if(s.length()!=t.length())
	        return false;
	 
	    int[] arr = new int[26];// An array to hold the number of occurrences of each character
	    for(int i=0; i<s.length(); i++){
	        arr[s.charAt(i)-'a']++;
	        arr[t.charAt(i)-'a']--;
	    }
	 // If the strings are anagrams, the counts array will be full of zeros
	    for(int i: arr){
	        if(i!=0)
	            return false;
	    }
	 
	    return true;
	}
	
	public static boolean isAnagramCheck(String word, String anagram) {
        boolean isAnagram = false;
        if (word != null && anagram != null && word.length() == anagram.length()) {
            char[] arr = word.toCharArray();
            StringBuilder temp = new StringBuilder(anagram);
            int wordLength = word.length();
            for (char ch : arr) {
                int index = temp.indexOf("" + ch);
                if (index != -1) {
                    temp.deleteCharAt(index);
                }
            }
            isAnagram = temp.toString().isEmpty();
        }
        return isAnagram;
    }
		   
	public void checkAnagramOrNot(String s1, String s2) {
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String str1 = String.valueOf(c1);
		String str2 = String.valueOf(c2);
		
		if(str1.equals(str2)) {
			System.out.println("Both are anagrams");
		}else {
			System.out.println("Both are not anagrams");
		}
		
	}	   
	
}



public class Anagram {
	
	
   public static void main(String[] args) {
	   
	   AnagramTest anagramtest = new AnagramTest();
	   /*System.out.println(anagramtest.isAnagramOrNot("doood", "o!dod"));// testcase 1 
	   System.out.println(anagramtest.isAnagramOrNot("doood", "o!dod"));
	   System.out.println(anagramtest.isAnagramOrNot("doood", "o!dod"));
	   System.out.println(anagramtest.isAnagramOrNot("doood", "o!dod"));*/
	   System.out.println(anagramtest.isAnagramOrNot("book", "bokk"));
    	
	   
	   
	  
	}
   
  }
   
   
