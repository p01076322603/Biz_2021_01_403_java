package com.callor.applications;

import java.util.Scanner;

public class Class_04 {

	/* 인스턴스 변수 scan1을 생성하고
	 * Scanner(scan1) 클래스의 nextInt() method를 호출하여 키보드 입력을 받은 뒤 
	 * 인스턴스 변수 num2에 저장하는 코드
	 * 
	 * 이 코드는 문법 오류가 나지 않지만 이런 방식으로는 사용해서는 안된다
	 */
	Scanner scan1 = new Scanner(System.in);
	private int num2 = scan1.nextInt();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/* main() method의 지역 변수
		 * 지역 변수를 선언할 경우는 초기화 하지 않고 다른 method의 return값을 저장 할 수 있다
		 */
		int num = scan.nextInt();
	}
}
