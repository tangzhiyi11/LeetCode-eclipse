package com.leetcode.singlenumber;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,3,1};
		int a = singNumber(A);
		System.out.println(a);
		int b = singNumber2(A);
		System.out.println(b);
	}
	
	
	public static int singNumber(int[] A){
		int result = 0;
		Map<Integer,Integer> list = new HashMap<Integer,Integer>();
		for(int i=0;i<A.length;i++){
			if(list.get(A[i])==null)
				list.put(A[i],1);
			else
				list.put(A[i],2);			
		}
		System.out.println(list);
		for(Integer key : list.keySet()){
			if(list.get(key)==1){
				result=key;
				break;
			}
		}
		return result;
	}
	
	public static int singNumber2(int[] A){
		for(int i=1;i<A.length;i++){			
			A[0] ^=A[i];
		}
		return A[0];
	}
}
