package baekjoon.step07;

import java.util.Scanner;

public class Seven_005 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = new String(scan.next());

		scan.close();
		
		int[] arr = new int[26];
		int max = arr[0];
		int maxArrayLocation = 0;
		int maxCount = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) > 90) arr[str.charAt(i) - ('A' + 32)] += 1;
			else arr[str.charAt(i) - 'A'] += 1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) max = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				maxArrayLocation = i;
				++maxCount;
			}
		}
		
		if (maxCount > 1) System.out.print('?');
		else System.out.print((char) (maxArrayLocation + 'A'));
	}
}