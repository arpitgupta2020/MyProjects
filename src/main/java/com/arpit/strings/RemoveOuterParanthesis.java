package com.arpit.strings;

//Input: (())() output: ()
//Input: () () output: ""

import java.util.Stack;

class OuterParanthesisRemove {

	public static Stack<Character> testOuterParanthesisRemove(String str) {

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == ')' && st.peek() == '(') {
				st.pop();
				i = i + 1;
			}
			if (i < str.length()) {
				st.push(str.charAt(i));
			}

		}

		return st;
	}

}

public class RemoveOuterParanthesis {

	public static void main(String[] args) {
		String str = "(())()";
		Stack<Character> stack = OuterParanthesisRemove.testOuterParanthesisRemove(str);
		String newString = "";

		if (stack.isEmpty()) {
			System.out.println("Hey stack is empty so returning null");
		} else {

			while (!stack.isEmpty()) {

				newString = newString + stack.pop();

			}

			StringBuffer sbf = new StringBuffer(newString);
			String reverseString = new String(sbf.reverse().toString());
			System.out.println(reverseString);

		}

	}

}
