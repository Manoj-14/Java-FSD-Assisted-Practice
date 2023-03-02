package com.assisstedPractices.section2;

public class Methods3 {
	public static void main(String[] args) {
		Superclass sc = new Superclass();
		sc.method1();
		sc.method2(2);
		sc.method2(3, 4);
		
		childClass cc = new childClass();
		cc.method1();
	}
}


class Superclass{
	public void method1() {
		System.out.println("Method with out parameters");
	}
	
	public void method2(int a) {
		System.out.println("Method with 1 parameter: "+a);
	}
	
	//Method overloading
	public void method2(int a,int b) {
		System.out.println("Method overloading by changing no of parameters");
	}
}

class childClass extends Superclass{
	
	@Override
	public void method1() {
		System.out.println("Method1 overiding");
	}
}