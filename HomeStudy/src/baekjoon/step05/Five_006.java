package baekjoon.step05;

import java.util.Scanner;

public class Five_006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score = 0;
		int scoreSum = 0;

		String[] arr = new String[sc.nextInt()];
		String[] ox = {};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.next();
		}

		sc.close();
		
		for (int i = 0; i < arr.length; i++) {

			score = 0;
			scoreSum = 0;
			ox = arr[i].split("");

			for (int j = 0; j < ox.length; j++) {

				if (ox[j].equals("O")) {
					++score;
					scoreSum += score;
				} else {
					score = 0;
				}
			}
			System.out.println(scoreSum);
		}
	}
}