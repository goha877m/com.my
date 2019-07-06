package com.my.pattern.builder;

public class Test {
	public static void main(String[] args) {
		Builder bld = new EconomicBuilder();
		Director director = new Director(bld);
		director.produceCar();
		Car car = director.getCar();
		System.out.println(car.toString());
		
		Builder cheapBld = new CheapBuilder();
		Director cheapDirector = new Director(cheapBld);
		cheapDirector.produceCar();
		System.out.println(cheapDirector.getCar());
	}
}