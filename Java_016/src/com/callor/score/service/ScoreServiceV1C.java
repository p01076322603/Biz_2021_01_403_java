package com.callor.score.service;

public class ScoreServiceV1C {

	// 3 과목의 점수를 전달받아 합산을 하고 결과를 return
	public int scoreSum(int intKor, int intEng, int intMath) {
		int sum = intKor;
		sum += intEng;
		sum += intMath;
		return sum;
	}

	// 총점 점수를 전달받고 과목수로(3개) 나누어 return
	public float scoreAvg(int intSum) {
		return (float) intSum / 3;
	}

	// 한 학생의 성적 데이터를 한줄에 출력
	public void scorePrint(String strName, int intKor, int intEng, int intMath, int intSum, float floatAvg) {
		System.out.printf("%4s\t%7d\t%7d\t%7d\t%7d\t  %3.2f\n", strName, intKor, intEng, intMath, intSum, floatAvg);
	}

	public void scorePrint(String[] strName, int[] intKor, int[] intEng, int[] intMath, int[] intSum, float[] floatAvg) {
		
		System.out.println("================================================");
		System.out.println("   이름\t   국어\t   영어\t   수학\t   총점\t   평균");
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < strName.length; i++) {
			System.out.printf("%4s\t%7d\t%7d\t%7d\t%7d\t  %3.2f\n",
					strName[i], intKor[i], intEng[i], intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("================================================");
	}
}