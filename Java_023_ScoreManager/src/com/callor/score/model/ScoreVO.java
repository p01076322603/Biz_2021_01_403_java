package com.callor.score.model;

import com.callor.score.service.values.Values;

public class ScoreVO {

	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	private int intHistory;
//	private int intPhysical;
	
	private int intScoreSum;
	private float floatScoreAvg;

	private int[] arrSubjectScores = new int[Values.SUBJECT_COUNT]; // 과목별 점수를 저장할 배열

	public void subjectScoreInIt() { // 과목별 점수를 개별 인스턴스 변수에 저장
		
		intKor = arrSubjectScores[0];
		intEng = arrSubjectScores[1];
		intMath = arrSubjectScores[2];
		intMusic = arrSubjectScores[3];
		intHistory = arrSubjectScores[4];
//		intPhysical = arrSubjectScores[5];
	}
	
	public void setSubjectScores(int index, int score) {
		arrSubjectScores[index] = score;
	}
	
	public int[] getSubjectScores() {
		return arrSubjectScores;
	}
	
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntMusic() {
		return intMusic;
	}
	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}
	public int getIntHistory() {
		return intHistory;
	}
	public void setIntHistory(int intHistory) {
		this.intHistory = intHistory;
	}
	public int getIntScoreSum() {
		return intScoreSum;
	}
	public void setIntScoreSum(int intSum) {
		this.intScoreSum = intSum;
	}
	public float getFloatScoreAvg() {
		return floatScoreAvg;
	}
	public void setFloatScoreAvg(float floatAvg) {
		this.floatScoreAvg = floatAvg;
	}
	
	
	@Override
	public String toString() {
		return "ScoreVO [intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + ", intMusic=" + intMusic
				+ ", intHistory=" + intHistory + ", intSum=" + intScoreSum + ", floatAvg=" + floatScoreAvg + "]";
	}
	
}
