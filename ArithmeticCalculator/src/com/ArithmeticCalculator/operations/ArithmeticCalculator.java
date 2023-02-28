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
	public int multyply() {
		return a*b;
	}
	public int divide() {
		try {
			int res =  a/ b;
			return res;
		}catch(ArithmeticException ae) {
			System.out.println("Zero division error");
		}
		return 0;
	}
}
