package com.leetcode.UniqueBinarySearchTrees;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numTrees(2));
	}
	
	public static int numTrees(int n){
		int num=0;
		if (n==0)
			return 0;
		if(n==1)
			return 1;
		for(int i=0;i<=n-1;i++){
			if(numTrees(i)!=0 && numTrees(n-i-1)!=0)
				num += numTrees(i)*numTrees(n-i-1);
			else
				num += numTrees(i)+numTrees(n-i-1);
		}
		
		return num;
	}

}
