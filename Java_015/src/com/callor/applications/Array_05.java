package com.callor.applications;

import java.util.Random;

public class Array_05 {

	public static void main(String[] args) {

		// 무작위 값을 생성할 Random 클래스 생성 및 초기화
		Random rnd = new Random();

		// 100 크기의 intNums 배열 생성 및 초기화
		int[] intNums = new int[100];

		// intNums 배열에 1 ~ 100 까지의 무작위 값 저장
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(100) + 1;
		}

		// intNums 배열의 값 중 조건에 맞는 값의 합계를 저장할 변수
		int intSum = 0;

		// intNums 배열에 저장된 값 중 3의 배수이면서 5의 배수인 값을 찾아 리스트를 출력하고 합계를 구한다
		System.out.println("intNum 배열에서 3의 배수 이면서 5의 배수인 값 : ");
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] % 3 == 0 && intNums[i] % 5 == 0) {
				System.out.print(intNums[i] + " ");
				intSum += intNums[i];
			}
		}
		// 합계 출력
		System.out.println("\n합계 : " + intSum);
	}
}
