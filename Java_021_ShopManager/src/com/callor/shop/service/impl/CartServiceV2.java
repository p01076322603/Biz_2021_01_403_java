package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV2 implements CartService {

	private Scanner scan;
	private List<CartVO> cartList;

	public CartServiceV2() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}

	public void inputCart() {

		System.out.println("<< 장바구니 상품 담기 >>");
		System.out.print("구매자를 입력하세요 >> ");
		String strUserName = scan.nextLine();

		System.out.print("상품이름을 입력하세요 >> ");
		String strProdName = scan.nextLine();

		int listSize = cartList.size();
		for (int i = 0; i < listSize; i++) {
			if (strUserName.equals(cartList.get(i).getUserName())
					&& strProdName.equals(cartList.get(i).getProductName())) {

				System.out.printf("현재 %s 고객의 장바구니에 %s 이(가) \n %d개 들어있습니다 (단가 %d원)\n", strUserName, strProdName,
						cartList.get(i).getQty(), cartList.get(i).getPrice());
				int intQty = 0;
				while (true) {
					System.out.print("추가할 상품개수를 입력하세요 >> ");
					try {
						intQty = Integer.valueOf(scan.nextLine());
						if (intQty < 1) {
							System.out.println("상품개수는 1개 이상이여야 합니다");
						} else {
							break;
						}
					} catch (Exception e) {
						System.out.println("상품개수는 1개 이상 숫자로 입력해주세요");
					}
				}

				System.out.println();

				cartList.get(i).setQty(cartList.get(i).getQty() + intQty);
				cartList.get(i).setTotal(cartList.get(i).getPrice() * cartList.get(i).getQty());
				return;
			}
		}

		int intPrice = 0;
		while (true) {
			System.out.print("상품가격을 입력하세요 >> ");
			try {
				intPrice = Integer.valueOf(scan.nextLine());
				if (intPrice < 1) {
					System.out.println("상품가격은 1원 이상이여야 합니다");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("상품가격은 1원 이상 숫자로 입력해주세요");
			}
		}

		int intQty = 0;
		while (true) {
			System.out.print("상품개수를 입력하세요 >> ");
			try {
				intQty = Integer.valueOf(scan.nextLine());
				if (intQty < 1) {
					System.out.println("상품개수는 1개 이상이여야 합니다");
				} else {
					break;
				}
			} catch (Exception e) {
				System.out.println("상품개수는 1개 이상 숫자로 입력해주세요");
			}
		}

		System.out.println();

		CartVO cartVO = new CartVO();
		cartVO.setUserName(strUserName);
		cartVO.setProductName(strProdName);
		cartVO.setPrice(intPrice);
		cartVO.setQty(intQty);
		cartVO.setTotal(intPrice * intQty);
		cartList.add(cartVO);
	}

	public void printCart() {

		int listSize = cartList.size();
		int intProdSum = 0;
		int intPriceSum = 0;
		System.out.println("<< 장바구니 리스트 >>");
		System.out.println("=============================================");
		System.out.println("구매자\t    상품명\t단가\t수량\t합계");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < listSize; i++) {
			System.out.printf("%s\t%7s\t%d\t%d\t%d\n", 
					cartList.get(i).getUserName(), 
					cartList.get(i).getProductName(),
					cartList.get(i).getPrice(), 
					cartList.get(i).getQty(), 
					cartList.get(i).getTotal());
			intProdSum++;
			intPriceSum += cartList.get(i).getTotal();
		}
		System.out.println("---------------------------------------------");
		System.out.printf("합계\t   %2d가지\t\t\t%d", intProdSum, intPriceSum);
		System.out.println("\n=============================================");
		System.out.println();
	}

	public void printIndivCart() {

		System.out.print("출력할 구매자 이름을 입력하세요 >> ");
		String strUserName = scan.nextLine();

		int listSize = cartList.size();
		int intProdSum = 0;
		int intPriceSum = 0;
		System.out.printf("\n<< 구매자 %s의 장바구니 >>\n", strUserName);
		System.out.println("=============================================");
		System.out.println("구매자\t    상품명\t단가\t수량\t합계");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < listSize; i++) {
			if (strUserName.equals(cartList.get(i).getUserName())) {
				System.out.printf("%s\t%7s\t%d\t %d\t%d\n", 
						cartList.get(i).getUserName(),
						cartList.get(i).getProductName(), 
						cartList.get(i).getPrice(), 
						cartList.get(i).getQty(),
						cartList.get(i).getTotal());
				intPriceSum += cartList.get(i).getTotal();
				intProdSum++;
			}

		}
		System.out.println("---------------------------------------------");
		System.out.printf("합계\t   %2d가지\t\t\t%d", intProdSum, intPriceSum);
		System.out.println("\n=============================================");
		System.out.println();
	}
}