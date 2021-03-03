package aclass.two;

import java.util.Scanner;

// 문제 이름 : 분해합
public class Q2231 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int nLength = 0;
		boolean isBreak = false;
		
		scan.close();
		
		int temp = n;
		while (temp != 0) {
			temp /= 10;
			++nLength;
		}

		for (int i = 0, number = 0, boon; i < n; i++) {

			boon = 0;
			++number;

			temp = number;
			for (int j = 0; j < nLength; j++) {
				boon += temp % 10;
				temp /= 10;
			}
			if (number + boon == n) {
				System.out.println(number);
				isBreak = true;
				break;
			}
		}
		if (isBreak == false)
			System.out.println("0");
	}
}