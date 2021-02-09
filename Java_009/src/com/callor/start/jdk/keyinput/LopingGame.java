package com.callor.start.jdk.keyinput;

import java.util.Random;
import java.util.Scanner;

/* 배경설명
 * 1. Random 클래스를 사용하여 1 ~ 100까지 임의의 수를 생성하여 rndNum 변수에 담아놓는다
 * 2. Console에 "숫자 입력 >> " 프롬프트를 보여주고
 * 3. 1 ~ 100까지 정수를 입력받는다
 * 4. 입력받은 정수와 rndNum 변수에 저장된 값을 비교하여 큰가, 작은가를 알려준다
 * 5. rndNum에 저장된 값을 맞추는 게임
 * 6. 2 부터 5 까지를 계속 반복하면서 값을 맞춘다
 * 8. 만약 정수값에 -1을 입력하면 게임을 중단한다
 */

public class LopingGame {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int rndNum = (rnd.nextInt(100) + 1); // 난수 1개 생성
		int inputCount = 1;

		System.out.println("(-1 = Quit)");
		System.out.print("\n첫번째 숫자 입력 >> ");

		while (true) {

			int keyNum = scan.nextInt();

			if (keyNum < 0) {
				System.out.println("\n YOU LOSE ");
				rndNum = 0;
				break;
			}

			if (keyNum == rndNum) {
				System.out.println("\n YOU WIN ");
				break;
			} else if (keyNum > rndNum) {
				System.out.println("입력값이 크다!!");
			} else if (keyNum < rndNum) {
				System.out.println("입력값이 작다!!");
			}

			inputCount++;
			System.out.print("\n" + inputCount + "번째 시도 >> ");
		}
		// while end
		System.out.println(" GAME OVER ");
		if (rndNum != 0) {
			System.out.println(" 총 시도 횟수 : " + inputCount);
		} else {
			System.out.println(" 총 시도 횟수 : " + (inputCount - 1));
		}
	}
}
