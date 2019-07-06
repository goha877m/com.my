package com.my.pattern.chainofresponsibility;

public abstract class Leader {
	protected Leader nextHandler;// ��һ���쵼������

	public void handleRequest(int money) {
		if (money <= limit()) {
			handleMoney(money);
		} else {
			if (nextHandler != null) {
				nextHandler.handleRequest(money);
			}
		}
	}

	// ����
	protected abstract void handleMoney(int money);

	// ÿһ���쵼�ܹ���׼�Ķ��
	protected abstract int limit();
}
