package com.callor.score;

import java.util.Random;
import com.callor.score.service.ScoreServiceV1B;

public class Score_02B {

	public static void main(String[] args) {

		ScoreServiceV1B ssV1B = new ScoreServiceV1B();
		Random rnd = new Random();

		String[] strName = new String[] { "홍길동", "이몽룡", "성춘향", "장녹수", "임꺽정" };

		int arrLen = strName.length;

		int[] intKor = new int[arrLen];
		int[] intEng = new int[arrLen];
		int[] intMath = new int[arrLen];

		for (int i = 0; i < arrLen; i++) {
			intKor[i] = rnd.nextInt(100) + 1;
			intEng[i] = rnd.nextInt(100) + 1;
			intMath[i] = rnd.nextInt(100) + 1;
		}

		System.out.println("================================================");
		System.out.println("   이름\t   국어\t   영어\t   수학\t   총점\t   평균");
		System.out.println("------------------------------------------------");

		for (int i = 0; i < arrLen; i++) { // 값을 넣고 총점, 평균을 구한 후 프린트를 하는 반복문
			ssV1B.scoreInit(strName[i], intKor[i], intEng[i], intMath[i]);
			ssV1B.scoreSum();
			ssV1B.scoreAvg();
			ssV1B.scorePrint();
		}

		System.out.println("================================================");
	}
}
