package com.assisstedPractices.section1;

public class TypeCasting13 {
	public static void main(String[] args) {
		System.out.println("Implicit Casting:");
		implicitCasting();
		System.out.println("-------------------");
		System.out.println("Explicit Casting:");
		explicitCasting();
	}

	private static void explicitCasting() {
		double a = 10.553;
		System.out.println("Double :"+ a);
		float b = (float) a;
		System.out.println("Double -> float :"+ b);
		long c = (long) b;
		System.out.println("Float -> long :"+ c);
		int d = (int) c;
		System.out.println("Long -> Int :"+ d);
		short e = (short) d;
		System.out.println("Int -> Short :"+ e);
		byte f = (byte) e;
		System.out.println("Short -> Byte :"+ f);
	}

	private static void implicitCasting() {
		
		byte a = 20;
		System.out.println("Byte :"+ a);
		short b = a;
		System.out.println("Byte -> Short :"+ b);
		int c = b;
		System.out.println("Short -> int :"+ c);
		long d =  c;
		System.out.println("int -> long :"+ d);
		float e = d;
		System.out.println("long -> float :"+ e);
		double f = e;
		System.out.println("float -> double :"+ f);
	}
}
