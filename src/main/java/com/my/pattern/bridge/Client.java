package com.my.pattern.bridge;

public class Client {

	public static void main(String[] args) {
		// �ͻ������߼�
		RefinedAbstraction abs = new RefinedAbstraction(new ConcreteImplementorA());
		abs.operation();
		abs.refinedOperation();
		RefinedAbstraction abs2 = new RefinedAbstraction(new ConcreteImplementorB());
		abs2.operation();
		abs2.refinedOperation();
		
	}
}