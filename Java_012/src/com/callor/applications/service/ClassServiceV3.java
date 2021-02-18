package com.callor.applications.service;

import java.util.Scanner;

public class ClassServiceV3 {

	// Java에서는 인스턴스 변수를 private으로 제한한다
	private int intNum1 = 0;
	private int intNum2 = 0;
	
	private Scanner scan = new Scanner(System.in);
	
	
	/* scope()에서는 한개의 숫자를 키보드에서 입력받아 변수 intNum1에 저장한다
	 * 여기에서 선언된 intNum1은 class 영역에 생성된 인스턴스 변수와는 이름은 같지만 다른 변수가 된다
	 * 따라서 scope() method가 종료된 이후에는 변수값에 접근할 수 없다
	 * scope() method에서 선언된 intNum1 변수를 지역(local)변수, 메소드(method)변수 라고 한다
	 */ 
	public void scope() {
		System.out.println("정수를 입력하세요 >> ");
		int intNum1 = scan.nextInt();
		
		// method 선언명령문에 void 키워드가 있으면
		// 이 위치에 return; 명령문이 있는것과 같다
		return;
	}
	
	public void input() {
		System.out.print("첫번째 정수를 입력하세요 >> ");
		intNum1 = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요 >> ");
		intNum2 = scan.nextInt();
		System.out.println();
	}
	
	public void algebra() {
		System.out.println(intNum1 + " + " + intNum2 + " = " + (intNum1 + intNum2));
		System.out.println(intNum1 + " x " + intNum2 + " = " + (intNum1 * intNum2));
		System.out.println(intNum1 + " - " + intNum2 + " = " + (intNum1 - intNum2));
		System.out.println(intNum1 + " ÷ " + intNum2 + " = " + (intNum1 / intNum2));

		System.out.println();
		
		/* print formatting 명령문
		 * "" 안의 문자열을 작성하여 출력문을 만드는 명령문
		 * %d(decimal) 위치에 정수값을 대신 부착하여 출력문 생성
		 */
		System.out.printf("%d + %d = %d" + "\n", intNum2, intNum1, (intNum2 + intNum1));
		System.out.printf("%d x %d = %d" + "\n", intNum2, intNum1, (intNum2 * intNum1));
		System.out.printf("%d - %d = %d" + "\n", intNum2, intNum1, (intNum2 - intNum1));
		System.out.printf("%d ÷ %d = %d" + "\n", intNum2, intNum1, (intNum2 / intNum1));
	}
}