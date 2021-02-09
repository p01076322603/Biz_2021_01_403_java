package com.callor.start.jdk;
import java.util.Random;

/*
 * for(int i = 0; i < 100; i++) {
 * Random 클래스를 이용한다
 * 1 ~ 100 까지의 범위에서 숫자 100개를 만들고 그중 짝수의 합을 계산한다
 */

public class Random_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int rndSum = 0;
		int countEven = 0;

		for (int i = 0; i < 100; i++) {

			int rndNum = (rnd.nextInt(100) + 1); // 1 ~ 100
			boolean bYes = (rndNum % 2 == 0);

			if (bYes) { // 짝수 판별

				rndSum += rndNum;
			//	System.out.println(rndNum);
				System.out.print(rndNum + " : 짝수\t");

				countEven++; // 짝수의 갯수

				if (countEven % 3 == 0) { // 짝수 3개마다 줄바꿈
					System.out.println();
				}
			}
		}
		System.out.println("\n\n임의의 숫자 100개 중 짝수들의 합 : " + rndSum);
		System.out.println("\n임의의 숫자 100개 중 짝수의 개수 : " + countEven);

		System.out.println("\n=========================================\n");

	}
}
