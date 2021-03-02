package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV1;

public class CartControllerV5 {

	public static void main(String[] args) {

		CartServiceV1 csV1 = new CartServiceV1();
	
		csV1.inputCart(); // 상품정보를 키보드로 입력받은 후 cartList에 추가	 
		csV1.printCartList(); // cartList 출력
	}
}
