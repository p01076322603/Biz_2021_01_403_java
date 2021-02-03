package com.callor.var;

// *가
public class Var_01 {
	
	// *1
	public static void main(String[] args) {
		
		// 위쪽 부분에 선언된 변수는 아래쪽에 선언할 수 없다
		// -> 한번 선언된 변수 이름으로 또다시 선언할 수 없다
		int num1 = 30;
		int num2 = 40;
		int num3 = 50;
		
		// 변수 이름의 첫글자는 영문 소문자
		int korScore = 90;
		int engScore = 100;
		int mathScore = 95;
	
		// 2개 이상의 단어로 조합이 다소 불편할 때
		// 변수명 접두사로 변수의 형(Type)을 붙인다 -> 헝가리언 표기법
		int intNum1 = 20;
		int intNum2 = 30;
		int intNum3 = 40;
		
		float floatNum1 = 20.0F;
		float fNum2 = 30.0F;
		
		double doubleNum1 = 20.0;
		double doNum2 = 30.0;
		
		String strName = "홍길동";
		String strNation = "대한민국";
		String strTel = "010-1111-1111";
		String strAddr = "서울특별시";
		
		// 변수명 단어와 단어사이에 UnderScore(_) -> Snake Case
		// 데이터베이스와 연동하는 프로젝트를 만들 때 주로 사용하는 명명법
		String str_name = "이몽룡";
		String st_name = "성춘향"; // student_name
		String st_num = "202101001"; // student_num
		
		String dept_name = "컴퓨터공학";
		
		
		/*	변수 이름 짓기
		 * 	
		 * 	첫글자는 영문 소문자, 이후 영문 대소문자, _ 사용할 수 있다
		 * 	두개 이상의 단어를 조합하여 사용하는 것을 권장한다
		 * 	두번째 단어부터는 첫글자를 대문자로 작성
		 *  = (lower) Camel Case
		 */
		
		System.out.println( num1 + num2 + num3 );
		System.out.println( num1 + num2        );
		System.out.println(      + num2 + num3 );
		System.out.println( num1 +        num3 );

	}// *2 
		
}// *나

//*1 ~ 2의 구역을 main method()의 local area, local scope 라고 하며 줄여서 local이라 한다.
//*가 ~ 나의 구역을 클래스 Var_01의 private 영역이라고 한다. 또는 Var_01 클래스의 local 영역이라 한다.