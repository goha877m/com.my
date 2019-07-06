package com.my.pattern.adapter;
/**
 * 适配器实现2：持有当前类引用并实现目标接口
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
