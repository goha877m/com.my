package com.my.pattern.abstractFactory;

public interface AbstractFactory {

	/**
	 * ������ƷA
	 * 
	 * @return
	 */
	public AbstractProductA createProductA();

	/**
	 * ������ƷB
	 * 
	 * @return
	 */
	public AbstractProductB createProductB();

}