package com.callor.applications;

import java.util.Scanner;

public class App_03 {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

	    while (true) {

			System.out.print("\n숫자 입력 (2 ~ 9) >> ");
			int dan = scan.nextInt();

			boolean bYes1 = (dan >= 2);
			boolean bYes2 = (dan <= 9);
			
			if (bYes1 && bYes2) {

				System.out.println("\n==========");
				System.out.println("구구단 " + dan + "단"); 
	   			System.out.println("----------");

				for (int i = 0; i < 8; i++) {

					int multiple = (i + 2);
					System.out.println(dan + " x " + multiple + " = " + (dan * multiple));
				}

				System.out.println("==========");

			} else {
				System.out.println("유효한 범위의 숫자가 아닙니다");
			}	
	    }
	}
}
