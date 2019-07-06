package com.my.pattern.abstractFactory;

public class Client {
	public static void main(String[] args) {
		//------------- ´´½¨A1-B1
		AbstractFactory f1 = new ConcreteFactory1();
		AbstractProductA createProductA = f1.createProductA();
		AbstractProductB createProductB = f1.createProductB();
		System.out.println(createProductA.getProduct());
		System.out.println(createProductA.use());
		System.out.println(createProductB.getProduct());
		System.out.println(createProductB.use());
	}
}
