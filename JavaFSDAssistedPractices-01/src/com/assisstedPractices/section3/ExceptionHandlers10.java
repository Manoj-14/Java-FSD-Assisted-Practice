package com.assisstedPractices.section3;

public class ExceptionHandlers10 {
	public static void main(String[] args) {
		MyExceptions myException = new MyExceptions("My Exception Class");
		try {
			System.out.println("Try Block is Executing");
			throw myException;
		}catch(MyExceptions me) {
			System.out.println("Catch Block");
			System.out.println(me);
		}
	}
}

class MyExceptions extends Exception{
	String str ;
	
	public MyExceptions(String str) {
		this.str = str;
	}
	
	public String toString() {
		return "My Exception occured "+this.str ;
	}
}
