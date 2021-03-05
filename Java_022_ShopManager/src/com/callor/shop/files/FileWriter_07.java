package com.callor.shop.files;

public class FileWriter_07 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/score.txt";
		
		RndServiceImplV1b rV1 = new RndServiceImplV1b();
		rV1.makeRnd();
		rV1.saveFileRnd(fileName);
		
	}
}
