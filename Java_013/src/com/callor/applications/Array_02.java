package com.callor.applications;

import java.util.Random;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNum = new int[10];
		int intSum = 0;
		int intEvenSum = 0;
		int intEvenCount = 0;
		boolean bYes = true;

		for (int i = 0; i < 10; i++) { // intSum 배열 저장
			intNum[i] = rnd.nextInt(100) + 1;
			
			bYes = (intNum[i] % 2 == 0);
			if (bYes) {
				System.out.print('^');
			}
			System.out.printf("%d ", intNum[i]);
		}

		for (int i = 0; i < 10; i++) { // intSum 배열의 합계
			intSum += intNum[i];
		}

		for (int i = 0; i < 10; i++) { // intSum 배열 중 짝수의 합계
			bYes = (intNum[i] % 2 == 0);

			if (bYes) {
				intEvenSum += intNum[i];
				++intEvenCount;
			}
		}

		System.out.println("\n\nintNum 배열의 합계 : " + intSum);
		System.out.println("intNum 배열 중 짝수의 합계 : " + intEvenSum);
		System.out.println("intNum 배열 중 짝수의 개수 : " + intEvenCount);
	}
}
