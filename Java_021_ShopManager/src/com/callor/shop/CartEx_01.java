package com.callor.shop;

import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.MenuServiceV1;

public class CartEx_01 {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceV1();
		mService.selectMenu();
	}
}