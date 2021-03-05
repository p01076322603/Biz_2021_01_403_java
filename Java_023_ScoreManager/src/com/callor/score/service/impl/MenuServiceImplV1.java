package com.callor.score.service.impl;

import java.util.Scanner;
import com.callor.score.service.MenuService;

public class MenuServiceImplV1 implements MenuService {

	Scanner scan;
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	public Integer selectMenu() {

		while (true) {

			System.out.println("===========================================");
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println("-------------------------------------------");
			System.out.println("1. 학생성적 점수 생성");
			System.out.println("2. 학생성적 점수 파일에 저장");
			System.out.println("3. 성적결과 확인");
			System.out.println("QUIT. 끝내기");
			System.out.println("=========================================== ");
			System.out.print("선택 >> ");

			String strMenu = scan.nextLine();
			if (strMenu.equalsIgnoreCase("QUIT")) return null;

			Integer intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴는 1 ~ 3, QUIT 중에 선택해주세요");
				continue;
			} 
			
			if (intMenu >= 1 && intMenu <= 3) {
				return intMenu;
			} else System.out.println("메뉴는 1 ~ 3, QUIT 중에 선택해주세요");
		}
	}
}