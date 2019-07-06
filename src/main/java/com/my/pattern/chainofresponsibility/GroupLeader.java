package com.my.pattern.chainofresponsibility;

public class GroupLeader extends Leader {
	@Override
	protected void handleMoney(int money) {
		System.out.println("�����쵼����: " + money);
	}

	@Override
	protected int limit() {
		return 2000;
	}
}
