package com.my.pattern.prototype;

class PrototypeConcrete1 extends Prototype {
	private int num;

	public int getNum() {
		return num;
	}

	public PrototypeConcrete1(int n) {
		num = n;
	}

	public Prototype clone() {
		return new PrototypeConcrete1(++num);
	}
}
