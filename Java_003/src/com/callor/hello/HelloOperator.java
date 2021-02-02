package com.callor.hello;

/* 클래스 이름 짓기 : 명명 규칙 
 * 
 * 1. 명명 규칙
 * 	첫글자는 영문대문자, 이후에는 영문대소문자와 숫자, UnderScore(_)
 * 2. 명명 패턴
 * 	Camel case로 이름 짓기
 * 	가급적 2단어 이상으로 조합하여 작성
 * 	각 단어의 첫자리는 대문자로 작성
 * 	숫자, Underscore는 가급적 사용을 자제
 *  클래스 이름만 보고 하는 일을 유추할 수 있도록 작성
 */
public class HelloOperator {

	public static void main(String[] args) {
		System.out.println(30 + 40);
		System.out.println(30 * 40);
		System.out.println(40 - 30);
		System.out.println(40 / 30);
		System.out.println(40 % 30);

	}
}
