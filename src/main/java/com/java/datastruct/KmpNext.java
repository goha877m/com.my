package com.java.datastruct;

public class KmpNext {
	
	public static int[] getNext(String str) {
		int[] next = new int[str.length()];
		int i,j,slen;
		slen = str.length()-1;
		i = 0;
		next[0]=-1;j=-1;
		System.out.println("��ʼ������i="+i+",j="+j+",next[0]="+next[0]);
		while (i<slen) {
			System.out.println("compare��j=-1?["+j+"],�����ַ���"+i+"��Ԫ��=�ַ���"+j+"��Ԫ����" + ",�����ԣ��жϽ���ǣ�"+Boolean.toString(j==-1 || str.charAt(i) == str.charAt(j)) );
			if(j==-1 || str.charAt(i) == str.charAt(j)) {
				++i;
				++j;
				System.out.println("i,j����1:"+i+"|"+j);
				next[i]=j;
				System.out.println("ִ��д�����������ǰj��ֵ["+j+"]д���������"+i+"����");
			} else {
				System.out.println("�жϲ�ͨ��ִ�в���������jΪ����"+j+"��Ԫ��["+next[j]+"]");
				j=next[j];
			}
		}
		return next;
		
	}

	public static void main(String[] args) {
		String str = "abababb";
		int next[] = getNext(str);
		System.out.print("���ս����");
		for (int i = 0; i < next.length; i++) {
			
			System.out.print(next[i] + ",");
		}

	}

}
