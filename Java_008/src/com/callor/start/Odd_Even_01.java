package com.callor.start;

public class Odd_Even_01 {

	public static void main(String args[]) {

		int odd = 0;
		int even = 0;

		int num = 100;

		for (int i = 0; i <= num; i++) {

			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}

		System.out.println(num + " 까지의 짝수의 합 : " + even);
		System.out.println(num + " 까지의 홀수의 합 : " + odd);

		System.out.println("===========================");

		odd = 0;
		even = 0;

		int count = 0;

		num = 100;
		int num1 = num;

		while (num > 0) {
			++count;
			odd += count;
			num--;
			++count;
			even += count;
			num--;
		}

		System.out.println(num1 + " 까지의 짝수의 합 : " + even);
		System.out.println(num1 + " 까지의 홀수의 합 : " + odd);

		System.out.println("===========================");

		odd = 0;
		even = 0;

		num = 100;

		for (int i = 0; i <= num; i += 2) {

			even = even + i;
		}

		System.out.println(num + " 까지의 짝수의 합 : " + even);

		for (int i = 1; i <= num; i += 2) {

			odd = odd + i;
		}

		System.out.println(num + " 까지의 홀수의 합 : " + odd);

		System.out.println("===========================");

		int evenOdd = 0;

		num = 100;

		for (int i = 0; i < (num + 1); i++) {

			if (i % 2 == 0) {
				evenOdd = evenOdd + i;
			}
		}

		System.out.println(num + " 까지의 짝수의 합 : " + evenOdd);

		evenOdd = 0;

		for (int i = 1; i < (num + 1); i++) {

			if (i % 2 == 1) {
				evenOdd = evenOdd + i;
			}
		}
		System.out.println(num + " 까지의 홀수의 합 : " + evenOdd);

		System.out.println("===========================");

		int evenSum = 0;
		int oddSum = 0;

		int number = 100;

		for (int i = 0; i < number; i++) {

			boolean bYes = (i + 1) % 2 == 0;

			if (bYes) {
				evenSum = evenSum + (i + 1);
			}
		}

		for (int i = 0; i < number; i++) {

			int j = i + 1;
			boolean bYes = j % 2 == 1;

			if (bYes) {
				oddSum = oddSum + j;
			}
		}

		System.out.println(number + " 까지의 짝수의 합 : " + evenSum);
		System.out.println(number + " 까지의 홀수의 합 : " + oddSum);

		System.out.println("===========================");
		
		oddSum = 0;
		
		for (int i = 0; i < 100; i++) {
		
			int numnum = i + 1;
			boolean bYes = numnum % 2 == 0;

			// if(bYes == false) {
			if (!bYes) { // bYes가 True가 아니라면
				oddSum += numnum;
			}
		}
		System.out.println("100 까지의 홀수의 합 : " + oddSum);
	}
}
