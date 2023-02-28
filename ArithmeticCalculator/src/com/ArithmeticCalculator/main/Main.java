package com.ArithmeticCalculator.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.ArithmeticCalculator.operations.ArithmeticCalculator;

public class Main {

	private static int a, b;

	private static void input() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		a = input.nextInt();
		b = input.nextInt();
	}

	private static void operations() {
		Scanner input = new Scanner(System.in);
		ArithmeticCalculator calculator = new ArithmeticCalculator(a, b);
		int op;
		boolean loop = true;
		while (loop) {
			System.out.println(
					"\n1.Addtion\n2.Subtraction\n3.Multiplication\n4.Division\nEnter any key to exit\nEnter the Option:");
			try {
				op = input.nextInt();
				switch (op) {
				case 1:
					System.out.printf("Addtion of %d and %d is %d", a, b, calculator.add());
					break;
				case 2:
					System.out.printf("Subtraction of %d and %d is %d", a, b, calculator.substract());
					break;
				case 3:
					System.out.printf("Multiplication of %d and %d is %d", a, b, calculator.multyply());
					break;
				case 4:
					System.out.printf("Division of %d and %d is %d", a, b, calculator.divide());
					break;
				default:
					System.out.println("Exiting");
					loop = false;

				}
			} catch (Exception ime) {
				System.out.println(ime.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		input();
		operations();
	}
}
