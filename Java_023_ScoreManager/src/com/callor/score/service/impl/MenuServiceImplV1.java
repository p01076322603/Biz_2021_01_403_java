package com.callor.score.service.impl;

import java.util.Scanner;
import com.callor.score.service.MenuService;
import com.callor.score.service.values.Values;

public class MenuServiceImplV1 implements MenuService {

	Scanner scan;
	
	public MenuServiceImplV1() {
		scan = new Scanner(System.in);
	}
	
	public Integer selectMenu() {

		while (true) {

			System.out.println("=============================================================");
			System.out.println("빛나라 고교 성적처리 시스템");
			System.out.println("-------------------------------------------------------------");
			System.out.printf("%d. 학생성적 점수 생성\n", Values.MAKE_SCORE);
			System.out.printf("%d. 학생성적 점수 파일에 저장\n", Values.SAVE_SCORE);
			System.out.printf("%d. 성적결과 확인\n", Values.LOAD_SCORE);
			System.out.println("QUIT. 끝내기");
			System.out.println("=============================================================");
			System.out.print("메뉴를 선택하세요 >> ");

			String strMenu = scan.nextLine();
			
			// QUIT - 종료
			if (strMenu.equalsIgnoreCase("QUIT")) {
				System.out.println("성적처리 시스템을 종료합니다");
				return null;
			}

			// 유효성 검사 - 정수
			Integer intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.printf("메뉴는 %d ~ %d, QUIT 중에 선택해주세요\n\n",
						Values.MENU_FIRST, Values.MENU_LAST);
				continue;
			} 
			
			// 유효성 검사 - 메뉴 번호 범위
			if (intMenu >= Values.MENU_FIRST && intMenu <= Values.MENU_LAST) {
				return intMenu;
			} else System.out.printf("메뉴는 %d ~ %d, QUIT 중에 선택해주세요\n\n",
					Values.MENU_FIRST, Values.MENU_LAST);
		}

	}

}