package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1;

public class Score_02 {

	public static void main(String[] args) {

		ScoreServiceV1 ssV1 = new ScoreServiceV1();
		Random rnd = new Random();
		
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };

		int arrLen = strName.length;

		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];

		int[] intSum = new int[arrLen];
		float[] floatAvg = new float[arrLen];
		
		for (int i = 0; i < arrLen; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		for (int i = 0; i < arrLen; i++) { // 총점
			intSum[i] = ssV1.scoreSum(intKor[i], intEng[i], intMath[i]);
		}
		
		for (int i = 0; i < arrLen; i++) { // 평균
			floatAvg[i] = ssV1.scoreAvg(intKor[i], intEng[i], intMath[i]);
		}
		
		System.out.println("================================================");
		System.out.println("   이름\t   국어\t   영어\t   수학\t   총점\t   평균");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < arrLen; i++) { // 출력
			ssV1.scorePrint(strName[i], intKor[i], intEng[i], 
							intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("================================================");
	}
}