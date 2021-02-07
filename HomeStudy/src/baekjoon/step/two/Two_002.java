package baekjoon.step.two;

import java.util.Scanner;

public class Two_002 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int testResult = sc.nextInt();

		sc.close();
		
		if (testResult < 60) {
			System.out.println("F");
		} else if (testResult < 70) {
			System.out.println("D");
		} else if (testResult < 80) {
			System.out.println("C");
		} else if (testResult < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
		}
	}
}
