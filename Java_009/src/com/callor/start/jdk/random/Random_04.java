package com.callor.start.jdk.random;
import java.util.Random;

public class Random_04 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int rndNum = (rnd.nextInt(100) + 1); // 1 ~ 100

		if (rndNum % 2 == 0) {
			System.out.println(rndNum + " : 짝수");
		} else {
			System.out.println(rndNum + " : 홀수");
		}
	}
}
