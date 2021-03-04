package com.callor.shop;

import com.callor.shop.service.MenuService;
import com.callor.shop.service.impl.MenuServiceV2;

public class CartEx_02 {

	public static void main(String[] args) {
		
		MenuService mService = new MenuServiceV2();
		mService.selectMenu();
	}
}