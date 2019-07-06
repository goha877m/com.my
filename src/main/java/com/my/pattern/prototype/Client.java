package com.my.pattern.prototype;

public class Client {
	public static void main(String[] args) {
		Prototype prototype1 = new PrototypeConcrete1(1);
		Prototype prototype2 = new PrototypeConcrete2(2);
		Prototype prototype1Copy = prototype1.clone();
		Prototype prototype2Copy = prototype2.clone();
		System.out.println("prototype1Copy:" + prototype1Copy.getNum());
		System.out.println("prototype2Copy:" + prototype2Copy.getNum());
	}
}