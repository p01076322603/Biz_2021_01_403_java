package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		int[] intKor = new int[20];

		// 1 ~ 100 임의의 수 20개를 만들어 intKor 배열에 한개씩 저장하라
		// intKor 배열에 0번주소부터 19번주소까지 위치에 한개씩 저장하라
		for (int index = 0; index < 20; index++) {
			int num = rnd.nextInt(100) + 1;
			intKor[index] = num;
		}

		// intKor 배열에 저장된 값들을 0번주소에 저장된 값부터
		// 19번 주소에 저장된 값까지 순서대로 출력하라
		for (int index = 0; index < 20; index++) {
			System.out.println(intKor[index]);
		}
		for (int index = 0; index < 20; index++) {
			
			/* kor_index 라는 코드가 index 변수 값을 가져와서 kor_0...100과
			 * 같은 방식으로 변환되지 않는다.
			 * java는 kor_index = 1000 이라는 코드를 만나면 kor_index 라는 변수가
			 * 선언되어있는지 찾고 없으면 오류를 발생한다
			 */

			// kor_0 ~ kor_100
			// kor_index = 100;
		}
	}
}