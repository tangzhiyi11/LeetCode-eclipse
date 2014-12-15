package com.leetcode.RomanToInteger;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(romanToInt("DCXXI"));
	}
	
	public static int romanToInt(String s){
		int result = 0;
		char[] ss = s.toCharArray();
		for(int i=0;i<ss.length;i++){
			switch(ss[i]){
			case 'I':
				result += 1;
				break;
			case 'V':
				if(i>0 && ss[i-1]=='I')
					result = result+5-2;
				else
					result += 5;
				break;
			case 'X':
				if(i>0 && ss[i-1]=='I')
					result = result+10-2;
				else
					result += 10;
				break;
			case 'L':
				if(i>0 && ss[i-1]=='X')
					result = result+50-20;
				else
					result += 50;
				break;
			case 'C':
				if(i>0 && ss[i-1]=='X')
					result = result+100-20;
				else
					result += 100;
				break;
			case 'D':
				if(i>0 && ss[i-1]=='C')
					result = result+500-200;
				else
					result += 500;
				break;
			case 'M':
				if(i>0 && ss[i-1]=='C')
					result = result+1000-200;
				else
					result += 1000;
				break;
			}
		}
		return result;
	}
	

}
