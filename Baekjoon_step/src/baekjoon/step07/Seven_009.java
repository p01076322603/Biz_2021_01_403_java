package baekjoon.step07;

import java.util.Scanner;

public class Seven_009 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		scan.close();

		int length = str.length();
		
		for (int i = 0; i < str.length() - 1; i++) {
			if      (str.charAt(i) == 'c' && str.charAt(i + 1) == '=') --length;
			else if (str.charAt(i) == 'c' && str.charAt(i + 1) == '-') --length;
			else if (str.charAt(i) == 'd' && str.charAt(i + 1) == '-') --length;
			else if (str.charAt(i) == 'l' && str.charAt(i + 1) == 'j') --length;
			else if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'j') --length;
			else if (str.charAt(i) == 's' && str.charAt(i + 1) == '=') --length;
			else if (str.charAt(i) == 'z' && str.charAt(i + 1) == '=') --length;
		}
		
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'd' && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') --length;
		}
		
		System.out.println(length);
	}
}