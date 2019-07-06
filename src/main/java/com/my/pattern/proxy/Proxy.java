package com.my.pattern.proxy;

public class Proxy implements Subject {
	// 接口对象
	private Subject iSubject;

	public Proxy(Subject iSubject) {
		this.iSubject = iSubject;
	}

	@Override
	public void save() {
		before();
		iSubject.save(); // 调用接口对象真正的实现（在RealSubject中实现）
		after();
	}

	private void after() {
		System.out.println("代理对象 提交事务。。。");
	}

	private void before() {
		System.out.println("代理对象 开始事物。。。");
	}

}
