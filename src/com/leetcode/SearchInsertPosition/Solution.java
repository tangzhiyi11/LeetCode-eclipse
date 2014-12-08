package com.leetcode.SearchInsertPosition;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A ={1,2,4,5};
		System.out.print(searchInsert(A,6));
	}
	/**
	 * 简单的二分查找
	 * @param A
	 * @param target
	 * @return
	 */
	public static int searchInsert(int[] A,int target){
		int result = 0;
		if(A.length==0)
			return 0;
		int low=0,high=A.length -1;
		int mid = (low + high)/2;
		while(low<=high){
			if(A[mid]==target)
				return mid;
			if(A[mid]>target){
				high = mid -1;
				mid = (low+high)/2;
			}else{
				low = mid+1;
				mid = (low+high)/2;
			}
				
		}
		return low>high? low:high;
		
	}

}
