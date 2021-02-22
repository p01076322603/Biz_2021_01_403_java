package com.callor.applications;

import java.util.Scanner;

public class Score_03 {

	public static void main(String[] args) {

		String[] strName = { "홍길동", "이몽룡", "성춘향" };
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < strName.length; i++) {

			System.out.printf("%s 학생의 과목점수를 입력합니다\n", strName[i]);

			System.out.print("국어 점수를 입력하세요 >> ");
			intKor[i] = scan.nextInt();
			System.out.print("영어 점수를 입력하세요 >> ");
			intEng[i] = scan.nextInt();
			System.out.print("수학 점수를 입력하세요 >> ");
			intMath[i] = scan.nextInt();
			
			System.out.println();
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
