package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.PrintWriter;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;

public class CartServiceImplV3 extends CartServiceImplV1 implements CartServiceV2 {

	private String cartFileName;

	public CartServiceImplV3() {
		cartFileName = "src/com/callor/shop/cartList.csv";
	}

	public void saveCartToFile() {
		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			
			fileWriter = new FileWriter(cartFileName);
			printer = new PrintWriter(fileWriter);
			
//			printer.println("대한민국");
//			printer.println("우리나라");
//			printer.println("Republic of Korea");
			
			int nSize = super.cartList.size();
			for (int i = 0; i < nSize; i++) {
				
				CartVO cartVO = super.cartList.get(i);
				printer.printf("%s,%s,%d,%d,%d\n",
						cartVO.getUserName(),
						cartVO.getProductName(),
						cartVO.getQty(),
						cartVO.getPrice(),
						cartVO.getTotal());
			}
			
			printer.close();
			fileWriter.close();
			
		} catch (Exception e) {

		}
	}

	public void loadCartFromFile() {
		
	}
	
}
