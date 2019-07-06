package com.my.pattern.chainofresponsibility;

public class GroupLeader extends Leader {
	@Override
	protected void handleMoney(int money) {
		System.out.println("集团领导报销: " + money);
	}

	@Override
	protected int limit() {
		return 2000;
	}
}
