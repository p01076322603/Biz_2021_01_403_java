package com.github.p01076322603;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueString {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] arr = str.split("");

		scan.close();
		System.out.println(Arrays.toString(arr));

		int rareArray = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
			
				if (arr[i].equals(arr[j])) {
					arr[i] = ":";
					--rareArray;
				}
			}
		}
		
		String[] rare = new String[rareArray];
	
		for (int i = 0; i < rare.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			
				if (arr[j].equals(":")) continue;
				else {
					rare[i] = arr[j];
					arr[j] = ":";
					break;
				}
			}
		}

		Arrays.fill(arr, null);
		System.out.println(Arrays.toString(rare));
	}
}