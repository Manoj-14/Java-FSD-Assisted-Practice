package com.assisstedPractices.section2;

public class Arrays15 {
	public static void main(String[] args) {
		intArray();
		System.out.println();
		stringArray();
	}
	
	public static void intArray() {
		int[] intArr = {2,3,4,5};
		
		for(int i: intArr) {
			System.out.print(i+",");
		}
	}
	
	public static void stringArray() {
		String[] strArr = {"Max","Torry","Abhi","Tex"};
		
		for(String i: strArr) {
			System.out.print(i+",");
		}
	}
}
