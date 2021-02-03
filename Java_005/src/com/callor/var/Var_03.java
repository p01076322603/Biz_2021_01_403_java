package com.callor.var;

public class Var_03 {
	
	public static void main(String[] args) {
		
		int intNum1 = 0;
		
		intNum1 = 30;
		
		System.out.println( intNum1 );
		System.out.println( intNum1 + 40 );
		
		int intNum2 = 0;
		intNum2 = 40;
		
		// intNum1 변수 값을 읽어 오고 intNum2 변수 값을 읽어 와서 두 값을 덧셈 한 후 어딘가에 저장한 뒤에 그 값을 Console에 출력하라
		System.out.println( intNum1 + intNum2 );
		
		int intSum = 0;
		
		// intNum1 변수 값을 읽어 오고 intNum2 변수 값을 읽어 와서 두 값을 덧셈 한후 위에서 선언 하고
		// 초기화 해둔 intSum 변수에 저장 한 뒤에 그 값을 읽어 Console에 출력하라
		intSum = intNum1 + intNum2;
		
		System.out.println( intSum );
	}

}