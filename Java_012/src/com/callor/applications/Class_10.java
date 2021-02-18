package com.callor.applications;

import com.callor.applications.service.ClassServiceV7;

public class Class_10 {

	public static void main(String[] args) {
		
		ClassServiceV7 csV7 = new ClassServiceV7();
		
		for(int dan = 2; dan < 10; dan++) {
			csV7.guGu(dan);
		}
	}
}
