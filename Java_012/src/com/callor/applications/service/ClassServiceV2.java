package com.callor.applications.service;

import java.util.Random;
import java.util.Scanner;

public class ClassServiceV2 {

	/* 클래스 차원에서 선언된 변수 : 인스턴스 변수
 	 * ClassServiceV2 클래스를 사용하여 (어디선가) 객체를 선언하고 
	 * 인스턴스화 되었을 때 자동으로 생성되는 변수
	 * 
	 * 현재 클래스의 모든 method에서 공용으로 읽고 쓰기가 가능한 변수
	 */
	
	private Random rnd = new Random();
	private int sum = 0;

	private Scanner scan = new Scanner(System.in);
	
	public void for_1() {
		// sum1, num 변수 : (method / local) 메서드 / 지역 변수

		// sum1 변수 : method 변수 / for_1() method가 끝나면 소멸
		int sum1 = 0;
		for (int i = 0; i < 10; i++) {
			// i 변수 : 이하와 동일
			// num 변수 : local 변수 / for 반복문이 끝나면 소멸
			int num = i + 1;
			sum1 += num;
		}
		System.out.println(sum1);
	}

	public void sum() {
		System.out.println("sum method 에서의 sum = " + sum);
	}

	// 덧셈
	public void add() {

		int num1 = rnd.nextInt(100);
		int num2 = rnd.nextInt(100);

		sum = num1 + num2;

		System.out.print(num1);
		System.out.print(" + ");
		System.out.print(num2);
		System.out.print(" = ");
		System.out.println(sum);
	}

	// 곱셈
	public void times() {

		/* num1과 num2는 add() method에도 선언되어 있지만 서로 method가 다르므로
		 * 이름만 같을 뿐 전혀 다른 변수가 된다
		 */
		int num1 = rnd.nextInt(100) + 1;
		int num2 = rnd.nextInt(100) + 1;
		
		int result = num1 * num2;
		
		System.out.print  (num1);
		System.out.print  (" x ");
		System.out.print  (num2);
		System.out.print  (" = ");
		System.out.println(result);
	}
	
	public void input() {
		/* Scanner를 지역 변수로 선언하였을 경우
		 * input() method가 호출 될때마다 키보드 입력을 받기 위해 Scanner 클래스를 객체로 만들고
		 * 사용이 끝나면 연결을 해제하는 과정이 계속 반복된다
		 */
		Scanner scan1 = new Scanner(System.in);
		int num1 = scan.nextInt();
	}
	
	// 나눗셈
	public void division() {
		
		/* Scanner를 인스턴스 변수로 선언하였을 경우
		 * 현재 클래스(ClassServiceV2)가 객체로 선언되고 인스턴스로 만들어 질 때 한번만 연결된다
		 * 필요에 따라 키보드 입력을 기다리는 nextInt() method를 자유롭게 사용 가능하다
		 * 
		 * Scanner를 지역 변수로 선언하였을 경우보다 비용적(Cost)측면에서 (Input() method보다) 효율적이다
		 */
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.print  (num1);
		System.out.print  (" ÷ ");
		System.out.print  (num2);
		System.out.print  (" = ");
		System.out.println(num1 / num2);
	}

	// 뺄셈
	public void substraction() {

	}
}
