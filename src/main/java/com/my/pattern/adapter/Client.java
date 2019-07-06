package com.my.pattern.adapter;

public class Client {
	public static void main(String[] args) {
		Adapter1 adapter1 = new Adapter1();
		adapter1.method1();
		adapter1.method2();
		
		Adapter2 adapter2 = new Adapter2();
		adapter2.method1();
		adapter2.method2();
	}
}
