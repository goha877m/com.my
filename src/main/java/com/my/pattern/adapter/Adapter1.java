package com.my.pattern.adapter;
/**
 * 适配器实现方法1：继承当前类并实现目标接口
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
