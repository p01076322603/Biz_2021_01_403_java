package com.callor.applications;

// System.out.print**() method

public class Class_05 {

	public static void main(String[] args) {

		/*
		 * () 안의 값, 변수값, 연산식의 결과를 Console에 출력 한 후 자동 줄바꿈을
		 * 하여 이후 출력되는 결과가 다음 줄에 출력되도록 하는 기능
		 * () 안에 내용이 없다면 줄 바꿈 기능만 수행
		 */
		System.out.println();
		System.out.println(30 + 40);
		System.out.println("대한민국");

		/*
		 * () 안의 값, 변수값, 연산식 등을 Console에 표시 단, 출력후 줄바꿈을 하지 않는다
		 * 이후 출력되는 결과가 이어서 출력된다 또한, () 안의 내용을 생략 할 수 없다
		 */
//		System.out.print();
		System.out.print(30 + 40);
		System.out.print("대한민국");

		/*
		 * print formatting 문자열을 형식(양식)에 맞추어 출력하고자 할 때 
		 * %d : 정수, %s : 문자열, %f : 실수형
		 */
//		System.out.printf();
		System.out.printf("%d \t%s \t%f \n", 30, "대한민국", 30.245F);
		System.out.println("=========================================");
		// %d 위치에 숫자값을 넣어서 출력형식 만들기
		System.out.printf("숫자 : %d\n", 3);
		System.out.printf("숫자 : %d\n", 30);
		System.out.printf("숫자 : %d\n", 300);
		System.out.printf("숫자 : %d\n", 3000);
		System.out.println("============");
		// 일단 4개짜리 빈 공간을 만들고 숫자를 오른쪽 정렬
		System.out.printf("숫자 : %4d\n", 3);
		System.out.printf("숫자 : %4d\n", 30);
		System.out.printf("숫자 : %4d\n", 300);
		System.out.printf("숫자 : %4d\n", 3000);
		System.out.println("============");
		// 일단 4개짜리 빈 공간을 만들고 숫자를 오른쪽 정렬 왼쪽의 빈칸을 문자열 "0"으로 채우기
		System.out.printf("숫자 : %04d\n", 3);
		System.out.printf("숫자 : %04d\n", 30);
		System.out.printf("숫자 : %04d\n", 300);
		System.out.printf("숫자 : %04d\n", 3000);
		System.out.println("============");
		// 일단 4개짜리 빈 공간을 만들고 숫자를 왼쪽 정렬
		System.out.printf("숫자 : %-4d\n", 3);
		System.out.printf("숫자 : %-4d\n", 30);
		System.out.printf("숫자 : %-4d\n", 300);
		System.out.printf("숫자 : %-4d\n", 3000);
		System.out.println("============");
		// %d 일경우 값보다 자릿수가 부족할 경우 형식이 어긋난다
		System.out.printf("숫자 : %3d\n", 3);
		System.out.printf("숫자 : %3d\n", 30);
		System.out.printf("숫자 : %3d\n", 300);
		System.out.printf("숫자 : %3d\n", 3000);
		System.out.println("============");
		// 실수 표현 %f : 정수 부분 3자리, 소수점부분 2자리 (3번째 자리에서 반올림)
		System.out.printf("숫자 : %3.2f\n", 30.6666);
		System.out.println("========================");
		System.out.printf("%s 우리나라\n", "대한민국");
		System.out.println("========================");
		// %s 대신 문자열을 채워서 출력 형식 만들기
		// 단, 문자열이 한글일 경우 형식이 어긋나는 경우가 있다
		System.out.printf("%10s 우리나라\n", "대한");
		System.out.printf("%10s 우리나라\n", "대한민");
		System.out.printf("%10s 우리나라\n", "대한민국");
		System.out.println("========================");
		System.out.printf("%-15s 우리나라\n", "KO");
		System.out.printf("%-15s 우리나라\n", "KOR");
		System.out.printf("%-15s 우리나라\n", "KOREA");
		System.out.println("========================");

		int dan = 7;
		for (int i = 1; i < 10; i++) {
			// %2d를 사용하여 결과값을 빈공간을 만들고 오른쪽 정렬
			System.out.printf("%d x %d = %2d" + "\n", dan, i, (dan * i));
		}
	}
}
