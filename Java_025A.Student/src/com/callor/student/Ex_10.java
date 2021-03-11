package com.callor.student;

/* ==========
 * 구구단 7단
 * 7 x 1 =  7
 * 7 x 2 = 14
 * 7 x 3 = 21
 * 7 x 4 = 28
 * 7 x 5 = 35
 * 7 x 6 = 42
 * 7 x 7 = 49
 * 7 x 8 = 56
 * 7 x 9 = 63
 * ==========
 */

public class Ex_10 {

    public static void main(String[] args) {
	
	int num = 7;
	
	System.out.println("==========");
	for (int i = 0; i < 9; i++) {
	    System.out.printf("%d x %d = %2d\n", num, (i + 1), (i + 1) * num);
	}
	System.out.println("==========");
    }
}
