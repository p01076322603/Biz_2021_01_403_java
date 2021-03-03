package aclass.one;

import java.util.Scanner;

// 문제 제목 : 검증수
public class Q2475 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for (int i = 0, num = 0; i < 5; i++) {
			num = scan.nextInt();
			num = num * num;
			sum += num;
		}
		
		scan.close();
		System.out.println(sum % 10);
	}
}
