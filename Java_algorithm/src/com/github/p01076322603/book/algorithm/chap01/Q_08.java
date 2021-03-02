package com.github.p01076322603.book.algorithm.chap01;

import java.util.Scanner;

public class Q_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int sum = 0;

		if (n % 2 == 0) {
			sum = (1 + n) * (n / 2);
		} else {
			sum = (1 + (n - 1)) * ((n - 1) / 2) + n;
		}
		System.out.println(sum);

		sum = 0;

		for (int i = 0; i < n; i++) {
			sum += (i + 1);
		}
		System.out.println(sum);

		scan.close();
	}
}
