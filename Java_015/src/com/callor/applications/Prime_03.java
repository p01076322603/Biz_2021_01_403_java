package com.callor.applications;

import java.util.Scanner;
import com.callor.applications.service.PrimeServiceV2;

public class Prime_03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		PrimeServiceV2 psV2 = new PrimeServiceV2();

		/* 키보드로부터 정수를 입력받아 정수형 변수 keyNum에 저장한다
		 * psV2 클래스의 prime() method를 호출하고 keyNum에 저장된 값을 전달하여
		 * return된 값이 -1이라면 "소수가 아닙니다"를 출력하고
		 * 입력한 keyNum의 값이 2 미만이라면 "소수가 아닙니다"를 출력하고
		 * 둘다 아니라면 값과 함께 " : 소수입니다"를 출력한다 */
		System.out.print("2 이상 자연수를 입력하세요 >> ");
		int keyNum = scan.nextInt();
		
		if (psV2.prime(keyNum) == -1 || keyNum < 2) 
			 System.out.println("소수가 아닙니다");
		else System.out.printf("%d : 소수입니다", keyNum);
	}
}