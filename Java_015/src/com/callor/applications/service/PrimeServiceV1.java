package com.callor.applications.service;

public class PrimeServiceV1 {

	// 정수형 매개변수를 받아 소수인지 판별하여 문자열을 return
	public String prime(int keyNum) {

		int pos = 0;
		for (pos = 2; pos < keyNum; pos++) {
			if (keyNum % pos == 0) {
				break;
			}
		}
		if (pos < keyNum) return "소수가 아님";
				    else  return "소수";
	}
}
