package com.callor.applications;

import java.util.Scanner;

import com.callor.applications.service.ClassServiceV7;

public class Class_09 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ClassServiceV7 csV7 = new ClassServiceV7();

		int dan = 0;

		System.out.println("(-1 : 종료)\n");
		
		while (true) {

			System.out.print("구구단 단수 입력 >> ");
			dan = scan.nextInt();

			if (dan > 1 && dan < 10) {
				csV7.guGu(dan);
			
			} else if (dan < 0) {
				System.out.println("종료합니다");
				return;
			
			} else {
				System.out.println("2 ~ 9 사이의 수를 입력하세요\n(-1 : 종료)\n");
			}
		}
	}
}
