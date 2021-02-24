package com.callor.score;

import java.util.Random;

public class Score_01 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };
		String[] strAddr = { "서울시", "익산시", "남원시", "한양시", "함흥시" };
		
		int arrLen = strName.length;
		
		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];
		
		int[] intSum = new int[arrLen];
		
		float[] floatAvg = new float[arrLen];
		
		for (int i = 0; i < arrLen; i++) { // 각 과목의 배열에 1 ~ 100 까지의 난수 대입
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		for (int i = 0; i < arrLen; i++) { // 각 과목의 총점
			intSum[i]  = intKor[i];
			intSum[i] += intEng[i];
			intSum[i] += intMath[i];
		}
		
 		for (int i = 0; i < arrLen; i++) { // 각 과목의 평균
			floatAvg[i] = (float) intSum[i] / 3;
		}

		System.out.println("======================================================");
		System.out.println("  이름\t  주소\t  국어\t  영어\t  수학\t  총점\t  평균");
		System.out.println("------------------------------------------------------");

		for (int i = 0; i < arrLen; i++) {
			System.out.printf("%s\t%s\t%6d\t%6d\t%6d\t%6d\t %3.2f\n",
					strName[i], strAddr[i], intKor[i], intEng[i], 
					intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("======================================================");
	}
}