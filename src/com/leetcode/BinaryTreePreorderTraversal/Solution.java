package com.leetcode.BinaryTreePreorderTraversal;

import java.util.*;

import com.leetcode.BinaryTreePreorderTraversal.TreeNode;



public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode first = new TreeNode(2);
		TreeNode second = new TreeNode(3);
		TreeNode k = new TreeNode(4);
		root.left = k;
		root.right = first;
		first.left = second;
		List<Integer> result = preorderTraversal2(root);
		System.out.println(result);

	}

	/**
	 * 递归先序遍历
	 * @param root
	 * @return
	 */
	public static List<Integer> preorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		if(root == null)
			return result;
		result.add(root.val);
		left = preorderTraversal(root.left);
		right = preorderTraversal(root.right);
		result.addAll(left);
		result.addAll(right);
		return result;
	}
	/**
	 * 非递归先序遍历
	 * @param root
	 * @return
	 */
	public static List<Integer> preorderTraversal2(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		Stack<TreeNode> s = new Stack<TreeNode>();
		TreeNode p = root;
		TreeNode q;
		if(p==null)
			return result;
		while(p != null || !s.isEmpty()){	
			
			while(p != null){
				result.add(p.val);
				s.push(p);
				p = p.left;
			}
			q = s.pop();
			p = q.right;
		}
		return result;
	}
	
}
