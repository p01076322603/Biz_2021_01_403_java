package com.github.p01076322603.book;

public class Triangle_01 {

	public static void main(String args[]) {

		for (int i = 0; i < 4; i++) {

			int star = (i * 2) + 1;

			for (int j = 0; j < (3 - i); j++) {
				
				System.out.print("  ");
			}
			
			for (int j = 0; j < star; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
