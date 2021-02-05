package com.callor.start.logic;

/* 논리(Logic) 연산
 * 참(yes, true), 거짓(no, false)을 판단하여 어떤 행위를 수행하는 연산
 */
public class Logic_01 {

	public static void main(String args[]) {
		
		// 3이 3 미만인지 판단 : false
		System.out.println( 3 < 3 );
		
		// 3이 3 초과인지 판단 : false
		System.out.println( 3 > 3 );
		
		// 3이 3과 같은지 판단 : true
		System.out.println( 3 == 3 );

		// 3이 3 이하인지 판단 : true
		System.out.println( 3 <= 3 );
		
		// 3이 3 이상인지 판단 : true
		System.out.println( 3 >= 3 );
	}
}
