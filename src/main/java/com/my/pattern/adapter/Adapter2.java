package com.my.pattern.adapter;
/**
 * ������ʵ��2�����е�ǰ�����ò�ʵ��Ŀ��ӿ�
 * @author Administrator
 *
 */
public class Adapter2 implements TargetInterface
{
    private Adaptee adaptee = new Adaptee();

    @Override
    public void method1()
    {
        adaptee.method1();
    }

    @Override
    public void method2()
    {
        System.out.println("---method2---");
    }
}
