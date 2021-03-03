package baekjoon.step04;

import java.util.Scanner;

class Array2 {

	public static int split0(int number) {
		number = number / 10;
		return number;
	}

	public static int split1(int number) {
		number = number % 10;
		return number;
	}
}

public class Four_003 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = num1;
		int count = 0;
		int fdigit, ldigit;
		
		sc.close();

		while (true) {
		
			fdigit = Array2.split1(num1);
			ldigit = Array2.split1(Array2.split0(num1) + Array2.split1(num1));
			num1 = (fdigit * 10) + ldigit;
			++count;
		
			if (num1 == num2) {
				System.out.println(count);
				break;
			}
		}
	}
}
