package com.github.p01076322603.book;

public class Triangle_02 {

	public static void main(String args[]) {

		int star = -1;

		for (int i = 0; i < 7; i++) {

			if (i < 4) {
				
				star = star + 2;

				for (int j = 0; j < (7 - star); j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < star; j++) {
					System.out.print("* ");
				}

			} else {
				
				star = star - 2;

				for (int j = 0; j < (7 - star); j++) {
					System.out.print(" ");
				}

				for (int j = 0; j < star; j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
