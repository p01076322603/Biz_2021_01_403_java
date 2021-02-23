package com.callor.applications;

import java.util.Random;
import java.util.Scanner;

public class Array_01C {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] intNums = new int[100];
		
		for (int i = 0; i < intNums.length; i++) {
			intNums[i] = rnd.nextInt(10) + 1;
		}
		
		// 키보드 입력을 받기 위해 Scanner 클래스를 scan 객체로 선언하고
		// new 생성자() 형태로 scan 객체를 인스턴스화(사용할 준비를 한다)
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 1 ~ 10 까지 중 숫자 입력!");
		System.out.print("숫자 >> ");
		int keyNum = scan.nextInt();
		
		/* intNums는 어떤 값이 저장 되어 있는지 모른다
		 * 단 1 ~ 10 까지의 숫자들이 들어 있을 것이다
		 * intNums 배열에 저장된 숫자들 중에서
		 * 키보드로 입력받은 값과(keyNum에 저장되어 있다)
		 * 같은 값들이 몇번(몇개) 저장되어 있는지 알고싶다 */ 
		
		int count = 0; // 몇개인지 개수를 헤아릴 변수
		for (int i = 0; i < intNums.length; i++) {
			// if(intNums[i] == keyNum) {   }
			boolean bYes = (intNums[i] == keyNum);
			if (bYes) {
				++count;
				System.out.println(intNums[i]);
			}
		}
		System.out.println(keyNum + "의 갯수 : " + count);
	}
}
