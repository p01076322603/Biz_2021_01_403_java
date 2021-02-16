package baekjoon.step04;

import java.util.Scanner;

public class Four_001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		while (true) {

			a = sc.nextInt();
			b = sc.nextInt();

			if (a < 1 || b < 1) {
				break;
			} else {
				System.out.println(a + b);
			}
		}
	
		sc.close();
	}
}
