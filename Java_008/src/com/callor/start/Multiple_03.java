package com.callor.start;

public class Multiple_03 {
	
	public static void main(String args[]) {
		
		int intSum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int num = i + 7;
			boolean bYes1 = num % 3 == 1;
			
			if(bYes1) {
				intSum += num;
			}
			
			boolean bYes2 = num % 3 == 2;
			if(bYes2) {
				intSum += num;
			}
		}
		
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
		System.out.println();
		
		intSum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 > 0;
			if(bYes) {
				intSum += num;
			}
		}
	
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
		System.out.println();
		
		intSum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 == 0;
			if(!bYes) {
				intSum += num;
			}
		}
		
		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
		System.out.println();

		intSum = 0;
		
		for(int i = 0; i < 100; i++) {
			
			int num = i + 7;
			boolean bYes = num % 3 != 0;
			if(bYes) {
				intSum += num;
			}
		}

		System.out.println("3의 배수가 아닌 수의 합 : " + intSum);
		System.out.println();
	}
}
