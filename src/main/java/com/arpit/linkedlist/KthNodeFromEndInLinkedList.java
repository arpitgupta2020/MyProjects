package com.arpit.linkedlist;

public class KthNodeFromEndInLinkedList {
	
	Node head;
	
	class Node{
		int val;
		Node next;
		Node(int data){
			val= data;
			next= null;
		}
	}
	
	public void KthNodeFromEndOfList(int k) {
		
		int len=0;
		Node temp= head;
		
		//1) count the number of nodes in Linked List
		while(temp != null) {
			temp= temp.next;
			len++;
		}
		
		// check if value of n is not more than length of the linked list
		if(len< k){
			return;
		}
		
		temp= head;
		
		for(int i=1; i< len-k; i++) {
			temp= temp.next;
		}		
		
		System.out.println(temp.next.val);
		temp.next= temp.next.next;
		
		
	}

	public static void main(String[] args) {
		KthNodeFromEndInLinkedList llist= new KthNodeFromEndInLinkedList();
		
		llist.push(50);
		llist.push(40);
		llist.push(30);
		llist.push(20);
		llist.push(10);
		
		int k= 2;
		llist.KthNodeFromEndOfList(k);	
		llist.printList();

	}

	private void printList() {
		Node node= head;
		while(node != null) {
			System.out.print(node.val+" ");
			node= node.next;
		}
	}

	private void push(int i) {
		Node newNode= new Node(i);
		
		newNode.next= head;
		
		head= newNode;
		
		
	}

}
