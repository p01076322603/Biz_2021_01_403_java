package aclass.two;

import java.util.Scanner;

// 문제 제목 : 직각삼각형
public class Q4153 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];

		while (true) {

			for (int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}

			for (int i = 0, temp; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] > arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			if (arr[0] == 0)
				return;
			if ((arr[0] * arr[0]) + (arr[1] * arr[1]) == (arr[2] * arr[2]))
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}