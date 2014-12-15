package com.leetcode.MaximumSubarray;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A ={1,2};
		System.out.println(maxSubArray2(A));
	}
	
	public static int maxSubArray(int[] A){
		int result=0,num=0;
		for(int i=0;i<A.length;i++){
			if(i==0){
				result = A[i];
				num = result;
			}
			else if((A[i]+result)<A[i] && A[i]>result)
				result = A[i];
			else if((A[i]+result)>result)
				result += A[i];
			else{
				if(result >= num)
					num = result;
				result += A[i];
			}
			System.out.println("a"+i+":"+A[i]+"   result:"+result+"    num:"+num);

		}
		return result>num ? result : num;
	}

	public static int maxSubArray2(int[] A){
		return oneSelection(0,A.length-1,A);
	}
	
	public static int oneSelection(int l,int r,int[] A){
		int maxL=0,maxR=0,maxCross=0,max=Integer.MAX_VALUE;
		if(l==r)
			return A[l];
		int mid = (l+r)/2;
		maxL = oneSelection(l,mid,A);
		maxR = oneSelection(mid+1,r,A);
		maxCross = crossSelection(l,r,mid,A);
//		System.out.println(maxL);
//		System.out.println(maxR);
//		System.out.println(maxCross);
		if(maxL>maxR)
			max = maxL;
		else
			max = maxR;
		if(maxCross>max)
			max = maxCross;
		return max;
	}
	
	public static int crossSelection(int l,int r,int mid,int[] A){
		int suml = 0,maxl = Integer.MIN_VALUE;
		for(int i=mid;i>=l;i--){
			suml += A[i];
			if(suml > maxl)
				maxl = suml;
		}
		System.out.println("maxl:"+maxl);
		int sumr = 0,maxr = Integer.MIN_VALUE;
		for(int i=mid+1;i<=r;i++){
			sumr += A[i];
			if(suml > maxr)
				maxr = sumr;
		}

		return maxr+maxl;
	}
	
	
}
