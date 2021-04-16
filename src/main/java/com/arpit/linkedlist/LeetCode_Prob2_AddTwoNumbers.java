package com.arpit.linkedlist;

public class LeetCode_Prob2_AddTwoNumbers {
	
	ListNode head;
	
	public class ListNode {
		      int val;
		      ListNode next;
	
		      ListNode(int val) {
		    	  this.val = val; 
		      }
		      ListNode(int val, ListNode next) {
		    	  this.val = val;
		    	  this.next = next;
		      }
		  }
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head_Node= new ListNode(0);
		ListNode l3= head_Node;		
		
		int carry = 0;
		while(l1 != null || l2 != null) {
			int l1_val= (l1 != null) ? l1.val : 0;
			int l2_val= (l2 != null) ? l2.val : 0;
			
			
			int current_sum = l1_val + l2_val + carry;
			carry = current_sum / 10;
			int last_digit= current_sum % 10;
			
			ListNode new_Node = new ListNode(last_digit);
			l3.next = new_Node;
			
			if(l1 != null) l1 = l1.next;
			if(l2 != null) l2 = l2.next;
			
			l3= l3.next;
		}
		
		if(carry > 0) {
			ListNode newNode = new ListNode(carry);
			l3.next = newNode;
			l3 = l3.next;
		}
		
		return head_Node.next;
	}

	public static void main(String[] args) {
		LeetCode_Prob2_AddTwoNumbers lc= new LeetCode_Prob2_AddTwoNumbers();
		
		lc.push(2);
		lc.push(4);
		lc.push(3);
		
		
	}

	private void push(int i) {
		ListNode newNode= new ListNode(i);
		newNode.next= head;
		
		head= newNode;
	}

}
