package com.callor.oop.exp;

import java.util.Scanner;

public class Exception_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("========================");
		System.out.println("0 이상 정수를 입력하세요");
		System.out.println("------------------------");
		System.out.print(">> ");
		
		while (true) {

			String strNum = scan.nextLine();
			
			int intNum = 0;
			
			try {
				intNum = Integer.valueOf(strNum);
			} catch (NumberFormatException e) {
				System.out.println("반드시 숫자만 입력하세요");
				System.out.print(">> ");
				continue;
			}
			
			if (intNum < 0) {
				System.out.println("0 이상 값을 입력하세요");
			} else {
				System.out.println("입력값 : " + intNum);
				break;
			}
				
		}

	}

}
