package baekjoon.step07;

import java.util.Scanner;

public class Seven_006 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int wordCount = 0;
		
		while (sc.hasNext()) {
			sc.next();
			wordCount++;
		}
		
		sc.close();
		System.out.println(wordCount);
	}
}