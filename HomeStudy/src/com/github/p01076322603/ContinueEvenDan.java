package com.github.p01076322603;

public class ContinueEvenDan {

	public static void main(String args[]) {
		
		for(int i = 0; i < 8; i++) {
			
			int dan = (i + 2);
			boolean bYes = (dan % 2 == 1);
			if(bYes) {
				continue;
			}
			for(int j = 0; j < 8; j++) {
				
				int multiple = (j + 2);
				System.out.println(dan + " x " + multiple + " = " + (dan * multiple));
			}
			System.out.println();
		}
	}
}
