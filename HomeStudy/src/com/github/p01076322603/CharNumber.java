package com.github.p01076322603;

public class CharNumber {

	public static void main(String args[]) {

		int charNum = 0;
		
		for(int i = 0; i < 200; i++) {

			if(i % 6 == 0) {
				System.out.println();
			}
			System.out.print(i + ". " + (char)charNum + "\t");
			charNum++;
		}
	}
}