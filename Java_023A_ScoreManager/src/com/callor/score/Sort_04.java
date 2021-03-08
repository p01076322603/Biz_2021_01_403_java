package com.callor.score;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;

public class Sort_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();

		for (int i = 0; i < 10; i++) {
			int sum = 0;
			int[] subs = new int[5];
			for (int j = 0; j < subs.length; j++) {
				subs[j] = rnd.nextInt(100) + 1;
				sum += subs[j];
			}
			float avg = (float) sum / 5;
			ScoreVO score = new ScoreVO(String.format("%05d", i + 1), 
					Integer.valueOf(subs[0]),
					Integer.valueOf(subs[1]), 
					Integer.valueOf(subs[2]), 
					Integer.valueOf(subs[3]),
					Integer.valueOf(subs[4]));
			score.setTotal(sum);
			score.setAvg(avg);
			scoreList.add(score);
		}

		for (ScoreVO score : scoreList) {
			System.out.println(score);
		}

		int nSize = scoreList.size();
		for (int i = 0; i < nSize; i++) {
			for (int j = i + 1; j < nSize; j++) {
				ScoreVO score_i = scoreList.get(i);
				ScoreVO score_j = scoreList.get(j);

				// total 값을 비교하여 scoreList의 score 요소를 서로 교환하기
				if (score_i.getTotal() < score_j.getTotal()) {

					ScoreVO t = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, t);
				}
			}
		}

		/* 총점순으로 내림차순 정렬된 리스트의 각 객체의
		 * rank 변수에 순서대로 저장 */
		for (int i = 0; i < nSize; i++) {
			scoreList.get(i).setRank(i + 1);
		}

		System.out.println("\n정렬 후 : ");
		for (ScoreVO score : scoreList) {
			System.out.println(score);
		}

	}
}