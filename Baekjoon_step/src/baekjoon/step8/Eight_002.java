package baekjoon.step8;

import java.util.Scanner;

public class Eight_002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		scan.close();

		int fNum = 0;
		int lNum = 0;
		int circle = 0; 

		if (n == 1) {
			System.out.println("1");
			return;
		}
		
		while (true) {
			++circle;
			lNum += 6 * circle;
			if (n >= (fNum + 2) && n <= (lNum + 1)) {
				System.out.println(circle + 1);
				break;
			}
			fNum = lNum;
		}
	}
}