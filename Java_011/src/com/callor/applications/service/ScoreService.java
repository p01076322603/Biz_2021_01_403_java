package com.callor.applications.service;

import java.util.Scanner;

/* java의 class와 method() 호출
 * ScoreService class는 main() method가 없어서 여기에 있는 코드는 직접 Run(^F11)하여 실행할 수 없다
 * 누군가가 ScoreService를 객체, 인스턴스로 만들고 Score() method를 호출해주어야만 코드를 실행할 수 있다
 * 
 * 다른 언어에서는 module 등의 이름으로 사용한다.
 */

public class ScoreService {

	/* Class와 method()의 명명법
	 * Class : 첫글자 영문 대문자, 이후 영문 대소문자 숫자
	 * method() : 첫글자 영문 소문자, 이후 영문 대소문자 숫자
	 * 
	 * 클래스 명명법 : Upper CamelCase
	 * method 명명법 : Lower CamelCase
	 */
	
	public void score() {
		
		Scanner scan = new Scanner(System.in);

		int intKor = 0;
		int intEng = 0;
		int intMath = 0;

		int score = 0;
		boolean bYes = true;

		System.out.println("점수 범위 : 0 ~ 100\n");
		System.out.print("국어 점수를 입력하세요 >> ");
	
		while (true) {
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
		float fAvg = (float) intSum / 3.0f;
		
		System.out.println();
		System.out.println("=========================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		System.out.println(intKor + "\t" + intEng + "\t" + intMath + "\t" + intSum + "\t" + fAvg);
		System.out.println("=========================================");

	}
}
