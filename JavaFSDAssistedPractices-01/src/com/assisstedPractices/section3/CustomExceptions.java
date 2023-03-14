package com.assisstedPractices.section3;

public class CustomExceptions {
	public static void main(String[] args) {
		ThrowKeyword tk = new ThrowKeyword();
		System.out.println("Using Throws Keyword");
		try {
			tk.arithmeticExc();
		} catch (ArithmeticException ae) {
			System.out.println("Error:"+ae.getMessage());
		}
		System.out.println("---------------------------------");
		System.out.println("Using Throw and Finally Keyword");
		tk.divideByZeroError();
		
		System.out.println("---------------------------------");
		System.out.println("Custom Exception");
		
		try {
			throw new MyException("My custom exception");
		}catch(MyException myException) {
			System.out.println(myException.getMessage());
		}
	}
}

class ThrowKeyword {
	int a = 3, b = 0;

	public void divideByZeroError() {
		try {
			if (b == 0) {
				throw new ArithmeticException("Zero division error");
			} else {
				System.out.println("Result:" + a / b);
			}
		} catch (ArithmeticException ae) {
			System.out.println("Error: " + ae.getMessage());
		} finally {
			System.out.println("Calculation completed");
		}
	}

	public void arithmeticExc() throws ArithmeticException {
		int a = 9, b = 0, res;
		res = a / b;
		System.out.println("Result: " + res);
	}
}

class MyException extends Exception {
	public MyException(String s) {
		super(s);
	}
}