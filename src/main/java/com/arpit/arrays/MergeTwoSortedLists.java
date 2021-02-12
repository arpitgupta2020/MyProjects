package com.arpit.arrays;

//https://www.youtube.com/watch?v=K63Mjf-H0B0

//https://leetcode.com/problems/merge-two-sorted-lists/

/*class MergeTwoSortedListsSolution {
	
	public ListNode testMergeTwoSortedLists(ListNode l1, ListNode l2) {
		
		ListNode dummy = new ListNode(-1);
		ListNode head = dummy;
		
		while(l1!=null && l2!=null) {
			
			if(l1.val < l2.val) {
				dummy.next = l1;
				l1 = l1.next;
			}else {
				dummy.next = l2;
				l2= l2.next;
			}
			
			dummy = dummy.next;
		}
		
		while(l1!=null) {
			dummy.next = l1;
		}
		
		while(l2!=null) {
			dummy.next = l2;
		}
		
		return head.next;
	}
}*/
public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
