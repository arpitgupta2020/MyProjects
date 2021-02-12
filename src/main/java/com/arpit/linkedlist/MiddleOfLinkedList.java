package com.arpit.linkedlist;

public class MiddleOfLinkedList {
	
	Node head;
	
	class Node{
		int val;
		Node next;
		Node(int data){
			val= data;
			next= null;
		}
	}
	
	//Method to find middle of Linked List
	private void returnMiddleNodeOfLinkedList() {
		Node current= head;
		int counter=0;
		
		while(current != null) {
			counter++;
			current= current.next;
		}
		
		current= head;
		
		for(int i=1; i<counter/2; i++) {
			current= current.next;
		}
		
		System.out.println("Middle Element :"+current.next.val);
	}
	
	private void push(int data) {
		Node newNode= new Node(data);
		
		newNode.next= head;
		head = newNode;		
	}
	
	private void printList() {
		Node current= head;
		while(current != null) {
			System.out.print(current.val+" ");
			current= current.next;
		}		
	}

	public static void main(String[] args) {
		MiddleOfLinkedList llist= new MiddleOfLinkedList();
		
		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);
		llist.push(8);
		llist.push(2);
		
		System.out.println("Created Linked List: ");
		llist.printList();
		
		llist.returnMiddleNodeOfLinkedList();

	}

}
