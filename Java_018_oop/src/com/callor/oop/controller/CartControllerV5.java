package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {

	public static void main(String[] args) {

		CartServiceV1 csV1 = new CartServiceV1();
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("|       쇼핑몰 장바구니 관리        |");
		System.out.println("└───────────────────────────────────┘");
		csV1.inputCart(); // 상품정보를 키보드로 입력받은 후 cartList에 추가	 
		
		System.out.println("┌───────────────────────────────────┐");
		System.out.println("|              장바구니             |");
		System.out.println("└───────────────────────────────────┘");
		csV1.printCartList(); // cartList 출력
	}
}
