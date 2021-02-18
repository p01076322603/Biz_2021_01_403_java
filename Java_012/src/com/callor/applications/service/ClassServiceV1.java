package com.callor.applications.service;

/* Java 코딩을 할 때 :
 * {} 내부에서 같은 이름의 변수는 2번이상 선언 불가
 * class {} 내부에서 같은 이름의 method는 2번이상 선언 불가 
 * 
 * 하지만 Java에서는 메서드의 매개변수 개수, 타입이 다르면
 * 같은 이름의 메서드를 중복하여 선언할 수 있다
 */

public class ClassServiceV1 {

	public void add(int iNum1, int iNum2) {
		
		System.out.println(iNum1 + iNum2);
	}

	public void add(int iNum1, float fNum) {
		
		System.out.println(iNum1 + fNum);
	}

	public void add(float fNum, double dNum) {

		System.out.println(fNum + " + " + dNum + " = " + (fNum + dNum));
		System.out.println(fNum + " x " + dNum + " = " + (fNum * dNum));
		System.out.println(dNum + " - " + fNum + " = " + (dNum - fNum));
		System.out.println(dNum + " ÷ " + fNum + " = " + (dNum / fNum));
	}
}