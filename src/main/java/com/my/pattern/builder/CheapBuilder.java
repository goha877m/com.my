package com.my.pattern.builder;

//һ�����۳�������
class CheapBuilder implements Builder {
	Car cheapCar = new Car();

	public Car getCar() {
		return cheapCar;
	}

	public void buildWheel() {
		cheapCar.setWheel("cheap wheel");
	}

	public void buildFrame() {
		cheapCar.setFrame("cheap frame");
	}

	public void buildEngine() {
		cheapCar.setEngine("cheap engine");
	}

	public void buildWidget() {
		cheapCar.setWidget("no widget");
	}
}
