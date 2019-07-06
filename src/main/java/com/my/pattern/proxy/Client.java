package com.my.pattern.proxy;
public class Client {
	public static void main(String[] args){
		//创建目标对象
		Subject target = new RealSubject();
		
		//创建代理对象
		Proxy proxy = new Proxy(target);
		proxy.save();//调用代理对象中的方法
	}
}
