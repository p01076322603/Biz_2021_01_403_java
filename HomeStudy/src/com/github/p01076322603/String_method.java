package com.github.p01076322603;

/*
 * equals
 * indexOf
 * replaceAll
 * substring
 * toUpperCase
 * toLowerCase
 */

public class String_method {

	public static void main(String[] args) {
		
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		
		String e = "Hello Java Hello World!";
		
		// equals
		System.out.println(a.equals(c)); // true
		System.out.println(a.equals(d)); // true
		
		// 문자열 a와 d는 모두 "Hello"로 같은 값이지만 == 연산자를 이용했을 때는 false를 리턴한다
		// a와 d는 같은 값이지만 서로 다른 객체다 -> = 는 두개의 자료형이 동일한 객체인지를 판별
		System.out.println(a == d); // false
		
		/* a : literal String이라고 불리우는데 "happy java" 라는 문자열을 
		 * intern pool 이라는 곳에 저장하고 다음에 다시 동일한 문자열이 선언될때는
		 * cache 된 문자열을 리턴한다.
		 * 
		 * d : 항상 새로운 String 객체를 만든다.
		 */
		
		// indexOf
		// String e = "Hello Java Hello World!";
		
		// 0부터 시작하므로 7번째 자리에 있다는 의미의 6이 출력된다
		System.out.println(e.indexOf("J")); 
		System.out.println(e.indexOf("Java"));
		
		// 최초 공백의 위치 5가 출력된다 (6번째 자리)
		System.out.println(e.indexOf(" "));
		
		// 단일 문자에는 ' 를 쓸수있고 처음으로 나오는 o의 위치인 4가 출력된다 (5번째 자리)
		System.out.println(e.indexOf('o'));
		// "or"이 처음으로 나오는 'o'의 위치 18이 출력된다 (19번째 자리)
		System.out.println(e.indexOf("or"));
		
		// replaceAll
		// String e = "Hello Java Hello World!";

		// 특정 문자열을 찾아 다른 문자열로 교체한다
		System.out.println(e.replaceAll("orl", "oun"));
		// 중복될 경우 전부 교체한다
		System.out.println(e.replaceAll("Hello", "Hi!"));
		
		
		// substring
		// String e = "Hello Java Hello World!";
		
		/* 문자열 중 특정 부분을 뽑아낼 경우 사용한다
		 * 0부터 시작해 첫번째 자리부터 5번째 자리까지 범위가 설정이 되었지만
		 * 마지막 위치는 포함이 되지 않는다
		 * 시작위치 <= a < 끝위치
		 */
		System.out.println(e.substring(0, 4)); // Hell
		System.out.println(e.substring(11, 16)); // Hello 11 ~ 15 위치 출력
		
		//toUpperCase
		// String e = "Hello Java Hello World!";
		
		// 문자열을 모두 대문자로 변경한다
		System.out.println(e.toUpperCase()); // HELLO JAVA HELLO WORLD!
		// 문자열을 모두 소문자로 변경한다
		System.out.println(e.toLowerCase()); // hello java hello world!
		
	}
}
