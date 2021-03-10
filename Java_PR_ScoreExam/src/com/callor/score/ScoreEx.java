package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;
import com.callor.score.values.Values;

public class ScoreEx {

    public static void main(String[] args) {

	String fileName = "src/com/callor/score/data/score.txt";

	ScoreService sService = new ScoreServiceImplV1(fileName);
	MenuService mService = new MenuServiceImplV1();

	while (true) {

	    Integer intMenu = mService.selectMenu();

	    if (intMenu == null)
		return;

	    if (intMenu == Values.SCORE_TO_LIST) {
		sService.saveScoreToList();
	    } else if (intMenu == Values.LIST_TO_FILE) {
		sService.makeScoreToFile();
	    } else if (intMenu == Values.PRINT_SCORE) {
		sService.printScoreList();

	    } else
		System.out.printf("메뉴는 %d ~ %d, Quit 중에 선택해주세요\n\n", 
			Values.MENU_FIRST, Values.MENU_LAST);
	}
    }
}