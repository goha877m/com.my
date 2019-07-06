package com.my;

public class DynamicProgrammingAlgorithm {
	public static int[] weights = new int[] {3,4,7,8,9};
	public static int[] values = new int[] {4,5,10,11,13};
	
	public static int[][] KnapasckDP(int n,int W,float totleValue) {
		int i,w;
		int[][] c = new int[n][W];
		for(w=0;w<=W;w++) {
			c[0][w]=0;
			for(i=1;i<=n;n++) {
				c[i][0]=0;
				for(w=0;w<W;w++) {
					if(w>=weights[i-1]) {
						if(values[i-1]+c[i-1][w-weights[i-1]]>c[i-1][w]) {
							c[i][w]=values[i-1]+c[i-1][w-weights[i-1]];
							
						} else {
							c[i][w]=c[i-1][w];
						}
					} else {
						c[i][w]=c[i-1][w];
					}
				} 
			}
		}
		return c;
 	}
	
	public static void OutputBestDP(int n,int W,int[][] c) {
		int[] x= new int[n];
		int i;
		for(i=n;i>1;i--) {
			if(c[i][W]==c[i-1][W]) {
				x[i-1]=0;
			} else {
				x[i-1]=1;
				W=W-weights[i-1];
			}
			if(c[1][W]==0) {
				x[0]=0;
				
			} else {
				x[0]=1;
			}
		}
		for(i=0;i<n;i++) {
			if(x[i]==1) {
				System.out.println(weights[i]);
				System.out.println(values[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] c =KnapasckDP(5, 17, 1f);
		OutputBestDP(5, 17, c);
	}
}