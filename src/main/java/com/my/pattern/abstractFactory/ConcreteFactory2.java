package com.my.pattern.abstractFactory;
public class ConcreteFactory2 implements AbstractFactory{
 
	public AbstractProductA createProductA() {
		// TODO Auto-generated method stub
		return new ProductA2();
	}
 
	public AbstractProductB createProductB() {
		// TODO Auto-generated method stub
		return new ProductB2();
	}
 
}
