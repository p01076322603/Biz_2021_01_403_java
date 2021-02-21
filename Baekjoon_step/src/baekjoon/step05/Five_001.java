package baekjoon.step05;

import java.util.Scanner;

public class Five_001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[sc.nextInt()];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
		}
		
		sc.close();
		
		int max = n[0];
		int min = n[0];
		
		for(int i = 0; i < n.length; i++) {
			if (max < n[i]) {
				max = n[i];
			}
			
			if (min > n[i]) {
				min = n[i];
			}
		}
	
		System.out.println(min + " " +  max);
	}
}
