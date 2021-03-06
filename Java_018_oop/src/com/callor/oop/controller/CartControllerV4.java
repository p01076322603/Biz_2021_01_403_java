package com.callor.oop.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartControllerV4 {

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
			String strUserName = scan.nextLine();

			System.out.print("상품명을 입력하세요 >> ");
			String strPName = scan.nextLine();

			/* 데이터를 키보드로 입력받는 부분과 VO에 담아 리스트에 추가
			 * 하는 부분을 분리하여 코딩 할 경우 키보드에서 입력한 값을
			 * 정수로 변환하여 값을 담아둘 intQty 변수를 while() 실행 
			 * 이전에 선언 해두어야 한다 */
			
			int intQty = 0;
			while (true) {
				System.out.print("수량을 입력하세요 >> ");
				String strQty = scan.nextLine();
				try {
					intQty = Integer.valueOf(strQty);					
					if (intQty > 0) {
						break;
					} else
						System.out.println("수량은 1개 이상만 입력가능합니다\n");
				} catch (NumberFormatException e) {
					System.out.println("수량은 숫자만 입력가능합니다\n");
					continue;
				}
			}

			int intPrice = 0;
			while (true) {
				System.out.print("가격을 입력하세요 >> ");
				String strPrice = scan.nextLine();
				try {
					intPrice = Integer.valueOf(strPrice);
					if (intPrice < 1000)
						System.out.println("가격은 1000원 이상만 입력가능합니다\n");
					else {
						break;
					}
				} catch (NumberFormatException e) {
					System.out.println("가격은 숫자만 입력가능합니다\n");
					continue;
				}
			}
			
			System.out.println();

			// 카트 정보 생성
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);

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