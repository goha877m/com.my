package com.my.pattern.abstractFactory;
public class ProductB1 implements AbstractProductB{

	public String getProduct() {
		String product = "B�ͻ�����";
		return product;
	}

	public String use() {
		System.out.println("�����˿�����");
		for (int i = 0; i < 10; i++) {
			System.out.print(i*(i-1));
		}
		System.out.println("�����˹ر�");
		return null;
	}
 
}