package com.callor.applications;

import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] intKor = new int[5];
		int intKorSum = 0;
		
		System.out.println("다음 학생들의 국어 점수를 입력하세요");
		for (int i = 0; i < 5; i++) {

			System.out.printf("%d 번 학생 >> ", i + 1);
			intKor[i] = scan.nextInt();
		}

		System.out.println("====================================");
		System.out.println("학생번호\t국어점수");
		System.out.println("------------------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.print(i + 1 + "\t\t");
			System.out.println(intKor[i]);
			intKorSum += intKor[i];
		}
		System.out.println("====================================");
		System.out.println("합계 : " + intKorSum);
		System.out.println("====================================");
	
	}

}
