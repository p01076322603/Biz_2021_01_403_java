package com.callor.score.model;

public class ScoreVO {

	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	private int intHistory;
	
	private int intSum;
	private float floatAvg;
	
	
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
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	
	
	@Override
	public String toString() {
		return "ScoreVO [intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + ", intMusic=" + intMusic
				+ ", intHistory=" + intHistory + ", intSum=" + intSum + ", floatAvg=" + floatAvg + "]";
	}
	
}
