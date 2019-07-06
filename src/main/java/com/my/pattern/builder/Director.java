package com.my.pattern.builder;

class Director {
	private Builder builder;

	public Director(Builder bld) {
        builder = bld;
    }

	public void produceCar() {
		// ����Բ�����п���
		builder.buildFrame();
		builder.buildWidget();
		builder.buildWheel();
		builder.buildEngine();
	}

	public Car getCar() {
		return builder.getCar();
	}
}
