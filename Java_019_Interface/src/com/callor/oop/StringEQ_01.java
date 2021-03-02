package com.callor.oop;

public class StringEQ_01 {

	public static void main(String[] args) {

		int num1 = 30;
		int num2 = 30;
		int num3 = 30;

		// java 9 이후에서는 사용 금지
		Integer num4 = new Integer(30);
		Integer num5 = 30;
		Integer num6 = 30;

		float num7 = 30.0f;

		// 정수형 변수에 저장된 값이 서로 같은지 비교
		System.out.println(num1 == num2);
		System.out.println(num2 == num3);
		System.out.println(num3 == num4);

		// 정수형 변수에 저장된 값과 실수형 변수에 저장된 값이 같은지 비교
		// num6 정수 30이 실수형으로 변환되어 계산됨 (30.0f)
		System.out.println(num6 == num7); // true

		String str1 = "KOREA";
		String str2 = "KOREA";
		String str3 = "Korea";
		String str4 = "kOREA";
		String str5 = "KOREA "; // 눈에 보이지 않는 빈칸 : White space

		System.out.println("=====");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str4);
		System.out.println(str4 == str5);
		System.out.println(str5 == str1);
		
		System.out.println("=====");
			   // 문자열 변수를 일반(Primitive) 변수처럼 선언하면
		       // == 연산으로 같은지 비교가 가능하다
			   str1 =			 "KOREA" ;
			   
		/* 문자열 변수를 클래스 방식으로 선언하면
		 * == 연산으로 같은지 비교가 불가능하다 */
		String str6 = new String("KOREA");
		String str7 = new String("KOREA");
		
		System.out.println(str1 == str6);
		System.out.println(str6 == str7);
		/* 문자열(변수)은 생성하는 방법에 따라 일반 변수와 다른 현상
		 * 을 보일 때가 있다 저장된 값이 같음에도 불구하고 == 연산을
		 * 사용하여 같은지 비교하면 false 결과가 나기도 한다.
		 * 만약 코드 중간에 어떤 이유로 이러한 현상이 발생한다면
		 * if (문자열 변수 == "문자열")과 같은 코드에서 예측할 수 없
		 * 는 논리적 오류가 발생할 것이다

		 * 이러한 이유때문에 문자열은 절대 == 연산을 수행하지 않는다
		 * 문자열을 비교할때는 문자열.equals("비교값")형식의 method
		 * 를 사용해야 한다. */
		System.out.println("=====");
		boolean bYes = str1.equals(str7);
		System.out.println(bYes);
		
		System.out.println("=====");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals(str5));
		System.out.println(str1.equals(str6));
		System.out.println(str1.equals(str7));
		
		System.out.println("=====");
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equalsIgnoreCase(str4));
	}
}