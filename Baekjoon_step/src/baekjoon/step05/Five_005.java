package baekjoon.step05;

import java.util.Scanner;

public class Five_005 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[sc.nextInt()];
		int max = arr[0];
		float sum = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			sum += ((float) arr[i] / max * 100);
		}

		System.out.println(sum / arr.length);
	}
}