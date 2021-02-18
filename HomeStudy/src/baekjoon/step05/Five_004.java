package baekjoon.step05;

import java.util.Scanner;

public class Five_004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int dupeCount = 10;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (sc.nextInt() % 42);
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					--dupeCount;
					break;
				}
			}
		}
		sc.close();

		System.out.println(dupeCount);
	}
}