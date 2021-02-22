package com.callor.applications;

import java.util.Random;

public class Numbers_03 {

	public static void main(String[] args) {

		// 정수형 배열 45개를 선언하고 1 ~ 45 까지 정수를 저장한다
		int[] intNums = new int[45];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = i + 1;
		}

		// 배열 출력
		System.out.print("{ ");
		for (int i = 0; i < intNums.length - 1; i++) {
			System.out.print(intNums[i] + ", ");
		}
		System.out.print(intNums[intNums.length - 1]);
		System.out.println(" }");

		Random rnd = new Random();

//		for (int i = 0; i < 10; i++) {
//			int num1 = rnd.nextInt(45);
//			int num2 = rnd.nextInt(45);
//			System.out.printf("%d, %d\n", intNums[num1], intNums[num2]);
//		}

		// 배열을 무작위로 섞는다
		for (int i = 0; i < 1000; i++) {
			int num1 = rnd.nextInt(intNums.length);
			int num2 = rnd.nextInt(intNums.length);

			int temp = intNums[num1];
			intNums[num1] = intNums[num2];
			intNums[num2] = temp;
		}

		// 배열 출력
		System.out.print("{ ");
		for (int i = 0; i < intNums.length - 1; i++) {
			System.out.print(intNums[i] + ", ");
		}
		System.out.print(intNums[intNums.length - 1]);
		System.out.println(" }");

		System.out.println("==================================================="
			   + "============================================================="
		 	   + "=============================================================");
		
		// 무작위로 섞은 배열 중 앞자리 6개 출력
		System.out.println("\n    행운의 숫자");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", intNums[i]);
			if (i == 2) System.out.println();
		}
		System.out.println();
	}
}