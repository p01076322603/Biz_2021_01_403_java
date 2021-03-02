package com.github.p01076322603.book.algorithm.chap01;

import java.util.Scanner;

public class Q_16 {

	static void spira(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (i * 2) + 1; j++) {
				System.out.print("*");
			}

			for (int j = 0; j < (n - i); j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		spira(n);
		scan.close();
	}
}
