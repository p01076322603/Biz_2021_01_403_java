package baekjoon.step03;

import java.util.Scanner;

public class Three_003 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			sum += (i + 1);
		}
		System.out.println(sum);
	}
}
