package com.callor.student;

import java.util.Random;

/* 길이 100의 정수형 배열을 선언하여
 * 10 ~ 100 까지 임의의 정수를 생성하여 저장
 * 길이 100의 배열에 담긴 정수중에 소수들만 찾아서 Console 출력 */
public class Ex_08 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] rndArr = new int[100];

		for (int i = 0; i < rndArr.length; i++) {
			rndArr[i] = rnd.nextInt(91) + 10;
		}

		for (int i = 0; i < rndArr.length; i++) {

<<<<<<< Updated upstream
	    int j = 0;
	    for (j = 2; j < numArr[i]; j++) {
		if (numArr[i] % j == 0) {
		    break;
		}
	    }
	 
	    if (numArr[i] == j) {
		System.out.println(numArr[i]);
	    }
=======
			int j = 0;
			for (j = 2; j < rndArr[i]; j++) {
				if (rndArr[i] % j == 0) {
					break;
				}
			}
			if (rndArr[i] == j) {
				System.out.println(j + " ");
				
			}
		}
>>>>>>> Stashed changes
	}
}