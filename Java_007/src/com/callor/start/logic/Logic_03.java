package com.callor.start.logic;

/* 논리연산
 * 코드가 실행되는 과정에서 중간에 연산 등을 통해 생성된 값(변수에 저장된)에 따라
 * 코드의 흐름을 다르게, 전환하는 코드의 흐름 변경이다
 */
public class Logic_03 {
	
	public static void main(String args[]) {
		
		/* boolean
		 * true, false 의 값을 가지는 데이터형이다
		 * boolean type 이라 한다.
		 */ 
		int num1 = 3;
		
		// boolean 값에 따라 코드의 흐름을 제어(변경)하는 명령문 if()
		// num1 변수의 값이 10보다 크면 {   }의 코드를 실행하고 그렇지 않으면 무시하라
		if(num1 > 10) {
			System.out.println(num1 + " 은 10보다 크다");
		}
		
		if( (num1 * 5) > 10 ) {
			System.out.println( (num1 * 5) + " 는 10보다 크다" );
		}
	}
}
