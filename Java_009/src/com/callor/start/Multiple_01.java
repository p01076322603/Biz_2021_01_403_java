package com.callor.start;

public class Multiple_01 {

	public static void main(String args[]) {

		int sum = 0;

		for (int i = 0; i < 100; i++) { // 0 ~ 99

			int number = i + 1;			// 1 ~ 100
			
			boolean bYes3M = (number % 3 == 0); // 3의 배수
			boolean bYes9M = (number % 9 == 0); // 9의 배수

			if (bYes3M && bYes9M) {		// 3의 배수 이면서 9의 배수 (&& : and)

				sum += number;
				System.out.println(number + "\t: 3과 9의 배수");
			}
		}

		System.out.println("\n" +sum + "\t: 3과 9의 배수의 합");
		System.out.println();
		
		sum = 0;
		for(int i = 0; i < 100; i++) {
			
			int number = i + 1;
			boolean bYes3M = (number % 3 == 0);
			boolean bYes9M = (number % 9 == 0);
			
			// if() 비교연산문을 중복 처리하는 방식
			if(bYes3M) { // 3의 배수를 검사하고 맞으면
				if(bYes9M) { // 다시 9의 배수를 검사
					sum += number;
					System.out.println(number + "\t: 3과 9의 배수");
				}
			}
		}
		
		System.out.println("\n" +sum + "\t: 3과 9의 배수의 합");
		System.out.println();
	}
}
