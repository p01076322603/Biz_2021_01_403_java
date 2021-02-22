package com.callor.applications;

import java.util.Random;

public class Score_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		
		String[] strName = { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];

		for (int i = 0; i < strName.length; i++) {

			System.out.printf("%s 학생의 과목점수를 입력합니다\n", strName[i]);

			intKor[i] = rnd.nextInt(100) + 1;
			System.out.println("국어 점수 : " + intKor[i]);
			intEng[i] = rnd.nextInt(100) + 1;
			System.out.println("영어 점수 : " + intEng[i]);
			intMath[i] = rnd.nextInt(100) + 1;
			System.out.println("수학 점수 : " + intMath[i]);

		}
		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%4s\t%4s\t%4s\n",
					strName[i], intKor[i], intEng[i], intMath[i]);
		}

		System.out.println("============================");
	}
}