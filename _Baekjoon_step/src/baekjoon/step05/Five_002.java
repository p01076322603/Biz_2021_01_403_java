package baekjoon.step05;

import java.util.Scanner;

public class Five_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[9];
		int max = num[0];
		int number = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		
			if (max < num[i]) {
				max = num[i];
				number = i + 1;
			}
		}

		sc.close();

		System.out.println(max);
		System.out.println(number);
	}
}
