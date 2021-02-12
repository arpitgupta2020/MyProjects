package com.arpit.linkedlist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/merge-k-sorted-lists/

//https://www.youtube.com/watch?v=zLcNwcR6yO4

/*Input:
[
 1->4->5,
 1->3->4,
 2->6
]
Output: 1->1->2->3->4->4->5->6*/


/*
 * class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(ListNode head : lists){
          while(head != null){
             minHeap.add(head.val);
             head = head.next;
           }
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        while(!minHeap.isEmpty()){
            
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        
        return dummy.next;
    }
}*/

public class MergeKSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello");
		List<String> list = new ArrayList<String>();
		
		if(list.size()==0) {
			System.out.println("hello");
		}
		

	}

}
