package com.leetcode.ReverseInteger;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kk = 991;
		System.out.print(reverse(1534236469));
		boolean f = (1534236469*10 >Integer.MAX_VALUE);
		System.out.println("f : "+f);
	}
	/**
	 * 感觉是个很笨的方法，没有一点技巧可言！需要看看别人怎么写的都！
	 * @param x
	 * @return
	 */
	public static int reverse(int x){
		int result = 1;
		if(x==0)
			return 0;
		long a=0;
		long val = (long)x;
		while(Math.abs(val)>=10){
			
			if((a*10 + val%10)>Integer.MAX_VALUE || (a*10 + val%10)<Integer.MIN_VALUE)
				return 0;
			a = a*10 + val%10;
			val /= 10;
			
		}
		if((a*10 + val)>Integer.MAX_VALUE || (a*10 + val)<Integer.MIN_VALUE)
			return 0;
		a = a*10 + val;
		result = (int)a;
		return result;
	}
}
