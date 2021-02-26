package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV3b {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		List<CartVO> cartList = new ArrayList<CartVO>();
		CartVO cartVO;

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("|       쇼핑몰 장바구니 관리        |");
		System.out.println("└───────────────────────────────────┘");

		for (int i = 0; i < 3; i++) {

			System.out.println("       << " + (i + 1) + "번 정보 입력 >> ");

			System.out.print("구매자 이름을 입력하세요 >> ");
			String strUserName = scan.nextLine();

			System.out.print("상품명을 입력하세요 >> ");
			String strPName = scan.nextLine();

			System.out.print("수량을 입력하세요 >> ");
			String strQTy = scan.nextLine();
			int intQTy = Integer.valueOf(strQTy);

			System.out.print("가격을 입력하세요 >> ");
			String strPrice = scan.nextLine();
			int intPrice = Integer.valueOf(strPrice);

			System.out.println();

			// 카트 정보 생성
			cartVO = new CartVO();
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);
			cartVO.setCartQty(intQTy);
			cartVO.setCartPrice(intPrice);

			// 카트 정보 리스트에 추가하기
			cartList.add(cartVO);
		} // end for

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("|              장바구니             |");
		System.out.println("└───────────────────────────────────┘");

		// 배열은 배열.length 값을 참조하면 배열의 개수를 알 수 있었다
		// List에서는 list.size() method를 호출하면 list 개수를 return 해준다
		
		int nSize = cartList.size();
		for (int i = 0; i < nSize; i++) {
			System.out.printf("%s\t%7s\t%d\t%d\n", 
					cartList.get(i).getCartUserName(),
					cartList.get(i).getCartPName(),
					cartList.get(i).getCartQty(),
					cartList.get(i).getCartPrice());
		}
	}
}