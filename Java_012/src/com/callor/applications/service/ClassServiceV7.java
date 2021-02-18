package com.callor.applications.service;

public class ClassServiceV7 {

	// 정수 한개를 매개변수 dan에 전달 받아 구구단 출력
	public void guGu(int dan) {

		System.out.println("==========");
		System.out.printf ("구구단 %d단" + "\n", dan);
		System.out.println("----------");
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d x %d = %2d" + "\n", dan, i, (dan * i));
		}
	
		System.out.println("==========");
	}
}
