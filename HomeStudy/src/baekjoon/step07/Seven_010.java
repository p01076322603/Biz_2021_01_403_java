package baekjoon.step07;

import java.util.Arrays;
import java.util.Scanner;

public class Seven_010 {

	static String[] unique(String str) {

		String[] arr = str.split("");
		int rareArray = arr.length;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].equals(arr[j])) {
					arr[i] = ":";
					--rareArray;
				}
			}
		}

		String[] rare = new String[rareArray];

		for (int i = 0; i < rare.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (arr[j].equals(":"))
					continue;
				else {
					rare[i] = arr[j];
					arr[j] = ":";
					break;
				}
			}
		}
		Arrays.fill(arr, null);
		return rare;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = Integer.valueOf(scan.nextLine());
		int count = 0;

		for (int i = 0; i < N; i++) {

			String word = scan.nextLine();
			String[] uArray = unique(word);
			int uLength = uArray.length;
			boolean isBreak = false;

			if (word.length() > 2) {

				for (int j = 0; j < uLength; j++) {

					int sNum = word.indexOf(uArray[j]);
					int lNum = word.lastIndexOf(uArray[j]);
					isBreak = false;

					for (int k = sNum; k < lNum; k++) {

						if ((word.charAt(k) == word.charAt(k + 1)) == false) {
							isBreak = true;
							break;
						}
					}
					if (isBreak == true) break;
				}
			}
			if (isBreak == false) ++count;
		}

		scan.close();
		System.out.println(count);
	}
}