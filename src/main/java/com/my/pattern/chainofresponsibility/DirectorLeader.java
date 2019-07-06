package com.my.pattern.chainofresponsibility;

public class DirectorLeader extends Leader {

	@Override
	protected void handleMoney(int money) {
		System.out.println("董事长报销: " + money);

	}

	@Override
	protected int limit() {
		return 5000;
	}

}
