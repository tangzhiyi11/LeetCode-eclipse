package com.leetcode.BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;

import com.leetcode.BinaryTreeInorderTraversal.*;

public class Solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode first = new TreeNode(2);
		TreeNode second = new TreeNode(3);
		root.right = first;
		first.left = second;
		List<Integer> result = inorderTraversal(root);
		System.out.println(result);

	}

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
	
	public static List<Integer> inorderTraversal2(TreeNode root){
		List<Integer> result = new ArrayList<Integer>();
		
		return result;
		
		
	}
	
	
}
