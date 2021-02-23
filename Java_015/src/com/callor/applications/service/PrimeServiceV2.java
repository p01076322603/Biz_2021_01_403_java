package com.callor.applications.service;

public class PrimeServiceV2 {

	// 정수 값 하나를 매개변수로 받아 소수인지 판별한 뒤
	// 소수가 맞다면 받은 매개변수 값을 return, 아니라면 정수 값 -1을 return
	public int prime(int keyNum) {

		// if (소수이면) return num;
		// else return -1;
		
		int pos = 0;
		for (pos = 2; pos < keyNum; pos++) {
			// true 이면 소수가 아니다
			if (keyNum % pos == 0) {
				// prime() method 실행을 중단하고
				// main() method에게 -1을 되돌려줘라
				return -1;
			}
		}
		// num값이 소수여서 for() 반복문을 모두 수행하고 여기에 다다르면
		// num값을 그대로 return 하라
		return keyNum;
	}
}