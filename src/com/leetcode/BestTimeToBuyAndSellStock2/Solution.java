package com.leetcode.BestTimeToBuyAndSellStock2;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,2};
		int result = maxProfit(a);
		System.out.println(result);
	}
	
	public static int maxProfit(int[] prices){
		int profit=0,flag=0,present=0;
		for(int i=0;i<prices.length;i++){
			if((i!=(prices.length-1)) && flag==0 && prices[i+1]>prices[i] ){
				present = prices[i];

				flag=1;
			}
			if(flag==1 && i!=(prices.length-1) && prices[i+1]<prices[i]){
				profit += prices[i] - present;
				flag = 0;
			}
			if(flag==1 && i==(prices.length-1)){
				flag = 0;
				profit += prices[i]-present;
			}	
		}
		
		return profit;
	}

}
