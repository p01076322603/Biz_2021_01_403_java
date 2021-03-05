package com.callor.score;

import com.callor.score.service.MenuService;
import com.callor.score.service.ScoreService;
import com.callor.score.service.impl.MenuServiceImplV1;
import com.callor.score.service.impl.ScoreServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {

		String fileName = "src/com/callor/score/score.txt";
		
		MenuService mService = new MenuServiceImplV1();
		ScoreService sService = new ScoreServiceImplV1(fileName);

		while (true) {
			Integer intMenu = mService.selectMenu();

			if (intMenu == null)
				return;

			if (intMenu == 1) {
				sService.makeScore();
			} else if (intMenu == 2) {
				sService.saveScoreToFile();
			} else if (intMenu == 3) {
				sService.loadScoreFromFile();
			}
		}
	}
}
