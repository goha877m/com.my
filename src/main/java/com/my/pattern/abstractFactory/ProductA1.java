package com.my.pattern.abstractFactory;

public class ProductA1 implements AbstractProductA {

	public String getProduct() {
		String product = "A�ͻ�����";
		return product;
	}

	public String use() {
		System.out.println("�����˿�����");
		for (int i = 0; i < 10; i++) {
			System.out.print(i++);
		}
		System.out.println("�����˹ر�");
		return null;
	}

}