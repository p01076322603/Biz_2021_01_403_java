package com.callor.start.jdk.random;

import java.util.Random;

public class Random_03 {

	public static void main(String args[]) {

		Random rnd = new Random();

		int intRndNum = rnd.nextInt();
		System.out.println(intRndNum);

		// 0 ~ (10 - 1) 중에서 한개의 수를 만들어라
		intRndNum = rnd.nextInt(10);
		System.out.println(intRndNum);

		System.out.println("\n===================================\n");

		for (int i = 0; i < 100; i++) {

			int num = i + 1;

			System.out.print(num + "\t");

			if (num % 5 == 0) {
				System.out.println();
			}
		}

		System.out.println("\n===================================\n");

		for (int i = 0; i < 100; i++) {

			// 0 ~ 99 숫자 중 임의의 수 1개를 만들어 변수 num에 저장하라
			// ( + 1 ) : 1 ~ 100 숫자 중 임의의 수 1개를 만들어 변수 num에 저장하라
			int num = rnd.nextInt(100) + 1;
			System.out.print(num + "\t");
			if ((i + 1) % 5 == 0) {
				System.out.println();
			}
		}
	}
}
