package baekjoon.step06;

import java.util.Scanner;

public class Six_003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Six_003 six = new Six_003();
		
		int n = scan.nextInt();
		int hansCount = 0;

		for (int i = 0; i < n; i++) {
			if (six.hans(i + 1) == true)
				++hansCount;
		}

		scan.close();
		System.out.println(six.hans(n));
		System.out.println(hansCount);
	}

	boolean hans(int number) {

		int arrayDigit = (int) Math.log10(number) + 1;
		int arr[] = new int[arrayDigit];

		if (number > 99) {

			for (int i = 1; i < arrayDigit + 1; i++) {
				arr[arrayDigit - i] = number % 10;
				number /= 10;
			}

			int gapArr[] = new int[arrayDigit - 1];

			for (int i = 0; i < arrayDigit - 1; i++) {
				gapArr[i] = arr[i] - arr[i + 1];
			}

			for (int i = 0; i < gapArr.length - 1; i++) {
				if (gapArr[i] != gapArr[i + 1])
					return false;
			}
			return true;
		} else if (number < 1) {
			return false;
		} else {
			return true;
		}
	}
}