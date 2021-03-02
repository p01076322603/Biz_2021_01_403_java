package com.github.p01076322603.book.algorithm.chap01;

import java.util.Scanner;

// 문제 이름 : while문이 종료될 때 변수 i 값이 n + 1 이 됨을 확인하세요
public class Q_06 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
 		System.out.print("n의 값：");
		int n = stdIn.nextInt();

		int sum = 0;				
		int i = 1;

		while (i <= n) {			
			sum += i;				
			i++;					
		}
		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
		System.out.println("i의 값 : " + i);
		
		stdIn.close();
	}
}