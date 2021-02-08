package com.callor.start.bool;

public class BoolAlge_02 {

	public static void main(String args[]) {
		
		boolean bYes1 = (3 >  3); 		  // false
		boolean bYes2 = (3 == 3); 		  // true
		
		boolean bYes3 = (bYes1 && bYes2); // false (false && true)
		boolean bYes4 = (bYes1 || bYes2); // true  (false || true)
	
		int num1 = 100;
		int num2 = 200;
		
		// (num1 > 50)의 결과가 true이므로 java는 효율적인 코드 실행을 위해
		// || 이후의 코드를 무시한다.
		boolean bYes5 = (num1 > 50) || (num2 += 20) > 300; // true  (true || false)
		
	//	if(num1 > 50) {
	//		num2 += 20;
	//	}
		
		System.out.println("num2 : " + num2);
		
		// (num1 < 50)의 결과가 false 이므로 && 이후의 코드를 무시한다.
				bYes5 = (num1 < 50) && (num2 += 20) < 300; // false (false && true)
				
	//	if(num1 < 50) {
	//		num2 += 20;
	//	}
	
		System.out.println("num2 : " + num2);
	}
}
