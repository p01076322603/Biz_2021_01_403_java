package com.callor.start.loop;

public class Loop_03 {
	
	public static void main(String args[]) {
		
		// intSum : main() method local scope variable
		int intSum = 0;
		
		for(int i = 0 ; i < 10 ; i++) {
			
			// main() method scope variable 'intSum'은 for() 반복문 내에서 자유롭게 읽기 / 저장이 가능
			intSum += 10;
			System.out.println(i + " , " + intSum);
		}

		/* for 반복문 종료
		 * 여기에서 읽을 수 있는 변수 : intSum
		 * 변수 i 는 for() 반복문이 끝나며 소멸됨
		 */ 

		System.out.println("==========================================");
		
		System.out.println("for() 반복문이 끝난 후의 변수 intSum : " + intSum);
		// System.out.println(i);

		System.out.println("==========================================");
		
		// 이미 선언되어 사용중인 변수를 Clear
		intSum = 0;
		int num2 = 0;
		for(int i = 0 ; i < 200 ; i++) {
			
			num2++;
			int num1 = i + 1;
			intSum += num1;
		}
		
		System.out.println("1 부터 " + num2 + " 까지 덧셈 결과 : " + intSum);
	}
}
