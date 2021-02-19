package com.callor.applications;

import java.util.Scanner;

public class Score_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] strSubject = new String[3];
		strSubject[0] = "국어";
		strSubject[1] = "영어";
		strSubject[2] = "수학";

		int[] intScore = new int[3];
		int intScoreSum = 0;
		
		System.out.println("각 과목의 성적을 입력하세요");

		for (int i = 0; i < 3; i++) {
			System.out.print(strSubject[i] + " >> ");
			intScore[i] = scan.nextInt();
		}
	
		for (int i = 0; i < 3; i++) {
			intScoreSum += intScore[i];
		}
		System.out.println("과목 성적 합계 : " + intScoreSum);
		
	}
}
