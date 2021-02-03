package com.callor.var;

public class VarInteger_01 {

	public static void main(String args[]) {
		
		// 정수형 변수 intNum1을 선언하고 정수형 값 30을 저장하라
		int intNum1 = 30;
		Integer intNum2 = 40;
		// int intNum2 = 50; // 키워드와 관계없이 변수 이름은 중복 선언 불가
		
		// 1. 읽기 : 변수에 저장된 값은 아무리 많이 읽어도 저장된 값이 변하지 않는다.
		System.out.println( intNum1 );
		System.out.println( intNum2 );
		
		// 2. 변수에 값 저장하기 : 변수명 = 값 형태로 작성
		intNum1 = 20;
		System.out.println( intNum1 );

		intNum1 = 50;
		intNum2 = 20;
		
		// 
		System.out.println( intNum1 );
		System.out.println( intNum2 );
	}
	
}
