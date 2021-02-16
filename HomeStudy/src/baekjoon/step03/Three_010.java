package baekjoon.step03;

import java.util.Scanner;

public class Three_010 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		sc.close();

		for (int i = 0; i < N; i++) {

			for (int b = 0; b < (N - i - 1); b++) {
				System.out.print(" ");
			}
			for (int s = 0; s < (i + 1); s++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}