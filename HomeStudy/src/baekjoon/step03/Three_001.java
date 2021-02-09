package baekjoon.step03;

import java.util.Scanner;

public class Three_001 {

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		
		scan.close();
		
		for(int i = 0; i < 9; i++) {
			System.out.println(inputNum + " * " + (i + 1) + " = " + (inputNum * (i + 1)));
		}
	}
}
