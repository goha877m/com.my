package com.my.pattern.factoryMethod;

//����A�� - ����A���Ʒ
class FactoryA extends Factory {
	@Override
	public Product Manufacture() {
		return new ProductA();
	}
}
