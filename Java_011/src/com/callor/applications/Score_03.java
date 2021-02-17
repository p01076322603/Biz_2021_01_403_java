package com.callor.applications;

import com.callor.applications.service.ScoreServiceV2;

public class Score_03 {

	public static void main(String[] args) {

		ScoreServiceV2 scServiceV2 = new ScoreServiceV2();
		scServiceV2.print(88, 77, 56);

		// ScoreServiceV2 클래스의 sum() method를 호출하면서 정수 99, 88, 77을 전달한다
		scServiceV2.sum(99, 88, 77);
		
		// sum() method에는 3개의 정수형 매개변수가 선언되어 있다
		// sum() method를 호출할 때 3개 미만이거나, 3개보다 많은 값을 전달하면 문법 오류가 발생한다
		
		/*
		 * 다만, sum() method가 각각 다음과 같이 정의 되어 있으면 문법 오류가 생기지 않는다.
		 * public void sum() {...}
		 * public void sum(int num1, int num2, int n3, int n4, ...) 변수의 개수는 중요하지않다.  
		 */
		scServiceV2.sum();
		scServiceV2.sum(1, 2, 3, 4);
	}
}
