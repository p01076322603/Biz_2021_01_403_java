package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileWriter_03 {

	public static void main(String[] args) {

		String numsFile = "src/com/callor/shop/files/nums.txt";
		Random rnd = new Random();
		
		// 리스트를 만들어서 난수를 저장하기
		List<Integer> intList = new ArrayList<Integer>();
		
		for (int i = 0; i < 100; i++) {
			Integer num = rnd.nextInt(1000) + 1;
			intList.add(num);
			
			intList.add(rnd.nextInt(1000) + 1);
		}
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);

			// intList에 보관된 리스트를 향상된 for로 반복하면서 파일에 출력
			for (Integer n : intList) {
				printer.println(n);
			}
			
			int nSize = intList.size();
			for (int i = 0; i < nSize; i++) {
				Integer n = intList.get(i);
				printer.println(n);
			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("출력되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}