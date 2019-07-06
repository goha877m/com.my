package com.my.pattern.abstractFactory;

public class ProductA1 implements AbstractProductA {

	public String getProduct() {
		String product = "A型机器人";
		return product;
	}

	public String use() {
		System.out.println("机器人开启中");
		for (int i = 0; i < 10; i++) {
			System.out.print(i++);
		}
		System.out.println("机器人关闭");
		return null;
	}

}