package com.my.pattern.proxy;

//目标对象
public class RealSubject implements Subject{
 
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("目标对象 处理事物。。。。。。");
	}
 
}
