package com.callor.oop;

import com.callor.oop.service.MenuService;
import com.callor.oop.service.impl.MenuServiceImplV1;

public class CartEx_05 {

	public static void main(String[] args) {
	
		MenuService mService = new MenuServiceImplV1();
		mService.selectMenu();
		
	}
}
