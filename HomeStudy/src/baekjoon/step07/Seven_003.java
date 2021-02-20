package baekjoon.step07;

import java.util.Scanner;

public class Seven_003 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = new String(scan.nextLine());
		int[] arr = new int[26];
		
		scan.close();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (arr[Integer.valueOf(str.charAt(i) - 'a')] == -1)
				arr[Integer.valueOf(str.charAt(i) - 'a')] = i;
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}