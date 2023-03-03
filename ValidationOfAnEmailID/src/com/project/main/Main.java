package com.project.main;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> emails = new ArrayList<>();
		int op;
		Scanner input = new Scanner(System.in);		
		boolean flag = true;
		while (flag) {
			System.out.println(" 1. Add Email\n 2. Search Email\n Other key to exit");
			op = input.nextInt();
			switch (op) {
			case 1:
				System.out.println("Enter Emp Email:");
				emails.add(input.next());
				break;
			case 2:
				System.out.println("Enter email to search");
				String email = input.next();
				if (emails.contains(email)) {
					System.out.println("Entered Email is present in the array");
				} else {
					System.out.println("Entered Email is not present in array");
				}
				break;
			default:
				System.out.println("Thank You");
				flag = false;
			}
		}
		input.close();
	}

}
