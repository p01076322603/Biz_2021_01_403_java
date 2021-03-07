package com.callor.score.model;

public class ScoreVO {

	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	private int intHistory;
	
	private int intScoreSum;
	private float floatScoreAvg;

	
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
