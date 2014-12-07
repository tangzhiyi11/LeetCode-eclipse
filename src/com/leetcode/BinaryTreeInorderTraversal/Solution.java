package com.leetcode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.leetcode.BinaryTreeInorderTraversal.*;

public class Solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode first = new TreeNode(2);
		TreeNode second = new TreeNode(3);
		TreeNode k = new TreeNode(4);
		root.left = k;
		root.right = first;
		first.left = second;
		List<Integer> result = inorderTraversal2(root);
		System.out.println(result);

	}
	/*
	 * ÖÐÐò±éÀú µÝ¹é°æ
	 */
	public static List<Integer> inorderTraversal(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		if(root==null)
			return result;
		left = inorderTraversal(root.left);
		result.addAll(left);
		result.add(root.val);
		right = inorderTraversal(root.right);
		result.addAll(right);
		return result;
		
		
	}
	/**
	 * ÖÐÐò±éÀú·ÇµÝ¹é
	 * @param root
	 * @return List
	 */
	public static List<Integer> inorderTraversal2(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		if(root==null)
			return result;
		TreeNode p = root;
		TreeNode q;
		Stack<TreeNode> s = new Stack<TreeNode>();

		while(p!=null || !s.isEmpty())
		{
			while(p!=null ){
				s.push(p);
				p = p.left;

			}
			q = s.pop();
			result.add(q.val);
			p = q.right;

		}
		
		return result;
		
		
	}
	
	
}
