package com.callor.score.model;

public class ScoreVO {

    private String studentID;
    private int intKor;
    private int intEng;
    private int intMath;
    private int intMusic;

    private int scoreSum;
    private float scoreAvg;
    
    
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID = studentID;
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
    public int getScoreSum() {
        return scoreSum;
    }
    public void setScoreSum(int scoreSum) {
        this.scoreSum = scoreSum;
    }
    public float getScoreAvg() {
        return scoreAvg;
    }
    public void setScoreAvg(float scoreAvg) {
        this.scoreAvg = scoreAvg;
    }
   
    @Override
    public String toString() {
	return "ScoreVO [studentID=" + studentID + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
		+ ", intMusic=" + intMusic + ", scoreSum=" + scoreSum + ", scoreAvg=" + scoreAvg + "]";
    }

    
}
