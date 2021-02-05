package com.callor.start.loop;

public class Loop_05 {
	
	public static void main(String args[]) {
		
		int intSum = 0;
		
		// 1, 3, 5, 7, 9
		for(int i = 0 ; i < 10 ; i += 2) {
			
			intSum += i + 1;
			System.out.print(intSum + ", ");
		}
		
		System.out.println();
		System.out.println("================================");
		System.out.println("0 부터 10 까지 중 홀수의 합 : " + intSum);
		System.out.println();
		
		intSum = 0; // intSum을 clear 하지 않으면 이후의 계산 결과가 엉뚱한 값이 나온다
		
		// 0, 2, 4, 6, 8
		for(int i = 0 ; i < 10 ; i += 2) {
			
			intSum += i;
			System.out.print(intSum + ", ");
		}

		System.out.println();
		System.out.println("================================");
		System.out.println("0 부터 10 까지 중 홀수의 합 : " + intSum);
		System.out.println();
		
		// ======================================================== //
		
		intSum = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.print(intSum);
			intSum += ++i;
			System.out.print(" + " + i + " = ");
			System.out.println(intSum);
		}
	
		System.out.println();
		
		intSum = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			System.out.print(intSum);
			System.out.print(" + " + i + " = ");
			intSum += i++;
			System.out.println(intSum);
		}
	}
}
