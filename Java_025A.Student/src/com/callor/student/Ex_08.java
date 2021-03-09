package com.callor.student;

import java.util.Random;

/* 길이 100의 정수형 배열을 선언하여
 * 10 ~ 100 까지 임의의 정수를 생성하여 저장
 * 길이 100의 배열에 담긴 정수중에 소수들만 찾아서 Console 출력 */
public class Ex_08 {

    public static void main(String[] args) {

	Random rnd = new Random();
	int[] numArr = new int[100];

	for (int i = 0; i < numArr.length; i++) {
	    numArr[i] = rnd.nextInt(91) + 10;
	}

	for (int i = 0; i < numArr.length; i++) {

	    for (int j = 2; j < numArr[i]; j++) {
		if (numArr[i] % j == 0) {
		    break;
		} else if (j == numArr[i]) {
		    System.out.println(numArr[i] + " ");
		}
	    }
	}
    }
}