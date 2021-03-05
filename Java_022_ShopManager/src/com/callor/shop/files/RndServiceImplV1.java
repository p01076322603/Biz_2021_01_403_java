package com.callor.shop.files;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RndServiceImplV1 {

	private List<Integer> intList;

	public RndServiceImplV1() {
		
		intList = new ArrayList<Integer>();
	}

	public void makeNums() {

		Random rnd = new Random();

		for (int i = 0; i < 100; i++) {
			intList.add(rnd.nextInt(1000) + 1);
		}
	}

	public void saveFileNums() {

		String numsFile = "src/com/callor/shop/files/nums.txt";
		
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);

			int printCount = 0;
			for (int rndNum : intList) {
			
				++printCount;
				
				if (printCount % 5 != 0)
					 printer.print(rndNum + ":");
				else printer.println(rndNum);
			}
			
			printer.close();
			fileWriter.close();

			System.out.println("출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
