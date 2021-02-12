package com.arpit.mostliked.leetcode;


// Not need to look for now this program
import java.util.Stack;

//https://leetcode.com/problems/min-stack/submissions/

//https://www.youtube.com/watch?v=u33R04D2ohY

class MinStackSolution {

	Stack<Integer> s1, s2;

	/** initialize your data structure here. */
	public MinStackSolution() {

		s1 = new Stack<Integer>();
		s2 = new Stack<Integer>();

	}

	public void push(int x) {

		s1.push(x);

		if (s2.isEmpty() || x <= s2.peek())
			s2.push(x);

	}

	public void pop() {

		int x = s1.pop();

		if (x == s2.peek())
			s2.pop();

	}

	public int top() {

		return s1.peek();

	}

	public int getMin() {
		return s2.peek();

	}
}

public class MinStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
