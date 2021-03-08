package com.callor.score;

import java.util.Random;

public class Lottos_01 {

	public static void main(String[] args) {

		int[] nums = new int[45];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = i + 1;
		}

		Random rnd = new Random();

		for (int i = 0; i < 1024; i++) {

			int num1 = rnd.nextInt(45);
			int num2 = rnd.nextInt(45);

			int tmp = nums[num1];
			nums[num1] = nums[num2];
			nums[num2] = tmp;
		}

		int nCount = 0;
		for (int n : nums) {
			System.out.print(n + "\t");
			if (++nCount % 5 == 0)
				System.out.println();
		}

		System.out.println();
		System.out.println();

		int lottos[] = new int[6];
		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = nums[i];
		}

		for (int i = 0; i < lottos.length; i++) {
			for (int j = i + 1; j < lottos.length; j++) {
				if (lottos[i] > lottos[j]) {
					int temp = lottos[j];
					lottos[j] = lottos[i];
					lottos[i] = temp;
				}
			}
		}
		
		nCount = 0;
		System.out.print("{");
		for (int i = 0; i < lottos.length - 1; i++) {
			
		System.out.print(lottos[i] + ", ");
		}
		System.out.print(lottos[lottos.length - 1] + "}");

	}
}
