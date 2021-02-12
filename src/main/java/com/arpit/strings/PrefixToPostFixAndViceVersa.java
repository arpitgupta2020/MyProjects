package com.arpit.strings;

import java.util.Stack;

//https://www.youtube.com/watch?v=MeRb_1bddWg

// Postfix to prefix we have to scan the elements from right to left and op1 and op2 in the order


class PrefixToPostfix {
	
	public int testPrefixToPostfix(String expression) {
		
		int op2 , op1;
		int result;
		
		String[] exp = expression.split(" ");
		int length = exp.length;
		
		
		Stack<String> st = new Stack<String>();
		
		for(int i=0; i<=length-1; i++) {
			if(checkOperand(exp[i]) == false) {
				
				st.push(exp[i]);
				
			}else {
				op2 = Integer.valueOf(st.pop());
				op1 = Integer.valueOf(st.pop());
				result = performOperation(exp[i], op2, op1);
				st.push(String.valueOf(result));
			}
		}
		return Integer.valueOf(st.peek());
		
	}
	
	public int performOperation(String c, int op2, int op1) {
		
		if(c.equals("+")) {
			return op1 + op2;
		}else if(c.equals("-")) {
			return op1 - op2; 
		}else if (c.equals("*")) {
			return op1 * op2;	
		}else if(c.equals("/")) {
			return op1 / op2;
		}
		return 0;
		
	}
	
	public boolean checkOperand(String ch) {
		
		boolean flag = false;
		if(ch.equals("+") || ch.equals("-") || ch.equals("*")|| ch.equals("/")) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
		
	}
}
public class PrefixToPostFixAndViceVersa {

	public static void main(String[] args) {
		String expression = "2 3 * 5 4 * + 9 -";
		PrefixToPostfix prefixToPostfix = new PrefixToPostfix();
		System.out.println(prefixToPostfix.testPrefixToPostfix(expression));

	}

}
