package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV1 implements CartService {

	private Scanner scan;
	private List<CartVO> cartList;

	public CartServiceV1() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
	}

	public void inputCart() {

		System.out.print("구매자를 입력하세요 >> ");
		String strUserName = scan.nextLine();

		System.out.print("상품이름을 입력하세요 >> ");
		String strProdName = scan.nextLine();

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
		int intPriceSum = 0;

		System.out.println("=============================================");
		System.out.println("구매자\t    상품명\t단가\t수량\t합계");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < listSize; i++) {
			printCartList(i);
			intPriceSum += cartList.get(i).getTotal();
		}
	
		System.out.println("---------------------------------------------");
		System.out.printf("합계\t   %2d가지\t\t\t%d", listSize, intPriceSum);
		System.out.println("\n=============================================\n\n");
	}

	public void printIndivCart() {

		System.out.print("출력할 구매자 이름을 입력하세요 >> ");
		String strUserName = scan.nextLine();

		int listSize = cartList.size();
		int intPriceSum = 0;
		int intProdCount = 0;

		System.out.println("=============================================");
		System.out.println("구매자\t    상품명\t단가\t수량\t합계");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < listSize; i++) {
			if (strUserName.equals(cartList.get(i).getUserName())) {
				printCartList(i);
				intPriceSum += cartList.get(i).getTotal();
				intProdCount++;
			}
		}

		System.out.println("---------------------------------------------");
		System.out.printf("합계\t   %2d가지\t\t\t%d", intProdCount, intPriceSum);
		System.out.println("\n=============================================\n");
	}

	public void printCartList(int index) {
		System.out.printf("%s\t%7s\t%d\t %d\t%d\n", 
				cartList.get(index).getUserName(), 
				cartList.get(index).getProductName(),
				cartList.get(index).getPrice(), 
				cartList.get(index).getQty(), 
				cartList.get(index).getTotal());
	}

	@Override
	public void removeCart() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCartAll() {
		// TODO Auto-generated method stub
		
	}

}