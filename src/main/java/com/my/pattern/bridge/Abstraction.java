package com.my.pattern.bridge;
public abstract class Abstraction {
    private Implementor mImplementor;

    public Abstraction(Implementor implementor) {
        this.mImplementor = implementor;
    }

    public void operation(){
        mImplementor.operationImpl();
    }
}   
