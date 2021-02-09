package com.callor.start.jdk.keyinput;

import java.util.Scanner;

public class KeyInput_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("숫자 입력 >> ");

		int num = scan.nextInt();
		boolean bYes = (num % 2 == 0);
		
		if (bYes) {
			System.out.println(num + "은(는) 짝수");
		} else {
			System.out.println(num + "는(은) 홀수");
		}
	}
}
