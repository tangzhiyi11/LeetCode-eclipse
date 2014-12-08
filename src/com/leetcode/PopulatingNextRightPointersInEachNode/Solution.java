package com.leetcode.PopulatingNextRightPointersInEachNode;

import com.leetcode.commonUtils.*;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static void connect(TreeLinkNode root){
		if(root == null)
			return ;
		int eachNum = 1,j=0;
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		TreeLinkNode p = root;
		TreeLinkNode q;
		queue.add(p);
		while(!queue.isEmpty()){
			for(int i = 1;i<eachNum;i++){
				q = queue.poll();
				q.next = queue.peek();
				if(q.left!=null && q.right!= null){
					queue.add(q.left);
					queue.add(q.right);
					j++;
					j++;
				}
			}
			q = queue.poll();
			q.next = null;
			if(q.left!=null && q.right!= null){
				queue.add(q.left);
				queue.add(q.right);
				j++;
				j++;
			}
			eachNum = j;
			j = 0;
		}
	}

}
