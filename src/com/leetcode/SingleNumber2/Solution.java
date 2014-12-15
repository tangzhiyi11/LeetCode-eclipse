package com.leetcode.SingleNumber2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,2,2,3,3};
		System.out.println(singleNumber(A));
	}
	/**
	 * 这题是纯粹看答案写的，那个按位逻辑操作实在是想不出来，看着答案还是看了半天才勉强看懂，
	 * discuss上有个人写的真值表挺拥有的，但是可惜的是没有看懂
	 * 主要的思路是用ones和twos两位来表示三种状态，到11时自动清为00，最后剩下的ones就为要求的那个数了
	 * @param A
	 * @return
	 */
	public static int singleNumber(int[] A){
		int ones=0,twos=0,threes=0;
		for(int i=0;i<A.length;i++){
			twos |= ones & A[i];
			ones ^= A[i];
			threes = ones & twos;
			ones &= ~threes;
			twos &= ~threes;
		}
		return ones;
	}
	
}
