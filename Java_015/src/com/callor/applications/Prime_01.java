package com.callor.applications;

import java.util.Scanner;

public class Prime_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int intNum = scan.nextInt();
		
		// 반복문의 break 유무를 판단하는 변수
		boolean isBreak = false;
		
		// intNum이 소수인지 판별하고 소수가 아니라면 isBreak의 값을 true로 바꾸고 break;
		for (int div = 2; div < intNum; div++) { // 2 ~ (intNum - 1)
			if (intNum % div == 0) {
				isBreak = true;
				break;
			}
		}
		
		// 위의 반복문에서 break가 되었는지 확인하여 결과 출력
		if (isBreak == true) System.out.println("소수가 아님");
					   else  System.out.println("소수");
	}
}