package baekjoon.step03;

import java.util.Scanner;

public class Three_009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		sc.close();

		for (int i = 0; i < T; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
