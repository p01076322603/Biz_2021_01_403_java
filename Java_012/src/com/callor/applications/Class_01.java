package com.callor.applications;

import com.callor.applications.service.ClassServiceV1;

public class Class_01 {

	public static void main(String[] args) {

		/*
		 * (프로젝트에) 선언되어 있는 ClassServiceV1의 
		 * method를 사용하여 코드를 실행하려고 하니 준비하라
		 * 
		 * csV1 : "객체(Object)" 라고 한다.
		 * = new Class..() : 객체를 사용할 수 있도록 초기화 하기
		 * 
		 * csV1 = new Class..() : 
		 * 객체를 초기화 하고 사용할 준비를 한 상태
		 * 이 명령이 수행된 후에는 csV1을 인스턴스(instance)라 한다 
		 */
		
		ClassServiceV1 csV1 = new ClassServiceV1();

		/* 변수 선언문, 생성(초기화)
		 * 1. 정수형 변수 iNum1을 선언하고 정수 30을 할당하라 
		 * 2. 앞으로 iNum1이라는 변수를 사용하여 정수값을 저장하고
		 * 	  여러가지 기능을 수행하기 위해 변수를 준비하라
		 */
		
		int iNum1 = 30;
		int iNum2 = 40;
		float fNum = 30.333f;
		double dNum = 40.444;

		System.out.print(  "iNum1 = " + iNum1 + "\t");
		System.out.print(  "iNum2 = " + iNum2 + "\n");
		System.out.print(  "fNum  = " + fNum  + "\t");
		System.out.println("dNum  = " + dNum);

		System.out.println("\niNum1 + iNum2 : ");
		csV1.add(iNum1, iNum2);

		System.out.println("\niNum1 + fNum : ");
		csV1.add(iNum1, fNum);

		System.out.println("\nfNum +x-÷ dNum : ");
		csV1.add(fNum, dNum);
	}
}
