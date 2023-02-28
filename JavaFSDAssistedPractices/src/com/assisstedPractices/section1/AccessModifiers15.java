package com.assisstedPractices.section1;

public class AccessModifiers15 {
	public static void main(String[] args) {
		
		SuperClass.defaultMethod();
		SuperClass.publicMethod();
		SuperClass.protectedMethod();
//		SuperClass.privateMethod();
		
	}
}

class SuperClass{
	
	SuperClass(){
//		All Are accessible
		defaultMethod();
		privateMethod();
		publicMethod();
		protectedMethod();
	}
	
	static void defaultMethod() {
		System.out.println("Default access specifier");
	}
	
	public static void publicMethod() {
		System.out.println("Public access specifier");
	}
	
	private static void privateMethod() {
		System.out.println("Private access specifier");
	}
	
	protected static void protectedMethod() {
		System.out.println("Protected access specifier");
	}
}

class ChildClass extends SuperClass{
	public ChildClass() {
		
//		super.privateMethod();  //private can't be accessible
		
		super.defaultMethod();
		super.publicMethod();
		super.protectedMethod();
	}
}

class SimpClass{
//	SuperClass.protectedMethod(); // can't be accessible
}