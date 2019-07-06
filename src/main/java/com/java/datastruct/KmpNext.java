package com.java.datastruct;

public class KmpNext {
	
	public static int[] getNext(String str) {
		int[] next = new int[str.length()];
		int i,j,slen;
		slen = str.length()-1;
		i = 0;
		next[0]=-1;j=-1;
		System.out.println("初始化数据i="+i+",j="+j+",next[0]="+next[0]);
		while (i<slen) {
			System.out.println("compare：j=-1?["+j+"],或者字符串"+i+"号元素=字符串"+j+"号元素吗" + ",很明显，判断结果是："+Boolean.toString(j==-1 || str.charAt(i) == str.charAt(j)) );
			if(j==-1 || str.charAt(i) == str.charAt(j)) {
				++i;
				++j;
				System.out.println("i,j都加1:"+i+"|"+j);
				next[i]=j;
				System.out.println("执行写入操作：将当前j的值["+j+"]写入结果数组第"+i+"号中");
			} else {
				System.out.println("判断不通过执行操作：重置j为数据"+j+"号元素["+next[j]+"]");
				j=next[j];
			}
		}
		return next;
		
	}

	public static void main(String[] args) {
		String str = "abababb";
		int next[] = getNext(str);
		System.out.print("最终结果：");
		for (int i = 0; i < next.length; i++) {
			
			System.out.print(next[i] + ",");
		}

	}

}
