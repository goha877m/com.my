package com.my.pattern.builder;

//һ��ƽ�۳�������
class EconomicBuilder implements Builder {
	public Car economicCar = new Car();

	public Car getCar() {
		return economicCar;
	}

	public void buildWheel() {
		economicCar.setWheel("economic wheel");
	}

	public void buildFrame() {
		economicCar.setFrame("economic frame");
	}

	public void buildEngine() {
		economicCar.setEngine("economic engine");
	}

	public void buildWidget() {
		economicCar.setWidget("economic widget");
	}
}
