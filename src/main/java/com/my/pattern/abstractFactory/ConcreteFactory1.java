package com.my.pattern.abstractFactory;

public class ConcreteFactory1 implements AbstractFactory {

	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA1();
	}

	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB1();
	}

}
