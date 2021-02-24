package com.callor.applications;

import java.util.Random;
import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01B {

	public static void main(String[] args) {

		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int[] rndArray = new int[100];
		int	  rndSum = 0;
		int   rndRange = 499; // 0 ~ 498 -> 2 ~ 500
		int   rowCount = 0;
		
		// rndArray 배열에 임의의 수 저장
		for (int i = 0; i < rndArray.length; i++) {
			rndArray[i] = rnd.nextInt(rndRange) + 2;
		}

		// 소수인지 판별 후 형식에 맞게 출력
		System.out.println("정수의 범위 : 2 ~ " + (rndRange + 1));
		System.out.println("임의의 정수 100개 중 소수인 값 : ");
		for (int i = 0; i < rndArray.length; i++) { // 배열 크기만큼 반복

			if (psV2.prime(rndArray[i]) != (-1)) {
				System.out.print(psV2.prime(rndArray[i]) + "\t");
				rndSum += rndArray[i];
		
				rowCount++; // 열을 카운트하여 행 구분
				if (rowCount % 5 == 0) 	System.out.println();
			}
		}
		
		// 소수의 합계 출력
		System.out.println("\n출력된 소수의 합계 : " + rndSum);
	}
}
