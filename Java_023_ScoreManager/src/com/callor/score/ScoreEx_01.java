package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.service.values.Values;

public class ScoreEx_01 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/score.txt";

		/* 매개변수가 없는 기본 생성자로 인스턴스 생성시 기본 생성자에 
		 * 미리 설정된 경로가 fileName 인스턴스 변수에 저장된다 */
		ScoreService sService = new ScoreServiceImplV1(fileName);
		MenuService mService = new MenuServiceImplV1();

		while (true) {
			// MenuServiceImplV1에서 intMenu가 유효성 검사를 마치고 넘어온다
			Integer intMenu = mService.selectMenu();

			if (intMenu == null)
				return;

			if (intMenu == Values.MAKE_SCORE) {
				sService.makeScore();
			} else if (intMenu == Values.SAVE_SCORE) {
				sService.saveScoreToFile();
			} else if (intMenu == Values.LOAD_SCORE) {
				sService.loadScoreFromFile();
	
				// MenuServiceImplV1에서 유효성 검사 실패시 메뉴를 다시 호출
			} else System.out.printf("메뉴는 %d ~ %d, QUIT 중에 선택해주세요\n\n",
					Values.MENU_FIRST, Values.MENU_LAST); 
		}
	
	}

}