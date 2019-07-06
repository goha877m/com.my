package com.my.pattern.abstractFactory;
public class ProductB1 implements AbstractProductB{

	public String getProduct() {
		String product = "B型机器人";
		return product;
	}

	public String use() {
		System.out.println("机器人开启中");
		for (int i = 0; i < 10; i++) {
			System.out.print(i*(i-1));
		}
		System.out.println("机器人关闭");
		return null;
	}
 
}