package com.callor.score.service;

import com.callor.score.model.ScoreVO;

public class ScoreServiceV2 {
	
	public int scoreSum(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}
	
	public int scoreSum(ScoreVO scoreVO) {
		int sum = scoreVO.intKor
				+ scoreVO.intEng
				+ scoreVO.intMath
				+ scoreVO.intMusic
				+ scoreVO.intHistory;
		return sum;
	}
}
