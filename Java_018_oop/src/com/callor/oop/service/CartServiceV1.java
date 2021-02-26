package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

public class CartServiceV1 {

	private List<CartVO> cartList = new ArrayList<CartVO>();
	private Scanner scan = new Scanner(System.in);
	private CartVO cartVO;

	public void inputCart() {

		for (int i = 0; i < 3; i++) {

			System.out.println("       << " + (i + 1) + "번 정보 입력 >> ");

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
					if (intQty > 1) {
						break;
					} else
						System.out.println("수량은 2개 이상만 입력가능합니다\n");
				} catch (NumberFormatException e) {
					System.out.println("수량은 숫자만 입력가능합니다\n");
					continue;
				}
			}

			// 위 주석과 동일
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
			cartVO = new CartVO();
			
			cartVO.setCartQty(intQty);
			cartVO.setCartPrice(intPrice);
			cartVO.setCartUserName(strUserName);
			cartVO.setCartPName(strPName);

			// 카트 정보 리스트에 추가하기
			cartList.add(cartVO);
		} // end for
	}

	public void printCartList() {

		// 배열은 배열.length 값을 참조하면 배열의 개수를 알 수 있었다
		// List에서는 list.size() method를 호출하면 list 개수를 return 해준다

		/* 코드의 효율성을 위해 size() method의 값을 넣은 변수를 미리 만들고
		 * for 반복문에 대입한다 (size() method를 그대로 넣으면 for 반복문이
		 * 시행될때마다 cartList의 길이를 체크하기 때문에 비효율적이다) */
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