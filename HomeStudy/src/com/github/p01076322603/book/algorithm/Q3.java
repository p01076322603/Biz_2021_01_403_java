package com.github.p01076322603.book.algorithm;

// 문제 이름 : 네 값의 최솟값을 구하는 min4 메서드를 작성하세요
public class Q3 {

	static int min4(int a, int b, int c, int d) {

		int min = a;
		if (min > b) min = b; 
		if (min > c) min = c;
		if (min > d) min = d;

		return min;
	}

	public static void main(String[] args) {
		System.out.println(min4(1, 3, 2, 4));
	}
}