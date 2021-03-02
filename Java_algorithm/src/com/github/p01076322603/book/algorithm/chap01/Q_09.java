package com.github.p01076322603.book.algorithm.chap01;

import java.util.Scanner;

public class Q_09 {

	static void sumof(int a, int b) {

		int tmp = 0;
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		// (a, b) == (min num, max num) 
		
		int sum = b;
		for (int i = a; i < b; i++) { // (a ~ (b - 1)) + b(: sum)
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		sumof(scan.nextInt(), scan.nextInt());
		scan.close();
	}
}