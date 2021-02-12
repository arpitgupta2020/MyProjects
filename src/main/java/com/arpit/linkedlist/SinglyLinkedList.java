package com.arpit.linkedlist;

//https://www.youtube.com/watch?v=jY-EUKXYT20



public class SinglyLinkedList {

	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.data +"------>");
			current = current.next;
		}
		System.out.println(current);
	}

	//Reverse Linked List
	public ListNode testReverseLinkedList(ListNode head) {
		ListNode currentNode = head;
		ListNode previous = null;
		ListNode next = null;

		while (currentNode != null) {
			next = currentNode.next;
			currentNode.next = previous;
			previous = currentNode;
			currentNode = next;

		}

		return previous;
	}

	// Detect loops In LinkedList
	public boolean testLoopExists(ListNode head) {
		
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		
		while(fastPointer!=null && fastPointer.next!=null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
			if(fastPointer == slowPointer)
				return true;
		}
		return false;
	}
	
	// To find Middle Element in Linked List
	
	public ListNode testMiddleElement(ListNode head) {
		ListNode fastPointer = head;
		ListNode slowPointer = head;
		
		while(fastPointer !=null) {
			fastPointer = fastPointer.next;
			if(fastPointer!=null && fastPointer.next!=null) {
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
			}
		}
		return slowPointer;
	}
	
	public static void main(String[] args) {

		ListNode head = new ListNode(5);
		ListNode second = new ListNode(6);
		ListNode third = new ListNode(7);
		ListNode fourth = new ListNode(1);
		ListNode fifth = new ListNode(2);

		head.next = second;
		second.next = third;
		third.next = fourth;
		//fourth.next = second;
		fourth.next = fifth;
		
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		//ListNode reverse = singlyLinkedList.testReverseLinkedList(head);
		
		//singlyLinkedList.display(reverse);
		
		//boolean checkLoop = singlyLinkedList.testLoopExists(head);
		//System.out.println("Loop Exists or Not......"+checkLoop);
		
		ListNode middleElement = singlyLinkedList.testMiddleElement(head);
		System.out.println(middleElement.data);
	}

}
