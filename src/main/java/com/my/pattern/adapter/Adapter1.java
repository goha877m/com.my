package com.my.pattern.adapter;
/**
 * ������ʵ�ַ���1���̳е�ǰ�ಢʵ��Ŀ��ӿ�
 * @author Administrator
 *
 */
public class Adapter1 extends Adaptee implements TargetInterface
{
    @Override
    public void method2()
    {
        System.out.println("---method2----");
    }
}
