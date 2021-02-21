package baekjoon.step05;

import java.util.Scanner;

public class Five_007 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {

			int[] arr = new int[scan.nextInt()];
			int count = 0;
			int sum = 0;

			for (int j = 0; j < arr.length; j++) {
				arr[j] = scan.nextInt();
				sum += arr[j];
			}

			float avg = (float) sum / arr.length;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] > avg) {
					++count;
				}
			}
			System.out.printf("%3.3f" + "%%\n", (float) count / arr.length * 100);
		}

		scan.close();
	}
}