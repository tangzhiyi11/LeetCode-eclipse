package com.leetcode.SamTree;

import java.util.LinkedList;
import java.util.Queue;




import com.leetcode.SamTree.TreeNode;
public class Solution {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		TreeNode rootL = new TreeNode(1);
		TreeNode rootR = new TreeNode(2);
		TreeNode rootRL = new TreeNode(3);
		root.left = rootL;
		root.right = rootR;
		rootR.left = rootRL;
		TreeNode root2 = new TreeNode(0);
		TreeNode rootL2 = new TreeNode(1);
		TreeNode rootR2 = new TreeNode(2);
		TreeNode rootRL2 = new TreeNode(3);
		root2.left = rootL2;
		root2.right = rootR2;
		rootR2.left = rootRL2;
		boolean  result = isSameTree2(root,root2);
		System.out.println(result);

	}
	
	public static boolean isSameTree(TreeNode p,TreeNode q){

		Queue<TreeNode> queueP = new LinkedList<TreeNode>();
		Queue<TreeNode> queueQ = new LinkedList<TreeNode>();
		if(p==null && q==null)
			return true;
		else if (p==null || q==null)
			return false;
		queueP.add(p);
		queueQ.add(q);
		int j=0,eachNum=1;
		while((!queueP.isEmpty()) && (!queueQ.isEmpty())){
			j=0;
			for(int i=1;i<=eachNum;i++){
				TreeNode topP = queueP.poll();
				TreeNode topQ = queueQ.poll();
				if(topP.val != topQ.val){
					return false;
				}
				else{
					if(topP.left != null && topQ.left != null)
					{
						queueP.add(topP.left);
						queueQ.add(topQ.left);
						j++;
					}
					if(topP.right != null && topQ.right != null)
					{
						queueP.add(topP.right);
						queueQ.add(topQ.right);
						j++;
					}
					if((topP.left == null && topQ.left !=null) || (topQ.left == null && topP.left !=null) ||(topQ.right == null && topP.right !=null) ||(topP.right== null && topQ.right !=null)){
						return false;
					}
				}
			}
			eachNum = j;
		}
		if(!queueP.isEmpty() || !queueQ.isEmpty())
			return false;
		else 
			return true;

	}
	public static boolean isSameTree2(TreeNode p,TreeNode q){
		if(p==null && q==null)
		return true;
		else if (p==null || q==null)
		return false;
		if(p.val != q.val)
		return false;
		else{
		if(isSameTree2(p.left,q.left) && isSameTree2(q.right,p.right))
		return true;
		else
		return false;
		}
		}

}
