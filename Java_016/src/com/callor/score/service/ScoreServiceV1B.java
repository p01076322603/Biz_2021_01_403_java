package com.callor.score.service;

public class ScoreServiceV1B {

	String strName;
	int intKor;
	int intEng;
	int intMath;
	
	int intSum;
	float floatAvg;
	
	public void scoreInit(String name, int kor, int eng, int math) {
		strName = name;
		intKor = kor;
		intEng = eng;
		intMath = math;
	}
	
	public void scoreSum() {
		intSum = intKor + intEng + intMath;
	}
	
	public void scoreAvg() {
		floatAvg = (float) intSum / 3;
	}
	
	public void scorePrint() {
		System.out.printf("%4s\t%7d\t%7d\t%7d\t%7d\t  %3.2f\n",
				strName, intKor, intEng, intMath, intSum, floatAvg);
	}
}