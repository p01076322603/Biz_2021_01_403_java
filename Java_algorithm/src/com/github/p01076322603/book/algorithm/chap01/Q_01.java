package com.github.p01076322603.book.algorithm.chap01;

// 문제 이름 : 네 값의 최댓값을 구하는 max4 메서드를 작성하세요
public class Q_01 {

	static int max4(int a, int b, int c, int d) {

		int max = a;
		if (max < b) max = b; 
		if (max < c) max = c;
		if (max < d) max = d;

		return max;
	}

	public static void main(String[] args) {
		System.out.println(max4(1, 4, 3, 2));
	}
}