package aclass.two;

import java.util.Scanner;

// 문제 제목 : 직사각형에서 탈출
public class Q1085 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
			int x = scan.nextInt(); int y = scan.nextInt();
			int w = scan.nextInt(); int h = scan.nextInt();
			
			int[] arr = {x, y, w - x, h - y};
			int min = arr[0];

			for (int i = 0; i < 4; i++) {
				if (min > arr[i]) min = arr[i];
			}
			scan.close();
			System.out.println(min);
	}
}
