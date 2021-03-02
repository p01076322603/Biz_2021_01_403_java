package com.github.p01076322603.book.algorithm.chap01;

import java.util.Scanner;

public class Q_15 {

	static void triangleLB(int n) {

		for (int i = 1; i <= n; i++) {
	
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}

	static void triangleLU(int n) {

		for (int i = 1; i <= n; i++) {
		
			for (int j = 1; j <= n - (i - 1); j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}

	static void triangleRU(int n) {

		for (int i = 1; i <= n; i++) {

			for (int j = 0; j < (i - 1) ; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= n - (i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void triangleRB(int n) {

		for (int i = 1; i <= n; i++) {
	
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.println();
		triangleLB(n);

		System.out.println();
		triangleLU(n);

		System.out.println();
		triangleRU(n);

		System.out.println();
		triangleRB(n);
		
		scan.close();
	}
}
