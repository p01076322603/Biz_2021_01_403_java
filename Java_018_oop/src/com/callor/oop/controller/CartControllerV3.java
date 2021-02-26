package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();
		CartVO cartVO;

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("|       쇼핑몰 장바구니 관리        |");
		System.out.println("└───────────────────────────────────┘");
		
		for (int i = 0; i < 3; i++) {

			System.out.println("       << " + (i + 1) + "번 정보 입력 >> ");
			
			cartVO = new CartVO();

			System.out.print("구매자 이름을 입력하세요 >> ");
			cartVO.setCartUserName(scan.nextLine());
			
			System.out.print("상품명을 입력하세요 >> ");
			cartVO.setCartPName(scan.nextLine());
			
			System.out.print("수량을 입력하세요 >> ");
			cartVO.setCartQty(Integer.valueOf(scan.nextLine()));
			
			System.out.print("가격을 입력하세요 >> ");
			cartVO.setCartPrice(Integer.valueOf(scan.nextLine()));

			System.out.println();
			cartList.add(cartVO);
		}

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("|              장바구니             |");
		System.out.println("└───────────────────────────────────┘");
		
		for (int i = 0; i < 3; i++) {
			cartVO = cartList.get(i);
			System.out.printf("%s\t%7s\t%d\t%d\n",
					cartVO.getCartUserName(), cartVO.getCartPName(),
					cartVO.getCartQty(), cartVO.getCartPrice());
		}
	}
}