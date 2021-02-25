package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ProductVO;

public class Product_02 {

	public static void main(String[] args) {

		ProductVO[] pVOs = new ProductVO[5];
		Scanner scan = new Scanner(System.in);

		/* VO 클래스를 배열로 선언하고 사용(데이터 저장, 읽기) 하려면
		 * 선언된 객체 배열 요소요소를 모두 다시 초기화(생성)하는 과정이 필요하다 */
		for (int i = 0; i < pVOs.length; i++) {
			pVOs[i] = new ProductVO();
		}
		// 이 과정이 생략되면 이후 코드에서 NullPointerException이 발생한다
		
		System.out.println("┌────────────────────────────────┐");
		System.out.println("|     나라쇼핑몰 상품관리 V1     |");
		System.out.println("├────────────────────────────────┤");
		System.out.println("|     상품 정보를 입력하세요     |");
		System.out.println("└────────────────────────────────┘");
		System.out.println();
		
		String strN = 3 + ""; // "3"이라는 문자열로 저장
		int intN = Integer.valueOf(strN);
		
		for (int i = 0; i < pVOs.length; i++) {
			
			// 연속된 값으로 상품 코드 생성
			String pCode = (i + 1) + "";

			pVOs[i].strPCode = pCode;
			System.out.println("┌────────────────────────────────┐");
			System.out.println("|  " + pCode + "번 상품의 정보를 입력하세요  |");
			System.out.println("└────────────────────────────────┘");
			
			System.out.print("상품명을 입력하세요 >> ");
			pVOs[i].strPName = scan.nextLine();
			
			System.out.print("거래처를 입력하세요 >> ");
			pVOs[i].strDName = scan.nextLine();
			
			System.out.print("품목명을 입력하세요 >> ");
			pVOs[i].strItem = scan.nextLine();
			
			System.out.print("매입단가를 입력하세요 >> ");
			String iPrice = scan.nextLine();
			pVOs[i].iPrice = Integer.valueOf(iPrice);
			
			System.out.print("매출단가를 입력하세요 >> ");
			pVOs[i].oPrice = Integer.valueOf(scan.nextLine());
			
			System.out.println("\n" + (i + 1) + "번 상품의 정보 확인");
			pVOs[i].toString();
			
			System.out.println();
		}
	}
}