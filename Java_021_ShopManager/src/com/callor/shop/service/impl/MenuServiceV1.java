package com.callor.shop.service.impl;

import java.util.Scanner;

import com.callor.shop.service.CartService;
import com.callor.shop.service.MenuService;

public class MenuServiceV1 implements MenuService {

	private Scanner scan;
	private CartService cService;

	public MenuServiceV1() {
		scan = new Scanner(System.in);
		cService = new CartServiceV1();
	}

	public void selectMenu() {

		while (true) {

			System.out.println("=============================================");
			System.out.println("빛나라 쇼핑몰 2021 V1");
			System.out.println("---------------------------------------------");
			System.out.println("1. 장바구니 상품 담기");
			System.out.println("2. 장바구니 전체 리스트 보기");
			System.out.println("3. 구매자별 장바구니 리스트 보기");
			System.out.println("QUIT. 끝내기");
			System.out.println("=============================================");

			String strMenu = scan.nextLine();

			if (strMenu.equalsIgnoreCase("Quit"))
				return;

			if (strMenu.equals("1")) {
				cService.inputCart();
			} else if (strMenu.equals("2")) {
				cService.printCart();
			} else if (strMenu.equals("3")) {
				cService.printIndivCart();
			} else
				System.out.println("메뉴 선택은 1, 2, 3, Quit만 가능합니다\n");
		}
	}
}