package baekjoon.step03;

import java.util.Scanner;

public class Three_007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int a = 0;
		int b = 0;
		
		for (int i = 0; i < T; i++) {
		
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + (i + 1) + ": " + (a + b));
		}
		
		sc.close();
	}
}
