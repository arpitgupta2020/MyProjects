package com.arpit.linkedlist;

import java.util.Stack;

public class QueueUsingStack {

	static Stack<Integer> s1= new Stack<>();
	static Stack<Integer> s2= new Stack<>();
	
	public static void main(String[] args) {
		
		
		enqueue(1);
		enqueue(2);
		enqueue(3);
		enqueue(4);
		
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
	}

	private static void enqueue(int i) {
		
		while(!s1.isEmpty()) {
			
			s2.push(s1.pop());
		}
		s1.push(i);
		
		while(!s2.isEmpty()) {
			
			s1.push(s2.pop());
		}
	}
	
	private static int dequeue() {
		
		if(s1.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
		}
		int x= s1.peek();
		s1.pop();
		return x;
	}
}
