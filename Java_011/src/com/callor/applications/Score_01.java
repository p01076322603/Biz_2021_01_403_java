package com.callor.applications;

import java.util.Scanner;

public class Score_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;

		int score = 0;
		boolean bYes = true;

		System.out.println("점수 범위 : 0 ~ 100\n");
		// prompt : Scanner의 nextInt()를 사용하여 키보드 입력을 받는 코드가 실행되면
		// 화면에 아무것도 없이 멈춘것처럼 보이는 현상이 있는데 미리 어떤 일을 할 것 인지 알려주는 메시지
		System.out.print("국어 점수를 입력하세요 >> ");
		while (true) {
			// Code Blocking : scan.nextInt() 메서드를 호출하면 코드 동작이 멈추고,
			// 사용자가 무엇인가 입력 한 후 Enter를 누를때까지 코드가 실행되지 않는다
			score = scan.nextInt();
			bYes = score >= 0 && score <= 100;

			if (bYes) {
				intKor = score;
				break;

			} else {
				System.out.print("국어 점수를 입력하세요 >> ");
			}
		}

		System.out.print("\n영어 점수를 입력하세요 >> ");
		while (true) {
			score = scan.nextInt();
			bYes = score >= 0 && score <= 100;

			if (bYes) {
				intEng = score;
				break;

			} else {
				System.out.print("영어 점수를 입력하세요 >> ");
			}
		}

		System.out.print("\n수학 점수를 입력하세요 >> ");
		while (true) {
			score = scan.nextInt();
			bYes = score >= 0 && score <= 100;

			if (bYes) {
				intMath = score;
				break;

			} else {
				System.out.print("수학 점수를 입력하세요 >> ");
			}
		}

		int intSum = intKor + intEng + intMath;
		// fAvg 변수는 실수형이지만 intSum과 3이 둘다 정수형이므로
		// fAvg 변수에 저장되는 값은 소수점 이하가 무조건 0이 된다
		// float fAvg = intSum / 3;

		// 결과값을 실수형(float, double)으로 하고자 할때는 intSum 변수 값이나 숫자 3을 실수형으로 만들어줘야 한다.
		float fAvg = intSum / 3.0f;
		// 1. intSum을 실수형으로 변경하고 계산하기
		// 정수형 intSum에 담긴 값을 float 형 값으로 강제 형변환하여 나눗셈 준비
		// float fAvg = (float) intSum / 3;
		// float fAvg = intSum / (float) 3;

		// 2. 숫자 3을 실수형으로 만들어 계산하기
		// intSum을 실수 3.0f로 나눗셈을 지시하면 intSum 변수에 담긴 값은 자동으로 실수형으로 변환된다 (자동 형변환)
		// float fAvg = intSum / 3.0f;
		// double fAvg = intSum / 3.0d;

		System.out.println();
		System.out.println("=========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + fAvg);
		System.out.println("=========================================");
	}
}