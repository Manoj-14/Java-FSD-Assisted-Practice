package com.fileHandling.main;

import java.util.Scanner;

import com.fileHandling.resources.FileOperations;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Path of the file :");
		String path = input.nextLine();
		FileOperations fo = new FileOperations(path);
		boolean flag = true;
		while (flag) {
			System.out.println("1. Read File \n2. Write File\n3. Append File\n4. Exit\nEnter your choice:");
			int op = input.nextInt();
			input.nextLine();
			switch (op) {
			case 1:
				fo.read();
				break;
			case 2:
				System.out.println("Enter the Details:");
				String str = input.nextLine();
				fo.write(str);
				break;
			case 3:
				System.out.println("Enter the Details:");
				String str1 = input.nextLine();
				fo.append(str1);
				break;
			default:
				System.out.println("Existing...");
				flag = false;
			}
		}
		input.close();
	}
}
