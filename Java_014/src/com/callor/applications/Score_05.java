package com.callor.applications;

import java.util.Random;

public class Score_05 {

	public static void main(String[] args) {

		Random rnd = new Random();

		// 학생이름이 미리 정해진 경우 개수를 지정하지 않고
		// 값을 지정하여 배열선언하기

		//		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향" };
		String[] strName = { "홍길동", "이몽룡", "성춘향", "장록수", "임꺽정" };

		// 학생 이름 배열개수만큼 과목성적을 저장할 배열 선언
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];

		// 학생이름 배열 개수만큼 총점과 평균을 저장할 배열 선언
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];

		// 학생별 점수를 입력(생성)하는 코드
		for (int i = 0; i < strName.length; i++) {

			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		// 학생별 총점을 계산하는 코드
		for (int i = 0; i < strName.length; i++) {

			intSum[i]  = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}

		// 학생별 평균을 계산하는 코드
		for (int i = 0; i < strName.length; i++) {

			floatAvg[i] = (float) intSum[i] / 3;
		}

		// 각 과목의 성적과 총점, 평균 제목 출력
		System.out.println("=============================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("---------------------------------------------");

		// 각 과목의 성적과 총점, 평균 수치 출력
		for (int i = 0; i < strName.length; i++) {

			System.out.printf("%s\t%4s\t%4s\t%4s\t%4s\t%3.2f\n", 
					strName[i], intKor[i], intEng[i],
					intMath[i], intSum[i], floatAvg[i]);
		}

		System.out.println("=============================================");
	}
}