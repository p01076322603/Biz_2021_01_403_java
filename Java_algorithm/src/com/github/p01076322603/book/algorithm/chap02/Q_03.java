package com.github.p01076322603.book.algorithm.chap02;

public class Q_03 {

	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] a = new int[] {23, -14, 34, 45, -13, 11};
		System.out.println(sumOf(a));
	}
}
