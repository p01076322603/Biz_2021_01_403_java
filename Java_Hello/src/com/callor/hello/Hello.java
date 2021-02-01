package com.callor.hello;

 /* 주석문(Comment) 
 * 여기에 작성되는 내용은 주석문(Comment) 이라고 한다
 * Java 코드와 관계 없이 설명하는 문장, 참고하는 문장 등을 작성할 수 있는 곳
 * 
 * 1. Java의 코드 파일을 생성하고 (Hello.java)
 * 2. Javac를 사용하여 컴파일을 수행 하여 Hello.class를 만드는 과정에서
 * 	  javac가 아무런 의미없는 문장으로 인식하고 그냥 지나치는 부분
 */

// 한줄 Comment를 쓸때는 //를 써도 된다 // 한줄 Comment는 // 로 작성해도 된다.

public class Hello {

	/* Java class 
	 * Java class - Java 언어 문법에 맞도록 작성된 문서 파일 - public class 키워드로 시작하고 임의로 이름을 작성하여
	 * 만든다 - Hello.java 라는 파일에 코드가 저장된다 - 클래스 이름과 파일 이름은 항상 같아야 한다 - 클래스가 HelloKorea
	 * -> 파일이름도 HelloKorea.java로 작성해야 한다 - 영문 대소문자, 숫자, _(Under bar, Under score)만
	 * 사용 가능 - 두개 이상의 단어를 조합 할때는 Camel Case로 한다 ex)HelloWorld
	 */
	/* main() method 
	 * 메인 method public static void main(String[] args) {} -> main() method 라고 한다.
	 * 클래스를 만들고 컴파일을 수행, 실행했을 때 반드시 있어야 하는 명령문
	 */
	/* Console 출력문 
  	 * ""(문자열 인용문, Double quotation mark)
	 * 		- "" 표시 안의 내용을 그대로 Console에 출력한다
	 * 		- "" 로 묶인 내용은 문자열(String)이라 한다
	 * 숫자(정수, 실수 등등)는 숫자 그대로 수학적으로 해석한다
	 */ 
	/* 숫자, 문자열 계산식 
	 * 	1. 숫자 연산식
	 * 		수학의 사칙연산을 수행하여 결과를 출력
	 * 	2. 문자열 연산식
	 * 		"" 로 묶인 문자열을 + 연산하면 문자열을 서로 연결하여 출력
	 * 		문자열 연산식은 + 연산만 가능
	 * 	3. 문자열 + 숫자 연산식
	 * 		모든 숫자를 자동으로 문자열화 시킨다
	 * 		문자열 연산식으로 바꿔 연산하여 결과를 출력
	 */

	public static void main(String[] args) {
		System.out.println("30 + 40 = " + (30 + 40));
		System.out.println("30 * 40 = " + 30 * 40);
		System.out.println("40 - 30 = " + (40 - 30));
		System.out.println("40 / 20 = " + 40 / 20);
		System.out.println("반갑습니다");

	}

}