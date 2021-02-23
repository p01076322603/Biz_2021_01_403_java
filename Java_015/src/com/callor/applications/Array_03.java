package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_03 {

	Random rnd = new Random();

	// (int array, int a) int형 배열과 int형 정수 하나를 넣으면
	// int형 배열에 1 ~ a 범위의 랜덤한 정수로 값을 채운다
	public int[] arrayRandom(int intNums[], int rndNum) {
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(rndNum) + 1;
		}	
		return intNums;
	}
	
	public static void main(String[] args) {

		Array_03 arr = new Array_03();
//		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);

		int[] intNums = new int[100]; // 100 크기의 배열 intNums
		int keyNum = 0; // 입력받은 값을 저장할 변수 keyNum

		// 1 ~ 10의 숫자를 배열 intNums에 무작위로 저장한다
//		for (int i = 0; i < intNums.length; i++) {
//			intNums[i] = rnd.nextInt(10) + 1;
//		}
		
		// (int array, int a) int형 배열과 int형 정수 하나를 넣으면
		// int형 배열에 1 ~ a 범위의 랜덤한 정수로 값을 채운다
		arr.arrayRandom(intNums, 10);
		
		// 입력받은 값이 1 ~ 10 인지 판별하고 맞다면 keyNum 변수에 저장한다
		System.out.print("1 ~ 10 사이의 정수를 입력하세요 >> ");
		while (true) {
			keyNum = scan.nextInt();
			if (keyNum > 0 && keyNum <= 10) break;
			else System.out.print("1 ~ 10 사이의 정수를 입력하세요 >> ");
		}

		// keyNum 값을 최초로 가지는 배열의 위치 번호 출력
		System.out.print("정수 " + keyNum + " 값을 최초로 가지는 배열의 위치 번호 : ");
		for (int i = 0; i < intNums.length; i++) {
			if (intNums[i] == keyNum) {
				System.out.print(i);
				break;
			}
		}
	}
}