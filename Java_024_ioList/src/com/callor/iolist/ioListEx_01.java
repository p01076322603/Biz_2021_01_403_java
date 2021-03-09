package com.callor.iolist;

import com.callor.iolist.service.ListServiceV2;

public class ioListEx_01 {

	public static void main(String[] args) {
		
		ListServiceV2 lService = new ListServiceV2();
		
		lService.maketradeList();
		lService.printTradeList();
	}
}
