package com.my.pattern.proxy;

public class Proxy implements Subject {
	// �ӿڶ���
	private Subject iSubject;

	public Proxy(Subject iSubject) {
		this.iSubject = iSubject;
	}

	@Override
	public void save() {
		before();
		iSubject.save(); // ���ýӿڶ���������ʵ�֣���RealSubject��ʵ�֣�
		after();
	}

	private void after() {
		System.out.println("������� �ύ���񡣡���");
	}

	private void before() {
		System.out.println("������� ��ʼ�������");
	}

}
