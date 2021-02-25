package com.callor.oop;

import java.util.Scanner;
import com.callor.oop.model.ProductVO;

public class Product_01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ProductVO pVO = new ProductVO();
		
		System.out.println("┌────────────────────────────────┐");
		System.out.println("|  상품정보 등록(입력) 시스템V1  |");
		System.out.println("├────────────────────────────────┤");
		System.out.println("|     상품 정보를 입력하세요     |");
		System.out.println("└────────────────────────────────┘");
		System.out.print("상품코드를 입력하세요 >> ");
		pVO.strPCode = scan.nextLine();
		
		System.out.print("상품명을 입력하세요 >> ");
		pVO.strPName = scan.nextLine();
		
		System.out.print("거래처를 입력하세요 >> ");
		pVO.strDName = scan.nextLine();
		
		System.out.print("품목명을 입력하세요 >> ");
		pVO.strItem = scan.nextLine();
		
		System.out.print("매입단가를 입력하세요 >> ");
		pVO.iPrice = Integer.valueOf(scan.nextLine());
		
		System.out.print("매출단가를 입력하세요 >> ");
		pVO.oPrice = Integer.valueOf(scan.nextLine());

		pVO.toString();
	}
}