package com.callor.applications;

import java.util.Scanner;
import com.callor.applications.service.PrimeServiceV1;

public class Prime_02 {

	public static void main(String[] args) {
		
		PrimeServiceV1 psV1 = new PrimeServiceV1();
		Scanner scan = new Scanner(System.in);
		
		/* prime() method를 호출하여 정수형 매개변수를 키보드로 입력받아
		 * scan.nextInt -> psV1.prime -> System.out.println
		 * 값을 전달하고 return된 결과를 출력 */
		System.out.println(psV1.prime(scan.nextInt()));
	}
}
