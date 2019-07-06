package com.my.pattern.factoryMethod;

//������������
public class FactoryPattern {
	public static void main(String[] args) {
		// �ͻ�Ҫ��ƷA
		Factory mFactoryA = new FactoryA();
		mFactoryA.Manufacture().Show();

		// �ͻ�Ҫ��ƷB
		Factory mFactoryB = new FactoryB();
		mFactoryB.Manufacture().Show();
	}
}