package com.callor.shop.files;

public class FIleWriter_06 {

	public static void main(String[] args) {
		
		String fileName = "src/com/callor/shop/files/nums_rnd.txt";
		
		RndServiceImplV2 rService = new RndServiceImplV2(fileName);
		rService.makeRnd();
		rService.saveFileRnd();
	}
}
