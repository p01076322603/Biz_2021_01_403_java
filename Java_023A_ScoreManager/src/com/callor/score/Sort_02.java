package com.callor.score;

import java.util.Random;

public class Sort_02 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int[] nums = new int[20];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}
		
		int nCount = 0;
		System.out.print("정렬하기 전 : \n");
		for (int n : nums) {
			System.out.print(n + "\t");
			if (++nCount % 5 == 0) System.out.println();
		}
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		System.out.println();
		
		nCount = 0;
		System.out.print("정렬하기 후 : \n");
		for (int n : nums) {
			System.out.print(n + "\t");
			if (++nCount % 5 == 0) System.out.println();
		}
	}
}
