package com.github.p01076322603;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = 10;
		int num2 = 2;

		System.out.println("num1 = " + num1 + ", num2 = " + num2 + "\n");
		

		int math = 0;

		System.out.print("사칙연산 부호 입력 : ");
		char operator = scan.next().charAt(0);

		switch (operator) {

		case '+':
			math = (num1 + num2);
			System.out.println("num1 + num2 = " + math);
			break;
		case '-':
			math = (num1 - num2);
			System.out.println("num1 - num2 = " + math);
			break;
		case '*':
			math = (num1 * num2);
			System.out.println("num1 * num2 = " + math);
			break;
		case '/':
			math = (num1 / num2);
			System.out.println("num1 / num2 = " + math);
			break;
		default:
			System.out.println("사칙연산이 아님\n");
		}
	}
}