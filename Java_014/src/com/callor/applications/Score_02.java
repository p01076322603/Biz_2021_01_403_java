package com.callor.applications;

import java.util.Scanner;

public class Score_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strName = new String[3];
		String[] strKor = new String[3];
		String[] strEng = new String[3];
		String[] strMath = new String[3];

		for (int index = 0; index < strName.length; index++) {

			System.out.printf("%d번 학생 이름 입력 >> ", index + 1);
			strName[index] = scan.nextLine();
			System.out.printf("%s의 국어 점수 입력 >> ", strName[index]);
			strKor[index] = scan.nextLine();
			System.out.printf("%s의 영어 점수 입력 >> ", strName[index]);
			strEng[index] = scan.nextLine();
			System.out.printf("%s의 수학 점수 입력 >> ", strName[index]);
			strMath[index] = scan.nextLine();

			System.out.println();
		}

		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%4s\t%4s\t%4s\n", 
					strName[i], strKor[i], strEng[i], strMath[i]);
		}

		System.out.println("============================");
		
		for (int i = 0, sum = 0;i < strName.length; i++) {
			sum =  Integer.valueOf(strKor[i]);
			sum += Integer.valueOf(strEng[i]);
			sum += Integer.valueOf(strMath[i]);

			System.out.printf("%s의 점수 합계 : %d\n", strName[i], sum);
			System.out.printf("%s의 점수 평균 : %3.2f\n", strName[i], (float) sum / 3);
			System.out.println();
		}
	}
}
