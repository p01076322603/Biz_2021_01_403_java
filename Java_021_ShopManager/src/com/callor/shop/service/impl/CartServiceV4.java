package com.callor.shop.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartService;

public class CartServiceV4 implements CartService {

	private Scanner scan;
	private List<CartVO> cartList;

	public CartServiceV4() {
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
			
			CartVO cartVO = cartList.get(i);
			
			if (strUserName.equals(cartVO.getUserName())
					&& strProdName.equals(cartVO.getProductName())) {

				System.out.printf("현재 %s 고객의 장바구니에 %s 이(가) \n"
						+ " %d개 들어있습니다 (단가 %d원)\n", 
						strUserName, strProdName,
						cartVO.getQty(), 
						cartVO.getPrice());
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

				cartVO.setQty(cartVO.getQty() + intQty);
				cartVO.setTotal(cartVO.getPrice() * cartVO.getQty());
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
		
		Collections.sort(cartList);
	}

	public void printCart() {

		int listSize = cartList.size();
		int intPriceSum = 0;

		if (listSize == 0) {
			System.out.println("장바구니가 비어있습니다\n");
			return;
		}

		System.out.println("<< 장바구니 리스트 >>");
		this.printHeader();
		
		for (int i = 0; i < listSize; i++) {
		
			CartVO cartVO = cartList.get(i);
			
			System.out.printf("%s\t%7s\t%d\t%d\t%d\n", 
					cartVO.getUserName(), 
					cartVO.getProductName(),
					cartVO.getPrice(), 
					cartVO.getQty(), 
					cartVO.getTotal());
			intPriceSum += cartVO.getTotal();
		}
		System.out.println("---------------------------------------------");
		System.out.printf("합계\t   %2d가지\t\t\t%d", listSize, intPriceSum);
		System.out.println("\n=============================================");
		System.out.println();
	}

	public void printIndivCart() {

		System.out.print("출력할 구매자 이름을 입력하세요 >> ");
		String strUserName = scan.nextLine();

		int listSize = cartList.size();
		boolean bAvaliable = false;

		for (int i = 0; i < listSize; i++) {
			if (strUserName.equals(cartList.get(i).getUserName())) {
				bAvaliable = false;
				break;
			} else bAvaliable = true;
		}
		if (bAvaliable == true || listSize == 0) {
			System.out.println(strUserName + " 고객이 존재하지 않습니다\n");
			return;
		}
		
		int intProdCount = 0;
		int intPriceSum = 0;
		
		System.out.printf("\n<< 구매자 %s의 장바구니 >>\n", strUserName);
		this.printHeader();
		
		for (int i = 0; i < listSize; i++) {
			
			CartVO cartVO = cartList.get(i);
			
			if (strUserName.equals(cartVO.getUserName())) {
				System.out.printf("%s\t%7s\t%d\t %d\t%d\n", 
						cartVO.getUserName(),
						cartVO.getProductName(), 
						cartVO.getPrice(), 
						cartVO.getQty(),
						cartVO.getTotal());
				intProdCount++;
				intPriceSum += cartVO.getTotal();
			}

		}
		System.out.println("---------------------------------------------");
		System.out.printf("합계\t   %2d가지\t\t\t%d", intProdCount, intPriceSum);
		System.out.println("\n=============================================");
		System.out.println();
	}

	public void removeCart() {

		while (true) {

			int listSize = cartList.size();
			int intProdCount = 0;
			int intPriceSum = 0;
			int listCount = 0;

			if (listSize == 0) {
				System.out.println("장바구니가 비어있습니다\n");
				return;
			}

			System.out.println("<< 장바구니 삭제하기 >>");
			this.printHeader();
			
			for (int i = 0; i < listSize; i++) {
				
				CartVO cartVO = cartList.get(i);

				System.out.printf("%d. %s  %3s\t%d\t %d\t%d\n", ++listCount, 
						cartVO.getUserName(),
						cartVO.getProductName(), 
						cartVO.getPrice(), 
						cartVO.getQty(),
						cartVO.getTotal());
				intProdCount++;
				intPriceSum += cartVO.getTotal();
			}

			System.out.println("---------------------------------------------");
			System.out.printf("합계\t   %2d가지\t\t\t%d", intProdCount, intPriceSum);
			System.out.println("\n=============================================");

			int intDelCartNum = 0;

			System.out.println("( Quit : 취소 )");
			System.out.print("삭제할 장바구니 번호를 선택하세요 >> ");
			String strDelCartNum = scan.nextLine();

			if (strDelCartNum.equalsIgnoreCase("Quit"))
				return;
			try {
				intDelCartNum = Integer.valueOf(strDelCartNum);
				if (intDelCartNum < 1 || intDelCartNum > listSize) {
					System.out.println("올바른 번호를 입력해주세요\n");
				}
			} catch (Exception e) {
				System.out.println("번호는 정수로 입력해주세요\n");
			}

			System.out.printf("\n%s 고객의 장바구니에서\n" + " %s 을(를) 삭제했습니다\n\n",
					cartList.get(intDelCartNum - 1).getUserName(), 
					cartList.get(intDelCartNum - 1).getProductName());
			cartList.remove(intDelCartNum - 1);
		}
	}

	public void removeCartAll() {

		System.out.println("장바구니가 초기화 되었습니다\n");
		cartList.clear();
	}

	public void printHeader() {
		System.out.println("=============================================");
		System.out.println("구매자\t    상품명\t단가\t수량\t합계");
		System.out.println("---------------------------------------------");
	}	


}