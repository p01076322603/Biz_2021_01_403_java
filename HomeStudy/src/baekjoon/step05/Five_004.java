
// WIP

package baekjoon.step05;

import java.util.Scanner;

public class Five_004 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int dupeCount = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (sc.nextInt() % 42);
		}

		sc.close();

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					++dupeCount;
					break;
				}
			}
		}
	
		System.out.println(dupeCount);
	}
}
