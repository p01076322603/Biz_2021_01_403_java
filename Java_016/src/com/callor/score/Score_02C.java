package com.callor.score;

import java.util.Random;

import com.callor.score.service.ScoreServiceV1C;

public class Score_02C {

	public static void main(String[] args) {

		ScoreServiceV1C ssV1C = new ScoreServiceV1C();
		Random rnd = new Random();
		String[] strName = { "홍길동", "성춘향", "이몽룡", "장록수", "임꺽정" };
		
		int[] intKor = new int[strName.length];
		int[] intEng = new int[strName.length];
		int[] intMath = new int[strName.length];
		
		int[] intSum = new int[strName.length];
		float[] floatAvg = new float[strName.length];

		for (int i = 0; i < strName.length; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}
		
		// 총점 계산
		// SSV2.scoreSum() method를 호출하여 총점 계산
		for (int i = 0; i < strName.length; i++) {
			
			// ssV1C.scoreSum() 호출하여 총점 계산
			// 총점을 계산하려면 3과목의 점수를 전달하고 총점 결과를 다시 return 받아서 ... 해야 한다

			// i 번째 학생의 3과목 점수를 scoreSum()에 전달하고 결과를 다시 i번째 학생의 총점에 저장
			// intSum[i] : i 번째 학생의 총점 
			int sum = ssV1C.scoreSum(intKor[i], intEng[i], intMath[i]);
			intSum[i] = sum;
		}
		
		for (int i = 0; i < strName.length; i++) {
			float avg = ssV1C.scoreAvg(intSum[i]);
			floatAvg[i] = avg;
		}
		
		System.out.println("================================================");
		System.out.println("   이름\t   국어\t   영어\t   수학\t   총점\t   평균");
		System.out.println("------------------------------------------------");
		
		for (int i = 0; i < strName.length; i++) {
			ssV1C.scorePrint(strName[i], intKor[i], intEng[i], 
							 intMath[i], intSum[i], floatAvg[i]);
		}
		
		System.out.println("================================================");

		System.out.println("\n\n");
		
		// 이름, 국어, 영어, 수학, 총점, 평균 배열을 통째로 매개변수로 전달하고
		// ssV1.print() method에서 리스트를 출력한다
		ssV1C.scorePrint(strName, intKor, intEng, intMath, intSum, floatAvg);
	}
}