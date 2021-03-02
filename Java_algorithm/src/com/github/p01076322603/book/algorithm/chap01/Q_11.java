package com.github.p01076322603.book.algorithm.chap01;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int intNum = scan.nextInt();
		int digit = 0;
		
		while (intNum != 0) {
			intNum /= 10;
			digit++;
		}
		System.out.println("그 수는 " + digit + "자리입니다.");
		scan.close();
	}
}
