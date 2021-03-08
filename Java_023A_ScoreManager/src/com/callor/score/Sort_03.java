package com.callor.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sort_03 {

	public static void main(String[] args) {
		
		List<Integer> intList = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for (int i = 0; i < 10; i++) {
			Integer num = rnd.nextInt(100) + 1;
			intList.add(num);
		}
		
//		intList.sort(null);

		int nSize = intList.size();
		for (int i = 0; i < nSize; i++) {
			for (int j = i + 1; j < nSize; j++) {
				
				if (intList.get(i) > intList.get(j)) {
				int tmp = intList.get(i);
				intList.set(i, intList.get(j));
				intList.set(j, tmp);
				}
			}
		}
		System.out.println(intList.toString());
	}
}
