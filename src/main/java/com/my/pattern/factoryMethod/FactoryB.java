package com.my.pattern.factoryMethod;

//����B�� - ����B���Ʒ
class FactoryB extends Factory {
	@Override
	public Product Manufacture() {
		return new ProductB();
	}
}