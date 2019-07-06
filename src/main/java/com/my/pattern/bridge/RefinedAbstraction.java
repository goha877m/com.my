package com.my.pattern.bridge;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor implementor) {
		super(implementor);
	}

	public void refinedOperation() {
		System.out.println("RefinedAbstraction");
	}
}
