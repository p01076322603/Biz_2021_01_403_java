package com.callor.applications.service;

public class ScoreServiceV4 {

	// 총점과 평균을 전달받는 2개의 매개변수가 있는 score() method
	public void score(int intSum, float floatAvg) {

		// 총점과 평균을 매개변수로 전달받아서 Console에 총점과 평균 출력
		System.out.println("총점 : " + intSum);
		System.out.println("평균 : " + floatAvg);
	}

	
	
	
	
	public void print(int kor, int eng, int math) {

//		int intSum = kor + eng + math; 	 // 총점
																		 // 연산, 계산부분 처리
		int intSum  = kor;												 
			intSum += eng;
			intSum += math;
		
		float fAvg = (float) intSum / 3; // 평균
																		 // 출력 처리
		System.out.println("=========================================");		 
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		System.out.print(        kor + "\t");
		System.out.print(        eng + "\t");
		System.out.print(       math + "\t");
		System.out.print(     intSum + "\t");
		System.out.println( 	fAvg       );
		System.out.println("=========================================");
	}
}