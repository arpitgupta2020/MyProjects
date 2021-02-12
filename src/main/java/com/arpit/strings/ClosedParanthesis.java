package com.arpit.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ClosedParanthesisSolution {
	
	//Using Stack

	public static boolean testClosedParanthesisSolution(String str) {

		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {

				st.push(str.charAt(i));

			} else if (str.charAt(i) == ')' && !st.isEmpty() && st.peek() == '(') {
				st.pop();
			} else if (str.charAt(i) == ']' && !st.isEmpty() && st.peek() == '[') {
				st.pop();
			} else if (str.charAt(i) == '}' && !st.isEmpty() && st.peek() == '{') {
				st.pop();
			} else {
				return false;
			}
		}

		return st.isEmpty();

	}
	
	//Using Stack and Map
	public static boolean testClosedParenthesisUsingMap(String str) {
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length();i++) {
			
			char current = str.charAt(i);
			
			if(map.keySet().contains(current)) {
				stack.push(current);
			}else if(map.values().contains(current)) {
				if(!stack.isEmpty() && map.get(stack.peek())==current) {
					stack.pop();
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
		return stack.isEmpty();
	}
}

public class ClosedParanthesis {

	public static void main(String[] args) {
		String str = "(([]))";
		System.out.println(ClosedParanthesisSolution.testClosedParanthesisSolution(str));
		System.out.println(ClosedParanthesisSolution.testClosedParenthesisUsingMap(str));
	}

}
