package com.callor.shop.files;

public class FileWriter_05b {

	public static void main(String[] args) {

		RndServiceImplV1b rService = new RndServiceImplV1b();
		rService.makeRnd();
		rService.saveFileRnd();
		
	}
}
