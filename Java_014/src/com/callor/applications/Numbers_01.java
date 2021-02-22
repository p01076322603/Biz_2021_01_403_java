package com.callor.applications;

public class Numbers_01 {

	public static void main(String[] args) {

		/* 배열의 요소에 어떤 값을 저장할 때는 intNums[위치] = 값 형식을 사용하는데
		 * 이때 위치의 값을 "(배열)첨자" 라고 한다

		 * intNums[3] = 100
		 * ==> intNums 배열의 3번 첨자 위치에 100을 저장

		 * System.out.println( intNums[4] );
		 * ==> intNums 배열의 4번 첨자 위치에 저장된 값을 Console에 출력하라

		 * sum = intNums[5]
		 * ==> intNums 배열의 5번 첨자 위치에 저장된 값을 변수 sum에 복사하라

		 * sum = intNums[7] + 200
		 * ==> intNums 배열의 7번 첨자 위치에 젖아된 값과 정수 200을 더하여 변수 sum에 복사하라

		 * 배열의 첨자 최댓값은 항상 배열.length - 1 이다
		 * ==> new int[100] 으로 배열을 생성하였다면 가장 마지막 첨자는 99가 된다.
		 * ==> int intNums = new int[10] 으로 배열을 만들고 intNums[10] = 100 이라는 명령을 실행하면
		 * 	   ArrayIndexOutOfBounds Exception이 발생한다.
		 * ==> intNums[-1]이라는 명령은 사용할수 없다
		 * 	   첨자는 0부터 intNums.length - 1 까지의 정수만 넣을 수 있다.
		 */
		
		// 10길이를 가지는 배열 선언 및 생성                			  배열의 길이
		int[] intNums = new int[10]; // intNums[0] ~ intNums[9] ( [0] ~ [intNums.length - 1] )

		for (int i = 0; i < intNums.length; i++) { // i : 0 ~ 9
			intNums[i] = i + 1; // i : 1 ~ 10
		}						// { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }

		System.out.print("{ ");
		for (int i = 0; i < intNums.length - 1; i++) {
			System.out.print(intNums[i] + ", ");
		}
		System.out.print(intNums[intNums.length - 1]);
		System.out.print(" }");
	}
}
