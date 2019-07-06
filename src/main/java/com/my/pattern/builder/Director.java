package com.my.pattern.builder;

class Director {
	private Builder builder;

	public Director(Builder bld) {
        builder = bld;
    }

	public void produceCar() {
		// 这里对步骤进行控制
		builder.buildFrame();
		builder.buildWidget();
		builder.buildWheel();
		builder.buildEngine();
	}

	public Car getCar() {
		return builder.getCar();
	}
}
