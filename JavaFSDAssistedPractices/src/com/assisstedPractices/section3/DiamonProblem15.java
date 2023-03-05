package com.assisstedPractices.section3;

public class DiamonProblem15 {
	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		mainClass.printInt1();
		mainClass.printInt2();
	}
}

interface Interface1 {
	void printInt1();
}

interface Interface2 {
	void printInt2();
}

class MainClass implements Interface1, Interface2 {

	@Override
	public void printInt2() {
		System.out.println("Interface method 2 printing....");

	}

	@Override
	public void printInt1() {
		System.out.println("Interface method 1 printing....");
	}

}