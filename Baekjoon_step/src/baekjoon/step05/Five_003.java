package baekjoon.step05;

import java.util.Scanner;

public class Five_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		int digit = 0;
		int count = 0;

		sc.close();

		digit = (int) Math.log10(number) + 1;
		int[] arr = new int[digit];

		for (int i = digit; i > 0; i--) {
			arr[i - 1] = number % 10;
			number /= 10;
		}

		for (int i = 0; i < 10; i++) {

			count = 0;

			for (int j = 0; j < digit; j++) {
				if (i == arr[j]) {
					++count;
				}
			}
			System.out.println(count);
	
		}
	}
}