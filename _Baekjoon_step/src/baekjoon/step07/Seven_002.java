package baekjoon.step07;

import java.util.Scanner;

public class Seven_002 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int loop = Integer.valueOf(sc.nextLine());
		String number = sc.nextLine();
		int sum = 0;
		
		sc.close();
		
		for (int i = 0; i < loop; i++) {
			sum += number.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
