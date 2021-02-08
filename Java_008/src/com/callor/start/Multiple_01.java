package com.callor.start;

public class Multiple_01 {

	public static void main(String args[]) {

		int sum = 0;

		for (int i = 0; i < 100; i++) { // 0 ~ 99

			int number = i + 7; // 7 ~ 106
			boolean bYes = (number % 3 == 0); // 3의 배수

			if (bYes) { // 3의 배수 확인

				System.out.println("3의 배수 : " + number);
				sum = sum + number;
			}
		}

		System.out.println("====================");
		
		System.out.println("3의 배수의 합 : " + sum);
	}
}