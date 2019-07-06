package com.my.pattern.builder;

interface Builder {
	public void buildWheel();

	public void buildFrame();

	public void buildEngine();

	public void buildWidget();

	public Car getCar();
}