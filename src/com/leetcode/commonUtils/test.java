package com.leetcode.commonUtils;

import java.text.DecimalFormat;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat(".00");
		double f = 12.9944;
		System.out.println(df.format(f));
		System.out.printf("%.2f", f);
	}

}
