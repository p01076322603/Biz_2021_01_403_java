package baekjoon.step06;

public class Six_002 {

	static int d(int n) {

		int digit = (int) Math.log10(n) + 1;
		int nArr[] = new int[digit];
		int number = 0;

		number += n;

		for (int i = digit - 1; i >= 0; i--) {

			nArr[i] = n % 10;
			number += nArr[i];
			n /= 10;

		}
		return number;
	}

	public static void main(String[] args) {

		int[] notSelfNumber = new int[10001];

		for (int i = 1; i <= 10000; i++) {
			if (d(i) <= 10000)
			notSelfNumber[d(i)] = d(i);
		}

		for (int i = 1; i <= 10000; i++) {
			if (notSelfNumber[i] == 0)
				System.out.println(i);
		}
	}
}