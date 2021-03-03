package baekjoon.step8;

import java.util.Scanner;

public class Eight_003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int sum = 0;

		scan.close();

		for (int i = 0;; i++) {

			sum += i;

			if (x <= sum) {
				if (i % 2 == 1)
					System.out.println(i - (Math.abs(sum - i - x + 1)) + "/" + Math.abs(sum - i - x));
				else
					System.out.println(i - (sum - x) + "/" + (sum - x + 1));
				break;
			}
		}
	}
}