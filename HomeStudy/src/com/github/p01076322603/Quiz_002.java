package com.github.p01076322603;

public class Quiz_002 {
	
	public static void main(String args[]) {
			
		int num1 = 0;
		int num2 = 1;
		int sum = 0;

		int count = 20;
		
		System.out.print(num1);
		
		for(int i = 1 ; i < count ; i++) {
			System.out.print(", " + (num1 + num2));
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}
	}
}
