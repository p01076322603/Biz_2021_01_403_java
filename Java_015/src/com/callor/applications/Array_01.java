package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01 {

	public static void main(String[] args) {
		
		// Random 클래스를 사용하여 rnd 객체를 선언하고
		// new Random() 명령을 사용하여 rnd 객체를 인스턴스화
		Random rnd = new Random();
		// 이 시점의 rnd = Random 클래스의 인스턴스
		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100]; // 랜덤한 숫자 100개를 넣을 배열 intNums
		int number = 0; // 입력받은 값을 저장할 변수 number

		// 1 ~ 10의 숫자를 배열 intNums에 무작위로 넣는다
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		// 입력받은 값이 1 ~ 10 인지 판별
		System.out.print("1 ~ 10 사이의 정수를 입력하세요 >> ");
		while (true) { 
			number = scan.nextInt();
			if (number > 0 && number <= 10) break;
			else System.out.print("1 ~ 10 사이의 정수를 입력하세요 >> ");
		}
		
		int count = 0; // 배열의 값과 number의 값이 일치하는 개수를 넣을 변수

		// 배열의 값이 number의 값과 일치하면 ++count
		for (int i = 0; i < intNums.length; i++) { 
			if (intNums[i] == number)
				++count;
		}

		// 결과 출력
		System.out.println("\n" + "intNums 배열 중 " + number + 
									"의 개수 : " + count);

		System.out.println("\n======================================\n");
		
		// intNums 배열의 값이 number의 값과 같을 경우 해당 값 앞부분 특수문자 출력
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] == number) System.out.print(" ★ " + intNums[i] + "\t");
			else System.out.printf("%4d" + "\t", intNums[i]);
			if (i % 5 == 4) System.out.println();
		}
	}
}