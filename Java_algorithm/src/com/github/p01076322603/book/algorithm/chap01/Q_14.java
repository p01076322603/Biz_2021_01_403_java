package com.github.p01076322603.book.algorithm.chap01;

import java.util.Scanner;

public class Q_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("사각형을 출력합니다.");
		System.out.print("단 수 : ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}
