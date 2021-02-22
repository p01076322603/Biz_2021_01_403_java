package com.github.p01076322603.book.java;

public class BreakDan {

	public static void main(String args[]) {
		
		for(int i = 0; i < 8; i++) {

			int dan = (i + 2);
			
			for(int j = 0; j < 8; j++) {
				
				int multiple = (j + 2);
				
				if(dan >= multiple) {
					System.out.println(dan + " x " + multiple + " = " + (dan * multiple));
				} else {
					break;
				}
			}
			System.out.println();
		}
	}
}
