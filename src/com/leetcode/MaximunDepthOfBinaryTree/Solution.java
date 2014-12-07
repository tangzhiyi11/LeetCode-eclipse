package com.leetcode.MaximunDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import com.leetcode.MaximunDepthOfBinaryTree.TreeNode;

public class Solution {

	public int maxDepth(TreeNode root){
		if(root==null)
			return 0;
//		int result=FindDepth(root,1);
		int result=FindDepth2(root);
		return result;
	}
	
	public static int FindDepth(TreeNode root,int deep){
		int a=0,b=0;
		if(root.left==null && root.right==null)
			return deep;
		else {
			if (root.left!=null)
				a = FindDepth(root.left,deep+1);
			if(root.right!=null)
				b = FindDepth(root.right,deep+1);
			return a>b?a:b;
		}
			
	}
	
	public static int FindDepth2(TreeNode root){
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int eachNum = 1,result=0;
		int j=0;
		while(!queue.isEmpty()){
			result++;
			j = 0;
			for(int i=1;i<=eachNum;i++){
				TreeNode top=queue.poll();
				if(top.left!=null){
					queue.add(top.left);
					j++;
				}
				if(top.right!=null){
					queue.add(top.right);
					j++;
				}
			}
			eachNum=j;
				
		}
		return result;
			
	}
	public static void main(String[] args){
		TreeNode root = new TreeNode(0);
		TreeNode rootL = new TreeNode(1);
		TreeNode rootR = new TreeNode(2);
		TreeNode rootRL = new TreeNode(3);
		root.left = rootL;
		root.right = rootR;
		rootR.left = rootRL;
		int a =FindDepth(root,1);
		System.out.println(a);
	}

}
