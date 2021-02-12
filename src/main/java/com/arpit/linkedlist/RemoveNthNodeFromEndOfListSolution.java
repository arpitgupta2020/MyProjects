package com.arpit.linkedlist;

import java.util.LinkedList;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/solution/

//https://www.youtube.com/watch?v=XtYEEvrhemI


class RemoveNthNodeFromEndOfListSolution {
	
	ListNode head;
	
	public class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val= x;
		}
	}
	
	public void removeNthFromEnd(int n) {
		ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode fast = dummy;
	    ListNode slow = dummy;
	    ListNode temp= dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {
	        fast = fast.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (fast != null) {
	    	fast = fast.next;
	        slow = slow.next;
	        temp = temp.next;
	    }
	    
	    System.out.println("\nDeleted Node is- "+temp.next.val);
	    slow.next = slow.next.next;
	}
	
	public void push(int new_data) {
		ListNode newNode= new ListNode(new_data);
		
		newNode.next= head;
		head= newNode;
		
	}

	public static void main(String[] args) {
		RemoveNthNodeFromEndOfListSolution list= new RemoveNthNodeFromEndOfListSolution();
		
		list.push(50);
		list.push(40);
		list.push(30);
		list.push(20);
		list.push(10);
		
		int n=3;
		System.out.println("\nCreated Linked list is:"); 
		list.printList(); 
        
		list.removeNthFromEnd(n);
		
		System.out.println("\nLinked List after Deletion is:"); 
		list.printList();

	}

	private void printList() {
		ListNode node= head;
		
		while(node != null) {
			System.out.print(node.val+" ");
			node= node.next;
		}
	}

}
