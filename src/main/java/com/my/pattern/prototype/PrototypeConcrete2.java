package com.my.pattern.prototype;

class PrototypeConcrete2 extends Prototype {
	private int num;

	public int getNum() {
		return num;
	}

	public PrototypeConcrete2(int n) {
		num = n;
	}

	public Prototype clone() {
		num = num*2;
		return new PrototypeConcrete2(num);
	}
}
