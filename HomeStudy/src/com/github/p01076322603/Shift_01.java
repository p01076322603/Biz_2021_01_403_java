package com.github.p01076322603;

public class Shift_01 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = -10;
		System.out.println("10진법 a = 10");
		System.out.printf(" 2진법 a = %032d" + "\n", Integer.parseInt(Integer.toBinaryString(a)));
		System.out.println();
		System.out.println("10진법 b = -10");
		System.out.println(" 2진법 b = " + Integer.toBinaryString(b));		

		a = a >> 0;
		b = b >> 0;
		System.out.println("\n=== 비트 연산 후 ===\n");
		
		System.out.println("10진법 a = " + a);
		System.out.printf(" 2진법 a = %032d" + "\n", Integer.valueOf(Integer.toBinaryString(a)));
		System.out.println();
		System.out.println("10진법 b = " + b);
//		System.out.printf(" 2진법 b = %032d", Integer.valueOf(Integer.toBinaryString(b)));
//		System.out.println(" 2진법 b = " + Double.valueOf(Integer.toBinaryString(b)));
		System.out.println(" 2진법 b = " + Integer.toBinaryString(b));
		
		
	}
}
