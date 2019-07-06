package com.my;

/**
 * µÝ¹é½×³Ë
 * @author jzy
 *
 */
public class Factorial {
	public static double factorial(int n) {
		if(n==0) {
			return 1.0;
		}
		if(n>0) {
			return n * factorial(--n);
		}
		return -1.0;
	}
	
	public static void main(String[] args) {
		double ret = factorial(100);
		System.out.println(ret);
	}

}
