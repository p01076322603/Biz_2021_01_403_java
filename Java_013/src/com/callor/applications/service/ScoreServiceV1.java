package com.callor.applications.service;

import java.util.Scanner;

public class ScoreServiceV1 {

	/* 클래스 영역에 선언된 변수들 : 인스턴스 변수
	 * 클래스 영역 == 멤버 영역
	 * ScoreServiceV1 ssV1 : 클래스를 객체로 선언하고
	 * new ScoreServiceV1 : 객체를 초기화한다
	 * 
	 * 인스턴스 변수 : 객체가 초기화 되면 자동으로 사용할 준비가 되는 변수들
	 */
	private Scanner scan = new Scanner(System.in);

	private int intKor = 0;
	private int intEng = 0;
	private int intMath = 0;
	private int intSum = 0;
	private float floatAvg = 0;

	// input() method가 호출되면
	// 키보드를 통해서 국어, 영어, 수학 점수를 입력받고 intKor, intEng, intMath에 저장 

	public void input() {

		// input() method의 지역변수
		int intNum = 0;

		System.out.print("국어 점수를 입력하세요 >> ");
		intKor = scan.nextInt();
		System.out.print("영어 점수를 입력하세요 >> ");
		intEng = scan.nextInt();
		System.out.print("수학 점수를 입력하세요 >> ");
		intMath = scan.nextInt();
	}

	public void sum() {
		//		intSum = intKor + intEng + intMath;
		int intSum = intKor;
		intSum += intEng;
		intSum += intMath;

	}

	public void avg() {
//		floatAvg = (float) intSum / 3;
		floatAvg = (float) (intKor + intEng + intMath) / 3;
	}

	// intKor, intEng, intMath 인스턴스 변수에 저장된 값을 출력
	public void print() {
		System.out.printf("국어 : %d, 영어 : %d, 수학 : %d" + "\n", intKor, intEng, intMath);
		System.out.printf("합계 : %d, 평균 : %3.2f"		    + "\n", intSum, floatAvg);
		// %3.2f = 정수 3자리까지, 소수점 2자리까지 출력 (3자리에서 반올림)
	
	}

}
