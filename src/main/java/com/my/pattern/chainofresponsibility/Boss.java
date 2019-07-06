package com.my.pattern.chainofresponsibility;

public class Boss extends Leader {
	@Override
	protected void handleMoney(int money) {
		System.out.println("�ϰ屨��: " + money);
	}

	@Override
	protected int limit() {
		return Integer.MAX_VALUE;
	}
}
