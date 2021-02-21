package baekjoon.step03;

import java.util.Scanner;

public class Three_002 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		
		scan.close();
		
		for(int i = 0; i < T; i++) {

			int A = scan.nextInt();
			int B = scan.nextInt();
			
			System.out.println(A + B);
		}
	}
}
