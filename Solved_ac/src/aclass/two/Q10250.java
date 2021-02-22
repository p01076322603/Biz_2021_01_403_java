package aclass.two;

import java.util.Scanner;

//문제 이름 : ACM 호텔
public class Q10250 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int t = scan.nextInt();

		for (int i = 0; i < t; i++) {

			int h = scan.nextInt();
			int w = scan.nextInt();
			int n = scan.nextInt();

			int hMod = n % h;
			int hDiv = n / h;

			if (hMod != 0) {
				System.out.printf("%d%02d\n", hMod, hDiv + 1);
			} else {
				System.out.printf("%d%02d\n", hMod + h, hDiv);
			}
		}
		scan.close();
	}
}