package com.github.p01076322603.book.algorithm.chap02;

public class Q_02 {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 10, 73, 2, -5, 42 };

		for (int tmp, i = 0; i < (arr.length / 2); i++) {

			for (int array : arr) {
				System.out.print(array + " ");
			}
			System.out.println();
			System.out.println("a[" + i + "]과(와) " + 
							   "a[" + (arr.length - (i + 1)) + "]를 교환합니다");

			tmp = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = tmp;
		}

		for (int array : arr) {
			System.out.print(array + " ");
		}
		System.out.println();
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
