package com.my.pattern.chainofresponsibility;

public class ManagerLeader extends Leader {

	@Override
	protected void handleMoney(int money) {
		System.out.println("经理报销: " + money);

	}

	@Override
	protected int limit() {
		return 500;
	}

}
