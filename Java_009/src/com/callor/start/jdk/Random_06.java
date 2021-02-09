package com.callor.start.jdk;

import java.util.Random;

public class Random_06 {

	public static void main(String args[]) {

		Random rnd = new Random();

		int printCount = 0;

		for (int i = 0; i < 100; i++) {

			int rndNum = (rnd.nextInt(100) + 1); // 1 ~ 100
			System.out.println(rndNum);

			printCount++;

			if (rndNum > 34) { // 34보다 크면 반복문 종료
				break;
			}
		}

		System.out.println("\n34보다 큰 값 : " + printCount + "번째에 나옴");

		System.out.println("\n===========================\n");
		
		int intEnd = 100;
		int count = 0;
		for(count = 0; count < intEnd; count++) {
			
			int num = (rnd.nextInt(100) + 1); // 1 ~ 100
			
			if(num > 50) {
				break;
			}
			
		}
		
		// 현재 위치에서 count 변수 값을 읽어올 수 있다.
		// 만약 for() 반복문이 중단되지 않고 모두 정상적으로 수행 되고나면
		// count와 intEnd는 count == intEnd가 된다
		
		if(intEnd <= count) {
			// for() 반복문이 정상종료 되었다
		}
		
		if(intEnd > count) {
			// for() 반복문이 중간에 break; 되었다
			System.out.println("\nfor() 중단");
			System.out.println((count + 1) + "번째에서 값 발견");
		} else {
			System.out.println("for() 모두 반복 수행 완료");
			System.out.println("값을 찾을 수 없음");
		}
	}
}
