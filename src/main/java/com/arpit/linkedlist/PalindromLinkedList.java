package com.arpit.linkedlist;

//https://leetcode.com/problems/palindrome-linked-list/submissions/

//https://www.youtube.com/watch?v=vHam6riSavo

// 1->2->2->1->null

// F - 1->2->2->null

// S - 1->2->null


/*
   class PalindromeListLinkedListSolution {

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

	public boolean isPalindrome(ListNode head) {

		ListNode fast = head;
		ListNode slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}

		fast = head;
		slow = testReverseLinkedList(slow);

		while (slow != null) {
			if (slow.val != fast.val) {
				return false;
			}

			slow = slow.next;
			fast = fast.next;
		}

		return true;
	}
}*/

public class PalindromLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
