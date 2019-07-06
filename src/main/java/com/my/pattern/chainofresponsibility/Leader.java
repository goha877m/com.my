package com.my.pattern.chainofresponsibility;

public abstract class Leader {
	protected Leader nextHandler;// 上一级领导处理者

	public void handleRequest(int money) {
		if (money <= limit()) {
			handleMoney(money);
		} else {
			if (nextHandler != null) {
				nextHandler.handleRequest(money);
			}
		}
	}

	// 处理
	protected abstract void handleMoney(int money);

	// 每一级领导能够批准的额度
	protected abstract int limit();
}
