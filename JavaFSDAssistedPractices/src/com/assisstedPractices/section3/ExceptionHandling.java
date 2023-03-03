package com.assisstedPractices.section3;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 number to divide:");
		a = input.nextInt();
		b = input.nextInt();
		try {
			int res = a/b;
			System.out.println("Result:"+res);
		}catch(ArithmeticException ae) {
			System.out.println("Error:"+ae.getMessage());
		}finally {
			System.out.println("End Calculation");
		}
	}
}
