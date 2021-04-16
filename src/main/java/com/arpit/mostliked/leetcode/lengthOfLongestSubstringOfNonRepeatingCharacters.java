package com.arpit.mostliked.leetcode;

import java.util.HashSet;

public class lengthOfLongestSubstringOfNonRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {
        int a_pointer= 0;
        int b_pointer= 0;
        int max=0;
        HashSet<Character> hast_Set= new HashSet();
        while(b_pointer < s.length()){
            if(!hast_Set.contains(s.charAt(b_pointer))){
                hast_Set.add(s.charAt(b_pointer));
                b_pointer++;
                max= Math.max(max, hast_Set.size());
            }else{
                hast_Set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		String str= "abcabcdbb";
		System.out.println(lengthOfLongestSubstring(str));
	}

}
