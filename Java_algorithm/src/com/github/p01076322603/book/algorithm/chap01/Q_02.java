package com.github.p01076322603.book.algorithm.chap01;

// 문제 이름 : 세 값의 최솟값을 구하는 min3 메서드를 작성하세요
public class Q_02 {

	static int min3(int a, int b, int c) {

		int min = a;
		if (min > b) min = b; 
		if (min > c) min = c;

		return min;
	}

	public static void main(String[] args) {
		System.out.println(min3(1, 3, 2));
	}
}