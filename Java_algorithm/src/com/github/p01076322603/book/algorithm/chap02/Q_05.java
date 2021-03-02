package com.github.p01076322603.book.algorithm.chap02;

public class Q_05 {

	static int[] rcopy(int[] a, int[] b) {
	
		for (int tmp, i = 0; i < (b.length / 2); i++) {

			tmp = b[i];
			b[i] = b[b.length - (i + 1)];
			b[b.length - (i + 1)] = tmp;
		}
		
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
	
		a = rcopy(a, b);
		
		System.out.print("a 배열 : { ");
		for (int arr : a) {
			System.out.print(arr + " ");
		}
		System.out.println("}");
	}
}
