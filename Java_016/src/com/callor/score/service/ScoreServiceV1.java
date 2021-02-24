package com.callor.score.service;

public class ScoreServiceV1 {
	
	public int scoreSum(int kor, int eng, int math) { // 총점
	
		int intSum = kor + eng + math;
		return intSum;
	}
	
	public float scoreAvg(int kor, int eng, int math) { // 평균
		
		float floatAvg = (float) (kor + eng + math) / 3;
		return floatAvg;
	}
	
	public void scorePrint(String name, int kor, int eng, int math, int sum, float avg) { // 출력

			System.out.printf("%4s\t%7d\t%7d\t%7d\t%7d\t  %3.2f\n",
					name, kor, eng, math, sum, avg);
	}
}