package com.callor.shop.files;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class FileWriter_01 {

	private Random rnd;
	private String numsFile;

	public FileWriter_01() {

		rnd = new Random();
		numsFile = "src/com/callor/shop/nums.txt";
	}

	public int[] makeRndNumArr() {

		int[] numArr = new int[100];

		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = rnd.nextInt(1000) + 1;
		}

		return numArr;
	}

	public void saveFileNums() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(numsFile);
			printer = new PrintWriter(fileWriter);

			int[] rndArr = makeRndNumArr();

			for (int rndNum : rndArr) {
				printer.println(rndNum);
			}

			printer.close();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		FileWriter_01 fileWriter = new FileWriter_01();
		fileWriter.makeRndNumArr();
		fileWriter.saveFileNums();
	}
}