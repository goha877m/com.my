package com.my.pattern.proxy;
public class Client {
	public static void main(String[] args){
		//����Ŀ�����
		Subject target = new RealSubject();
		
		//�����������
		Proxy proxy = new Proxy(target);
		proxy.save();//���ô�������еķ���
	}
}
