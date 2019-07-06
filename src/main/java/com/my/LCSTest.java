package com.my;

/**
 * 最长子序列求解
 * @author jzy
 *
 */
public class LCSTest {
	
	public static int[][] lcsLength(String str1,String str2){
		int i,j;
		int[][] l = new int[str1.length()+1][str2.length()+1];
		int[][] b = new int[str1.length()+1][str2.length()+1];
		for(i=1;i<=str1.length();i++) {
			l[i][0]=0;
		}
		for(i=1;i<=str2.length();i++) {
			l[0][i]=0;
		}
		System.out.println("初始化的两个数组：");
		System.out.println("l:");
		formatArray(l);
		System.out.println("b:");
		formatArray(b);
		for(i=1;i<=str1.length();i++) {
			for(j=1;j<=str2.length();j++) {
				if(str1.charAt(i-1)==str2.charAt(j-1)) {
					l[i][j]=l[i-1][j-1]+1;
					b[i][j]=0;
				} else if(l[i-1][j]>=l[i][j-1]) {
					l[i][j]=l[i-1][j];
					b[i][j]=1;
				} else {
					l[i][j]=l[i][j-1];
					b[i][j]=2;
				}
				System.out.println("循环中：");
				System.out.println("l:");
				formatArray(l);
				System.out.println("b:");
				formatArray(b);
				System.out.println();
			}
		}
		return b;
	}
	
	public static void OutputLcs(String str1,int str1Lenght,int str2Length,int[][] b) {
		if(str1Lenght==0||str2Length==0) {
			return;
		}
		if(b[str1Lenght][str2Length]==0) {
			OutputLcs(str1, str1Lenght-1, str2Length-1, b);
			System.out.print(str1.charAt(str1Lenght-1));
		} else if(b[str1Lenght][str2Length]==1) {
			OutputLcs(str1, str1Lenght-1, str2Length, b);
		} else {
			OutputLcs(str1, str1Lenght, str2Length-1, b);
			
		}
	}
	
	public static void formatArray(int[][] b) {
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[i].length;j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
	
	public static void main(String[] args) {
		String str1 = "ABCBDAB";
		String str2 = "BDCABA";
		int[][] b = lcsLength(str1, str2);
		System.out.print("最长子序列：");
		OutputLcs(str1, str1.length(), str2.length(), b);
		
	}
}