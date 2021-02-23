package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100]; // 100 크기의 배열 intNums
		int keyNum = 0; // 입력받은 값을 저장할 변수 keyNum

		// 1 ~ 10의 숫자를 배열 intNums에 무작위로 저장한다
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		// 입력받은 값이 1 ~ 10 인지 판별하고 맞다면 keyNum 변수에 저장한다
		System.out.print("1 ~ 10 사이의 정수를 입력하세요 >> ");
		while (true) {
			keyNum = scan.nextInt();
			if (keyNum > 0 && keyNum <= 10) break;
			else System.out.print("1 ~ 10 사이의 정수를 입력하세요 >> ");
		}
		
		// keyNum 값을 가지는 배열의 위치 리스트 출력
		System.out.println("정수 " + keyNum + " 값을 가지는 배열의 위치 : ");
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] == keyNum) System.out.print(i + " ");
		}
		
		System.out.println("\n======================================\n");
		
		// intNums 배열의 값이 number의 값과 같을 경우 해당 값 앞부분 특수문자 출력
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] == keyNum) System.out.print(" ★ " + intNums[i] + "\t");
			else System.out.printf("%4d" + "\t", intNums[i]);
			if (i % 5 == 4) System.out.println();
		}
	}
}