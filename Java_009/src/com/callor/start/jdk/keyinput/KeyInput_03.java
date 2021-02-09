package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int num1 = (rnd.nextInt(100) + 1);

		System.out.print("숫자 입력 >> ");
		int inputNum = scan.nextInt();
		
		// 1. inputNum > num1 이냐?
		// 맞으면 > 표시하고 종료
		if (inputNum > num1) {
			System.out.println(" > ");
		
		// 그렇지 않으면 inputNum < num1 이냐?
		// 맞으면 < 표시하고 종료	
		} else if (inputNum < num1) {
			System.out.println(" < ");
			
		// 그렇지 않으면 inputNum == num1 이냐?
		// 맞으면 == 표시하고 종료
		} else if (inputNum == num1) {
			System.out.println(" == ");
		}
	}
}
