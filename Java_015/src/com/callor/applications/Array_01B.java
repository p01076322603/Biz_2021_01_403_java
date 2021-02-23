package com.callor.applications;

import java.util.Random;

public class Array_01B {

	public static void main(String[] args) {
		
		// Random 클래스를 사용하여 rnd 객체를 선언하고
		// new Random() 명령을 사용하여 rnd 객체를 인스턴스화
		Random rnd = new Random(); // 이 시점의 rnd = Random 클래스의 인스턴스
	
		// rnd 인스턴스의 nextInt() method를 호출(실행)하라
		// 매개변수 값으로 100을 전달하라

		/* Random 클래스의 nextInt() method에 정수 100을 전달하고 실행하여
		 * return 하는 결과를 num 변수에 저장하라
		 * num 변수에는 0 ~ 99중 한개의 숫자가 저장 될것이다 */		
		int num = rnd.nextInt(100);
		
		// num 변수에는 1 ~ 100중 한개의 숫자가 저장 될것이다
		num = rnd.nextInt(100) + 1;
		
		// 정수 100개를 저장할 배열 변수를 선언하고 생성, 초기화 하라
		// 초기화 : 사용할 준비
		int[] intNums = new int[100];
		
		// 0 ~ intNums.length - 1 횟수만큼 반복문을 실행하라
		for (int i = 0; i < intNums.length; i++) {
			/* intNums의 i 번째 위치에 정수 100을 저장하라
			 * i 값은 0 ~ (intNums.length - 1) 까지 값을 가지게 되므로
			 * 전체 배열 100개에 정수 100을 저장하라 */
			intNums[i] = 100;
		}
		
		// 0 ~ intNums.length 까지의 정수를 만들어 intNums의 위치값으로 정하고
		// 1 ~ 10 까지의 임의 숫자를 생성하여 intNums의 배열에 채워 넣어라
		for (int i = 0; i < intNums.length; i++) {
			/* Random 클래스의 nextInt() method를 호출하면서 정수 10을 전달하고
			 * return된 결과에 1을 더하라 : 1 ~ 10까지 중 임의의 숫자 1개를 만들어라
			 * 임의로 생성된 숫자를 intNums의 i 번째 위치에 저장하라 */
			intNums[i] = rnd.nextInt(10) + 1;
		}
	}
}
