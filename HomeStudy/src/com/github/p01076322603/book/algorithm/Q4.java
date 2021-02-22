package com.github.p01076322603.book.algorithm;

// 문제 이름 : 세 값의 대소 관계 13종류의 모든 조합에 대해
// 중앙값을 구하여 출력하는 프로그램을 작성하세요
public class Q4 {

	static int median(int a, int b, int c) {

		if     (a >= b)
			if 		(b >= c) return b;
			else if (a <= c) return a;
			else    		 return c;
		
		else // (a < b)
			if 		(a > c)  return a;
			else if (c > b)  return b;
			else			 return c;
	}

	public static void main(String[] args) {
		
		System.out.println("{ a, b, c } = { 1, 2, 3 }");
		System.out.println();
		
		System.out.println("a = b = c " + "median(1, 1, 1) == " + median(1, 1, 1)); // 1
		System.out.println();
		System.out.println("a = b > c " + "median(2, 2, 1) == " + median(2, 2, 1)); // 2
		System.out.println("a = b < c " + "median(1, 1, 2) == " + median(1, 1, 2)); // 1
		System.out.println("a > b > c " + "median(3, 2, 1) == " + median(3, 2, 1)); // 2
		System.out.println("a < b < c " + "median(1, 2, 3) == " + median(1, 2, 3)); // 2
		System.out.println();
		System.out.println("b = c > a " + "median(1, 2, 2) == " + median(1, 2, 2)); // 2
		System.out.println("b = c < a " + "median(2, 1, 1) == " + median(2, 1, 1)); // 1
		System.out.println("b > c > a " + "median(1, 3, 2) == " + median(1, 3, 2)); // 2
		System.out.println("b < c < a " + "median(3, 1, 2) == " + median(3, 1, 2)); // 2
		System.out.println();
		System.out.println("c = a > b " + "median(2, 1, 2) == " + median(2, 1, 2)); // 2
		System.out.println("c = a < b " + "median(1, 2, 1) == " + median(1, 2, 1)); // 1
		System.out.println("c > a > b " + "median(2, 1, 3) == " + median(2, 1, 3)); // 2
		System.out.println("c < a < b " + "median(2, 3, 1) == " + median(2, 3, 1)); // 2

	}
}
