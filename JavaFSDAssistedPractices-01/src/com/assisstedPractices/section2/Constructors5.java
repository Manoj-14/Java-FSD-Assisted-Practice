package com.assisstedPractices.section2;

public class Constructors5 {
	public static void main(String[] args) {
		Constructors c1 = new Constructors();
		Constructors c2 = new Constructors(2,4);
		
	}
}

class Constructors{
	Constructors(){
		System.out.println("Default Constructor");
	}
	
	Constructors(int a,int b){
		System.out.println("Parameterized constructors with parameters :"+a+","+b);
	}
}
