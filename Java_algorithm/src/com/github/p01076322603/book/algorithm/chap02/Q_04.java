package com.github.p01076322603.book.algorithm.chap02;

public class Q_04 {

	static int[] copy(int[] a, int[] b) {

		a = b.clone();
 		return a;
	}

	public static void main(String[] args) {
		
		int[] a = new int[] {};
		int[] b = new int[] { 1, 2, 3, 4, 5 };
		
		System.out.print("b 배열 : { ");
		for (int arr : b) {
			System.out.print(arr + " ");
		}
		System.out.println("}");
		
		a = copy(a, b);
		
		System.out.print("a 배열 : { ");
		for (int arr : a) {
			System.out.print(arr + " ");
		}
		System.out.println("}");
	}
}
