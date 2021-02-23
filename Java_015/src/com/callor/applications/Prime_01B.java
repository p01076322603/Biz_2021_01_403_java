package com.callor.applications;

import java.util.Scanner;

public class Prime_01B {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2 이상의 정수 입력 >> ");
		int keyNum = scan.nextInt();
		
		int pos = 0;				// break가 되지 않았다면 pos++를 수행하고 종료된다
		for (pos = 2; pos < keyNum; pos++) {
			if (keyNum % pos == 0) {
				break;
			}
		}
		System.out.println(pos);
		
		// for 반복문이 중간에 break 되면 항상 pos < keyNum		
		if (pos < keyNum) {
			System.out.println(keyNum + "는 소수가 아님");
		
		// for 반복문이 break 없이 모두 완료되었다면 pos >= keyNum
		} else {
			System.out.println(keyNum + "는 소수임");
		}

	}
}