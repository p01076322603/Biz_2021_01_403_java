package com.callor.applications;

public class WrapperEx_01 {

	public static void main(String[] args) {
		
		/* Wrapper class
		 * 변수를 선언하는 기본 키워드
		 * int, long, float, double, boolean, char : 초기에 java를 만들때 값을 저장하는 최소한의 기능만을 구현
		 * 이후에 필요에 의해 기능들을 추가해야 하나 기본 키워드의 기능을 변경하기에는 어려움이 있었다
		 * Java에서는 기본 키워드 기능을 확장하는 클래스들을 만들어 JDK에 포함시켰다
		 */
		int 	intNum1 = 0;
		Integer intNum2 = 0;
		
		float floatNum1 = 30.2f;
		Float floatNum2 = 30.2F;
		
		long longNum1 = 300l;
		Long longNum2 = 300L;
		
		double doNum1 = 300.0;
		Double doNum2 = 300.0;
			   doNum2 = doNum1;
		
		String str1 = "대한민국";
		String str2 = new String("우리나라");
	}
}
