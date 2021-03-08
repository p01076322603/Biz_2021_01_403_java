package com.callor.iolist;

import com.callor.iolist.service.ListService;

public class ioListEx_01 {

	public static void main(String[] args) {
		
		ListService lService = new ListService();
		
		lService.makeIoList();
		lService.printIoData();
	}
}
