package com.my;

import java.util.ArrayList;
import java.util.List;

//��ŵ��
public class NewHanoi {
    public static int tiers = 64; // tiers ����
    private static List<String> pagoda1 = new ArrayList<String>(); // ��ָ̬��
    private static List<String> pagoda2 = new ArrayList<String>();

    private static List<String> pagoda3 = new ArrayList<String>(); 

    // ӳ��,����ȷ������ӡ�������(ʹ�ýǱ�),Ҳ����ʹ�� Map

    private static List[] mapping = {pagoda1, pagoda2, pagoda3};


    public static void main(String[] args) { 
        preparePagoda(pagoda1, tiers); 
        System.out.println("��ʼ״̬��");
        printPagodas(); 
        hanoi(tiers, pagoda1, pagoda2, pagoda3); 
        System.out.println("�������");
        printPagodas();
    }
    // --׼������(���-�ַ���) (Դ��)��
    private static void preparePagoda(List<String> srcPagoda, int tiers) {

        // ����ƴװ���������
        StringBuilder builder = new StringBuilder();

        // Դ����ÿһ������ӣ��ӵײ㿪ʼ, i ���������ӵ�ֱ����С������������ӵ�"^"����
        for(int i = tiers; i > 0; i--){            

            // ÿһ���� 2*tiers-1 ��������ɣ��������Ӵ�С��"^"�����ɿո����
            for(int k = 0; k < tiers - i; k++) builder.append(" "); // ������ߵĿո�����Ϊ [2*tiers-1-(2*i-1)]/2 = tiers-i, �ұ���ͬ
            for(int j = 1; j <= 2*i-1; j++){        // ������ռ����
                if(j % 2 == 1) builder.append("^"); // ����ڷ�

                else builder.append(" ");
            }
            for(int k = 0; k < tiers - i; k++) builder.append(" "); // �����ұߵĿո�

            srcPagoda.add(builder.toString());    // ��ӵ�����
            builder.delete(0, builder.length());  // ��һѭ��ǰ�������
        }
    }
    // --��ӡ������״

    private static void printPagodas(){

         // ��ӡ����Ϊ������-��״�����߶�
        int len = Math.max(pagoda1.size(), Math.max(pagoda2.size(), pagoda3.size()));
        // ����-���Ŀղ���ʾ

        StringBuilder spaces = new StringBuilder(); 
        spaces.append("-");   // --������������
        for(int i = 0; i < 2*tiers-1; i++) spaces.append(" "); // �ղ���ʾ�ÿո�
        spaces.append("-\t"); // --�������������������       

       

        for(int i = len - 1; i >= 0; i--){ // �Ӷ��㿪ʼ            

            // ������ͬһˮƽ����������ͬһ����ʾ
            // ��ĳ���������ڴ˲�ʱ��List.get(index)���׽Ǳ�Խ���쳣��ʹ��try-catch�����˲���ʾһ��ո� 
            try {  System.out.print("-" + pagoda1.get(i) + "-\t");
            } catch (Exception e1) { System.out.print(spaces);
            }
            try {  System.out.print("-" + pagoda2.get(i) + "-\t");
            } catch (Exception e) { System.out.print(spaces);
            }
            try {  System.out.print("-" + pagoda3.get(i) + "-\t");
            } catch (Exception e) { System.out.print(spaces);
            }
            System.out.print("\r\n");
        }
    }
    // �������(�ݹ�ĺ��ķ���)��ָ����Դ�����ƶ�-ָ������������-��ָ����Ŀ������

    public static void hanoi(int moveNum, List<String> from, List<String> middle, List<String> to) {
        if(moveNum == 1){ // �ݹ鵽�ƶ�һ������ʱ��ʹ�� move ���� 
            moveTheTopOne(from, to);
            return;
        }

        // ��ʵ�ַ�Ϊ������һ����Դ�������Ϸ����������������м���(�ݹ�)�������������Ƶ�Ŀ�������������м����ϵ����������Ƶ�Ŀ������(�ݹ�)��
        hanoi(moveNum - 1, from, to, middle);
        moveTheTopOne(from, to);
        hanoi(moveNum - 1, middle, from, to);
    }
    // ���������־�����������
    private static void moveTheTopOne(List<String> from, List<String> to) {
        String theTopOne = from.remove(from.size() - 1);
        to.add(theTopOne);

        // ��ӡͼ�Σ�ÿ�ƶ�һ�£���ӡͼ����ʾ
        System.out.println("********** print ***********\r\n");
        // ȷ���������
        int fromNum = 0, toNum = 0;
        for (int i = 0; i < mapping.length; i++) { // ������������
   
            if (mapping[i] == from) {
                 fromNum = i+1;
            }
            if (mapping[i] == to) {
                 toNum = i+1;
            }
        }
        System.out.println("�� " + fromNum + " ������ " + toNum + " ����\r\n");

        printPagodas(); // ��ӡͼ��
    }
}