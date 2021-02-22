package com.callor.applications;

public class Numbers_02 {

	public static void main(String args[]) {
		
		
		int intNum1 = 33;
		int intNum2 = 77;
		
		System.out.println("intNum1 = " + intNum1 + " " + 
						   "intNum2 = " + intNum2);

		// 1. 임시로 사용할 intNum3을 만들고
		// 2. intNum1 변수 값을 복사해 둔다 (백업)
		int intNum3 = 0;
		intNum3 = intNum1;

		// 3. intNum1 변수에 intNum2의 값을 복사
		// intNum1 == intNum2 상태가 된다
		intNum1 = intNum2;

		// 4. 임시로 intNum3에 백업해둔 intNum1의 값을 intNum2에 복사
		intNum2 = intNum3;
		
		// 5. intNum1의 값과 intNum2의 값이 바뀐다 
		System.out.println("intNum1 = " + intNum1 + " " +
						   "intNum2 = " + intNum2);
	}
}
