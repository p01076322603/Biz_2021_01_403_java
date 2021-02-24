package com.callor.applications;

import java.util.Random;
import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01 {

	public static void main(String[] args) {
		
		/* 정수 값 하나를 매개변수로 받아 소수인지 판별하고,
		 * 소수가 맞다면 받은 매개변수 값을 return, 아니라면 정수 값 -1을 return 하는
		 * prime() method를 사용하기 위해 PrimeServiceV2 클래스를 호출하고 인스턴스화 */
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int rndNum = 0; // 지정된 범위 내 임의의 값을 저장할 변수
		int rndSum = 0; // 반복문 내 소수의 합을 저장할 변수
		int rndRange = 499; // 임의의 정수를 생성할 구간 최대치를 저장할 변수 - 1
		int rowCount = 0; // 출력 값 열 구분을 위한 카운트 변수
		
		
		// 임의의 정수 100개를 생성하고 그중 소수인 값들과 그 합을 출력하는 반복문
		System.out.println("정수의 범위 : 2 ~ " + (rndRange + 1));
		System.out.println("임의의 정수 100개 중 소수인 값 : ");
		for (int i = 0; i < 100; i++) { // 100번 반복
		
			// 2 ~ rndRange 사이의 값을 생성해 rndNum에 보관
			rndNum = rnd.nextInt(rndRange) + 2; 
		
			// prime() method에 rndNum값을 전달해 return 값이 -1이 아니면 return 출력
			if (psV2.prime(rndNum) != (-1)) {
				System.out.print(psV2.prime(rndNum) + "\t");
				
				// rndNum의 값이 소수라면 rndSum의 값에 더한다
				rndSum += rndNum;
				
				rowCount++; // 출력 되는 값을 5개마다 줄바꿈 해준다 
				if (rowCount % 5 == 0) System.out.println();
			}
		}
		// 소수의 합계 출력
		System.out.println("\n출력된 소수의 합계 : " + rndSum);
	}
}