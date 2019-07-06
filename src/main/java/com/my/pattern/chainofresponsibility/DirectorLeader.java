package com.my.pattern.chainofresponsibility;

public class DirectorLeader extends Leader {

	@Override
	protected void handleMoney(int money) {
		System.out.println("���³�����: " + money);

	}

	@Override
	protected int limit() {
		return 5000;
	}

}
