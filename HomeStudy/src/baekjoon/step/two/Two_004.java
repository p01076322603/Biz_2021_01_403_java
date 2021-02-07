package baekjoon.step.two;

import java.util.Scanner;

public class Two_004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();

		if (x > 0 && y > 0) {
			System.out.println(1);
		} else if (x < 0 && y > 0) {
			System.out.println(2);
		} else if (x < 0 && y < 0) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
}
