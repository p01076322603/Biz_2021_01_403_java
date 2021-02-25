package com.callor.oop;

import java.util.Random;

public class ToString_01 {

	public static void main(String[] args) {
		
		Random rnd1 = new Random();
		Random rnd2 = new Random();
		Random rnd3 = new Random();
		
		int num = 30;
		System.out.println("num : " + num);
		
		Integer num1 = 30;
		System.out.println("num : " + num1.toString());
		
		System.out.println(rnd1);
		System.out.println(rnd2);
		System.out.println(rnd3.toString());
	}
}
