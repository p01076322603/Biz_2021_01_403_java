package com.callor.applications;

import java.util.Scanner;

public class Score_02A {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strName = new String[3];
		int[] intKor = new int[3];
		int[] intEng = new int[3];
		int[] intMath = new int[3];

		for (int index = 0; index < strName.length; index++) {
			System.out.printf("%d번 학생 이름 입력 >> ", index + 1);
			strName[index] = scan.nextLine();
		}
		System.out.println();
		
		// 문자열형으로 입력받고 정수로 변경하여 저장
		for (int index = 0; index < intKor.length; index++) {
			System.out.printf("%s의 국어 점수 입력 >> ", strName[index]);
			intKor[index] = Integer.valueOf(scan.nextLine());
		}
		System.out.println();
		
		for (int index = 0; index < intEng.length; index++) {
			System.out.printf("%s의 영어 점수 입력 >> ", strName[index]);
			intEng[index] = Integer.valueOf(scan.nextLine());
		}
		System.out.println();
		
		for (int index = 0; index < intMath.length; index++) {
			System.out.printf("%s의 수학 점수 입력 >> ", strName[index]);
			intMath[index] = Integer.valueOf(scan.nextLine());
		}
		System.out.println();
		
		System.out.println("============================");
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("----------------------------");

		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%s\t%4d\t%4d\t%4d\n", 
					strName[i], intKor[i], intEng[i], intMath[i]);
		}

		System.out.println("============================");
	}
}