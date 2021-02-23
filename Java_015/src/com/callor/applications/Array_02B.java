package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_02B {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] intNums = new int[100];

		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}

		Scanner scan = new Scanner(System.in);
		System.out.println("1 ~ 10 까지 정수 입력");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();
		
		System.out.printf("값 %d가 저장된 위치!!!\n", keyNum);
		for (int position = 0; position < intNums.length; position++) {
			if (intNums[position] == keyNum) {
				System.out.print(position + ", ");
			}
		}
	}
}
