package com.callor.applications;

import java.util.Scanner;

public class App_02 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

	//  while (true) {

			System.out.print("숫자 입력 (2 ~ 9) >> ");
			int dan = scan.nextInt();

			if (dan > 1 && dan < 10) {

				System.out.println("==========");
				System.out.println("구구단 " + dan + "단"); 
	   			System.out.println("----------");

				for (int i = 0; i < 8; i++) {

					int multiple = (i + 2);
					System.out.println(dan + " x " + multiple + " = " + (dan * multiple));
				}

				System.out.println("==========");
	//  		break;

			} else {
				System.out.println("입력될 숫자는 2 ~ 9 범위여야 합니다\n");
			}
	//  }
	}
}
