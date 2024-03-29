package com.my.pattern.factoryMethod;

//生产工作流程
public class FactoryPattern {
	public static void main(String[] args) {
		// 客户要产品A
		Factory mFactoryA = new FactoryA();
		mFactoryA.Manufacture().Show();

		// 客户要产品B
		Factory mFactoryB = new FactoryB();
		mFactoryB.Manufacture().Show();
	}
}