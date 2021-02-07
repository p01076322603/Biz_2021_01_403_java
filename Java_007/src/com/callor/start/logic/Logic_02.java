package com.callor.start.logic;

public class Logic_02 {

	public static void main(String args[]) {
		
		// 논리 연산 결과를 담는 변수
		// boolean, Boolean
		boolean bYes = 3 == 3;
				
		System.out.println(bYes); // true
		
				bYes = 3 >  3;
				
		System.out.println(bYes); // false

				bYes = 3 >= 3;
		
		System.out.println(bYes); // true
				
				int num1 = 55;
				int num2 = 65;
				
				bYes = num1 >= num2 ;
				
		System.out.println(bYes); // false
			//		      (1) (2)      // 연산 순서
				bYes = num1*2 >= num2;
				bYes = (num1 * 2) >= num2;

		System.out.println(bYes); // true
	}
}
