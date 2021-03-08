package com.callor.score;

public class Sort_01 {

	public static void main(String[] args) {

		int[] nums = { 7, 2, 4, 3, 1 }; // ──> { 1, 2, 3, 4, 7 }

		// 정렬 전
		System.out.print("정렬하기 전 : ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();

		// 오름차순 정렬
		for (int i = 0; i < nums.length; i++) {
			for (int j = i; j < nums.length - 1; j++) {

				if (nums[i] > nums[j + 1]) {
					int tmp = nums[i];
					nums[i] = nums[j + 1];
					nums[j + 1] = tmp;
				}
			}
		}

		// 정렬 후
		System.out.print("정렬하기 후 : ");
		for (int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println();

		int[] nums2 = { 7, 2, 4, 3, 1 }; // ──> { 7, 4, 3, 2, 1 }

		// 정렬 전
		System.out.print("정렬하기 전 : ");
		for (int num : nums2) {
			System.out.print(num + " ");
		}
		System.out.println();

		// 내림차순 정렬
		for (int i = 0; i < nums2.length; i++) {
			for (int j = i + 1; j < nums2.length; j++) {
				if (nums2[i] < nums2[j]) {
					int temp = nums2[j];
					nums2[j] = nums2[i];
					nums2[i] = temp;
				}
			}
		}

		// 정렬 후
		System.out.print("정렬하기 후 : ");
		for (int num : nums2) {
			System.out.print(num + " ");
		}
	}
}