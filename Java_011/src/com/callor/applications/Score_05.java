package com.callor.applications;

import com.callor.applications.service.ScoreServiceV4;

public class Score_05 {

	public static void main(String[] args) {

		ScoreServiceV4 scV4 = new ScoreServiceV4();

		int intSum = 242; 	  	  // 총점
		float floatAvg = 80.666F; // 평균

		scV4.score(intSum, floatAvg);

		System.out.println();

		
		
		
		
		
		
		
		// ScoreServiceV4 scV4 = new ScoreServiceV4();
		
		int intKor = 82;	// 국어
		int intEng = 83;	// 영어
		int intMath = 77;	// 수학

		scV4.print(intKor, intEng, intMath);
	}
}
