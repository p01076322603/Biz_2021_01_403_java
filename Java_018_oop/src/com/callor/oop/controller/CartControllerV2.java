package com.callor.oop.controller;

import com.callor.oop.model.CartVO;

public class CartControllerV2 {

	public static void main(String[] args) {

		CartVO[] cartVO = new CartVO[3];

		//		for (int i = 0; i < cartVO.length; i++) {
		//			cartVO[i] = new CartVO();
		//		}

		cartVO[0] = new CartVO();
		cartVO[0].setCartUserName("홍길동");
		cartVO[0].setCartDate("2021-02-26");
		cartVO[0].setCartTime("10:44:00");
		cartVO[0].setCartPName("초코파이");
		cartVO[0].setCartQty(10);
		cartVO[0].setCartStd("바나나맛");
		cartVO[0].setCartPrice(1000);
		cartVO[0].setCartTotal(1000 * 10);

		cartVO[1] = new CartVO();
		cartVO[1].setCartUserName("임꺽정");
		cartVO[1].setCartDate("2021-02-27");
		cartVO[1].setCartTime("12:46:12");
		cartVO[1].setCartPName("몽쉘");
		cartVO[1].setCartQty(5);
		cartVO[1].setCartStd("초코맛");
		cartVO[1].setCartPrice(1200);
		cartVO[1].setCartTotal(1200 * 5);

		cartVO[2] = new CartVO();
		cartVO[2].setCartUserName("장녹수");
		cartVO[2].setCartDate("2021-02-28");
		cartVO[2].setCartTime("18:33:54");
		cartVO[2].setCartPName("오예스");
		cartVO[2].setCartQty(7);
		cartVO[2].setCartStd("딸기맛");
		cartVO[2].setCartPrice(900);
		cartVO[2].setCartTotal(900 * 7);
		
		// === cartVO[] 배열의 길이가 3인 상태 ===
		// 상품 한가지를 더 카트에 넣고 싶다
		cartVO = new CartVO[4];
		
		cartVO[3] = new CartVO();
		
		cartVO[3].setCartUserName("홍길동");
		cartVO[3].setCartPName("바나나우유");

		System.out.println("================");
		System.out.println("카트 내용");
		System.out.println("----------------");

		for (int i = 0; i < cartVO.length; i++) {
			System.out.println(cartVO[i].toString());
		}
	}

}