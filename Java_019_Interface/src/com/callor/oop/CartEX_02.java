package com.callor.oop;

import com.callor.oop.service.impl.CartServiceImplV1;

public class CartEX_02 {

	public static void main(String[] args) {

		// 1. CartImplV1을 사용하여 코드 구현
		CartServiceImplV1 csIV1 = new CartServiceImplV1();
		csIV1.inputCart();
		csIV1.printCart();

		// 2. CartImplV2로 업그레이드
		/* 	  CartV1과 CartV2는 같은 interface를 impl 하였기 때문에
		 * 	  클래스만 교체해 주면 method를 호출하는 나머지 코드는
		 *    변경할 필요가 없다. */		 
		CartServiceImplV1 csIV2 = new CartServiceImplV1();
		csIV2.inputCart();
		csIV2.printCart();

	}
}
