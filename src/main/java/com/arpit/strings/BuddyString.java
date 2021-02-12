package com.arpit.strings;

//https://www.youtube.com/watch?v=Btg4mBgtedA

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class BuddyStringSolution {
	
	public static boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;
        if (A.equals(B)) {
            Set<Character> s = new HashSet<Character>();
            for (char c : A.toCharArray()) 
            	s.add(c);
            return s.size() < A.length();
        }
        List<Integer> dif = new ArrayList<Integer>();
        for (int i = 0; i < A.length(); ++i) 
        	if (A.charAt(i) != B.charAt(i)) 
        		dif.add(i);
        return dif.size() == 2 && A.charAt(dif.get(0)) == B.charAt(dif.get(1)) && A.charAt(dif.get(1)) == B.charAt(dif.get(0));
    }
}
public class BuddyString {

	public static void main(String[] args) {
		String a ="aadbc";
		String b ="aaecb";
		System.out.println(BuddyStringSolution.buddyStrings(a, b));

	}

}