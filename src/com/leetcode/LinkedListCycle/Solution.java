package com.leetcode.LinkedListCycle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.leetcode.LinkedListCycle.ListNode;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(7);
		ListNode first = new ListNode(8);
		ListNode second = new ListNode(7);
		head.next = first;
		first.next = second;
		second.next = head;
		System.out.println(hasCycle(head));
	}
	
	public static boolean hasCycle(ListNode head){
		ListNode p = head;
		if(head == null)
			return false;
		Set<ListNode> set = new HashSet<ListNode>();
		
		while(p.next != null){
			set.add(p);
			if(set.contains(p.next))
				return true;
			p = p.next;
			
		}
		return false;
	}
	public static boolean hasCycle2(ListNode head) {
	    if(head==null||head.next==null)
	        return false;
	    ListNode i = head; //slower pointer
	    ListNode j = i.next; //faster pointer
	    while(i!=null&&j!=null&&j.next!=null)
	    {
	        i = i.next;
	        j = j.next.next;
	        if(i==j)
	            return true;
	    }
	    return false;
	}

}
