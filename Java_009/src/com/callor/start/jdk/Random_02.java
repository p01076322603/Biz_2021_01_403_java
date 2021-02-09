package com.callor.start.jdk;

import java.util.Random;

public class Random_02 {

	public static void main(String args[]) {
		
		// Random 클래스를 사용하여 rnd 객체를 선언하고 초기화
		// rnd 객체가 인스턴스로 변환 : 사용할 준비
		// rnd 인스턴스 라고 부른다
		Random rnd; 		// rnd : 객체
		rnd = new Random(); // rnd : 인스턴스
		
		int num1 = 0;
		
		// rnd 인스턴스에게 nextInt() 명을 수행하도록 하고 명령이 수행된 뒤 결과를 num1 변수에 담아라
		// nextInt()는 난수를 만드는 일을 수행하고 수행한 결과를 = 왼쪽의 변수에 담는다
		num1 = rnd.nextInt();

		System.out.println(num1);
		System.out.println(rnd.nextInt());
	}
}
