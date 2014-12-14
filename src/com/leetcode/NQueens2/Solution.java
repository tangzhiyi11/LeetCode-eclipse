package com.leetcode.NQueens2;

import java.util.*;

public class Solution{
	public static void main(String[] args){

		NQueens q = new Solution().new NQueens(8);
		q.Loop(1);
		System.out.println(q.getCount());


	}

	
	
	public static int solveNQueens(int n){
		
		NQueens q = new Solution().new NQueens(n);
		q.Loop(1);
		return q.getCount();
	}
	
	public class NQueens{
		int[] nu;
		int num;
		int count;
		public NQueens(int n){
			num = n;
			nu = new int[n+1];
			for(int i=1;i<=n;i++)
				nu[i] = 0;
			count = 0;
		}
		
		public boolean isLegal(int i,int j){
			for(int k=1;k<i;k++){
				if(nu[k]==j || Math.abs((i-k))==Math.abs(nu[k]-j))
					return false;
			}
			return true;
		}
		
		public void print(){
			String[] pp = new String[num];
			for(int i=0;i<num;i++){
				pp[i] = "";
				for(int j=1;j<=num;j++){
					if(nu[i+1]==j)
						pp[i] += "Q";
					else
						pp[i] += ".";
				}
			}
			for(String s:pp)
				System.out.println(s);
			System.out.println("###########");
			count++;
		}
		
		/**
		 * 递归求解八皇后问题
		 * @param k
		 */
		public void Loop(int k){
			if(k>num)
				print();
			else{
				for(int i=1;i<=num;i++){
					nu[k] = i;
					if(isLegal(k,i))
						Loop(k+1);					
					nu[k]=0;
				}
			}
		}
		
		/**
		 * 非递归求解八皇后问题
		 */
		public void notRecursive(){
			int offset=1;
			while(offset>0 && offset<=num){
				nu[offset] = nu[offset]+1;
				while(nu[offset]<=num && isLegal(offset,nu[offset])==false){
					nu[offset] += 1;
				}
				if(nu[offset] <=num){
					if(offset==num)
						print();
					else{
						offset += 1;
						nu[offset] = 0;
					}
				}
				else
					offset = offset -1;
			}
		}
		
		
		public int getCount(){
			return count;
		}
		
	}
	
}