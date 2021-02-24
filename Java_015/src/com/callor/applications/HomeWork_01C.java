package com.callor.applications;

import java.util.Random;
import com.callor.applications.service.PrimeServiceV2;

public class HomeWork_01C {
	
	public static void main(String[] args) {
		
		/* Java에서는 변수, 객체를 선언 할 때 사용하기 전에 선언 하면 된다
		 * 하지만 통상적으로 코딩을 할땐 변수, 객체 등의 선언은 코드의 시작부분에
		 * (클래스 선언 명령문 아래, method 선언문 아래) 작성을 한다. */
		PrimeServiceV2 psV2 = new PrimeServiceV2();
		Random rnd = new Random();

		int intPrimeSum = 0;
		int intPrimeCount = 0;
		
	//  int[] rndNums = new int[100];
		int rndNums[] = new int[100];

		/* 생성된 rndNums 배열에 임의의 정수 100개를 저장해 두었다 배열을 만들어두면
		 * 이후의 코드에서 한번 생성된 임의의 정수 100개를 자유롭게 활용할 수 있다 */
		for (int i = 0; i < rndNums.length; i++) {
			rndNums[i] = rnd.nextInt(10000) + 2;
		}

		/* 다음처럼 prime() method에 배열을 통째로 전달하여 코드를 수행할 수 없는 이유
		 * psV2.prime(rndNums); -> 매개변수가 int intNum으로 선언되어 있다
		 * 즉 이 method는 전달받을수 있는 값이 정수 1개이다 하지만 배열을 한꺼번에
		 * 전달하려고 시도하기 때문에 사용할 수 없다. 그렇다면 psV2.prime() method
		 * 를 사용하기 위해서는 rndNums의 요소들을 한개씩 전달해야 한다.
		 * 결론 : for 반복문을 사용해아 한다 */
		
		// rndNums 배열에 담겨있는 정수들을 psV2.prime() method에게 보내 소수인지 검사
		for (int i = 0; i < rndNums.length; i++) {
			
		}
	}
}