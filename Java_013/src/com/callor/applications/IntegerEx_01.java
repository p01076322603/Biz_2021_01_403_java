package com.callor.applications;

public class IntegerEx_01 {

	public static void main(String[] args) {
		
		String strNum1 = "30";
		String strNum2 = "40";
		
		String strSum = strNum1 + strNum2;
		System.out.println(strSum);

		/* Integer.valueOf("문자열형 숫자")
		 * 문자열형 숫자를 사칙연산이 가능한 정수로 바꾸어서 return 해주는 method 
		 */
		int intNum1 = Integer.valueOf(strNum1);
		int intNum2 = Integer.valueOf(strNum2);
		int intSum = intNum1 + intNum2;
		System.out.println(intSum);
		
		System.out.println("============");
		
		String str1 = "11";
		String str2 = "22";
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println(str1 + str2);
		
		System.out.println("============");
		
		// 문자열형 숫자(str1)를 정수로 변환하여 return 하고 정수형변수 num1에 저장한다
		int num1 = Integer.valueOf(str1);
		int num2 = Integer.valueOf(str2);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println(num1 + num2);
		
		System.out.println("============");
		
		int num3 = Integer.valueOf("30"); // 정수 30
		num3 = Integer.valueOf("03"); 	  // 정수 3
		num3 = Integer.valueOf("300");    // 정수 300
		
		System.out.println(num3 * 3);
		
		// NumberFormatException
		num3 = Integer.valueOf("3 ");
		num3 = Integer.valueOf("3A");
	}
}
