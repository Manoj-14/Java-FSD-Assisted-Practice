package com.ArithmeticCalculator.operations;

public class ArithmeticCalculator {
	private int a,b;
	public ArithmeticCalculator(int a,int b) {
		this.a = a;
		this.b = b;
	}
	
	public int add() {
		return a+b;
	}
	public int substract() {
		return a-b;
	}
	
}
