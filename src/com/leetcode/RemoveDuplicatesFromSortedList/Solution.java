package com.leetcode.RemoveDuplicatesFromSortedList;

import com.leetcode.commonUtils.*;

public class Solution {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		head.next = first;
		first.next = second;
		second.next = third;
		
		ListNode head2 = head;
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
		ListNode p = deleteDuplicates(head2);
		ListNode q=p;
		System.out.println("############");
		while(q!=null){
			System.out.println(q.val);
			q = q.next;
		}
	}
	/**
	 * 很简单的一题。。。
	 * @param head
	 * @return
	 */
	public static ListNode deleteDuplicates(ListNode head){
		ListNode p = head;
		ListNode n = p;
		while(p!=null){
			n = p;
			while(p.next !=null && n.val == p.next.val){
				p = p.next;
			}
			p = p.next;
			n.next = p;
			
		}
		return	head;
	}

}
