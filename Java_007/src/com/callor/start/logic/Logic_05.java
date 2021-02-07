package com.callor.start.logic;

/* 화폐 매수 계산
 * ￦ 4,789,800
 * 오만원권 : 95매
 * 만원권 	: 3매  오만원권 / 5
 * 오천원권 : 1매  만원권   / 2
 * 천원권	: 4매  오천원권 / 5
 * 오백원	: 1개  천원권   / 2
 * 백원		: 3개  오백원권 / 5
 */  

public class Logic_05 {
	public static void main(String args[]) {
		
		int pay = 4_789_800;
		int paper = 50_000;
		int count = pay / paper;
		
		System.out.println(paper +"원권 : " + count);
		
		/* 1만원권 계산
		 * pay에서 5만원권 금액만큼 제외하고
		 * 1만원권 매수를 계산한다
		 */
		
		pay = pay - (count * paper); // 5만원권 제외금액
		paper = paper / 5;
		count = pay / paper;
		
		System.out.println((paper) + "원권 : " + count);
	
		// 5천원권 계산
		// pay에서 1만원 금액을 제외한 금액
		
		pay = pay - (count * paper);
		paper = paper / 2;
		count = pay / paper;
		
		System.out.println((paper) + "원권 : " + count);
	
		pay = pay - (count * paper);
		paper = paper / 5;
		count = pay / paper;
		
		System.out.println((paper) + "원권 : " + count);
	
		pay = pay - (count * paper);
		paper = paper / 2;
		count = pay / paper;
		
		System.out.println((paper) + "원권 : " + count);
	
		pay = pay - (count * paper);
		paper = paper / 5;
		count = pay / paper;
		
		System.out.println((paper) + "원권 : " + count);

		System.out.println();
	}
}
