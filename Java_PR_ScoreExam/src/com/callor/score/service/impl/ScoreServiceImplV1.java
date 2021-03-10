package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

    private List<ScoreVO> scoreList;
    private String fileName;

    public ScoreServiceImplV1() {
	this("src/com/callor/score/data/score.txt");
    }

    public ScoreServiceImplV1(String fileName) {
	this.fileName = fileName;
	scoreList = new ArrayList<ScoreVO>();
    }

    public void saveScoreToList() {

	Scanner scan = new Scanner(System.in);

	while (true) {

	    System.out.println("\n( 종료 : Quit )");
	    System.out.print("학번을 입력하세요 >> ");
	    String studentID = scan.nextLine();

	    if (studentID.equalsIgnoreCase("Quit")) {
		System.out.println("성적 관리 시스템을 종료합니다\n");
		return;
	    }

	    boolean isBreak = false;
	    for (ScoreVO student : scoreList) {
		if (student.getStudentID().equals(studentID)) {
		    System.out.println("동일한 학번을 가진 학생이 이미 존재합니다");
		    isBreak = true;
		    break;
		}
	    }

	    if (isBreak == true) {
		continue;
	    }

	    int intKor = 0;
	    while (true) {
		System.out.print("국어 점수를 입력하세요 >> ");

		try {
		    intKor = Integer.valueOf(scan.nextLine());
		} catch (Exception e) {
		    System.out.println("점수는 정수로 입력해주세요");
		    continue;
		}
		if (intKor < 0 || intKor > 100) {
		    System.out.println("점수는 0 ~ 100점 사이로 입력해주세요");
		} else {
		    break;
		}
	    }

	    int intEng = 0;
	    while (true) {
		System.out.print("영어 점수를 입력하세요 >> ");

		try {
		    intEng = Integer.valueOf(scan.nextLine());
		} catch (Exception e) {
		    System.out.println("점수는 정수로 입력해주세요");
		    continue;
		}
		if (intEng < 0 || intEng > 100) {
		    System.out.println("점수는 0 ~ 100점 사이로 입력해주세요");
		} else {
		    break;
		}
	    }

	    int intMath = 0;
	    while (true) {
		System.out.print("수학 점수를 입력하세요 >> ");

		try {
		    intMath = Integer.valueOf(scan.nextLine());
		} catch (Exception e) {
		    System.out.println("점수는 정수로 입력해주세요");
		    continue;
		}
		if (intMath < 0 || intMath > 100) {
		    System.out.println("점수는 0 ~ 100점 사이로 입력해주세요");
		} else {
		    break;
		}
	    }

	    int intMusic = 0;
	    while (true) {
		System.out.print("음악 점수를 입력하세요 >> ");

		try {
		    intMusic = Integer.valueOf(scan.nextLine());
		} catch (Exception e) {
		    System.out.println("점수는 정수로 입력해주세요");
		    continue;
		}
		if (intMusic < 0 || intMusic > 100) {
		    System.out.println("점수는 0 ~ 100점 사이로 입력해주세요");
		} else {
		    break;
		}
	    }

	    ScoreVO scoreVO = new ScoreVO();
	    scoreVO.setStudentID(studentID);
	    scoreVO.setIntKor(intKor);
	    scoreVO.setIntEng(intEng);
	    scoreVO.setIntMath(intMath);
	    scoreVO.setIntMusic(intMusic);
	    scoreList.add(scoreVO);

	    System.out.println(studentID + " 학생 성적 입력 완료");
	}
    }

    public void makeScoreToFile() {

	FileWriter fileWriter = null;
	PrintWriter printer = null;

	try {
	    fileWriter = new FileWriter(fileName);
	    printer = new PrintWriter(fileWriter);

	    int listSize = scoreList.size();
	    for (int i = 0; i < listSize; i++) {

		ScoreVO score = scoreList.get(i);

		printer.printf("%s:%d:%d:%d:%d\n", score.getStudentID(), 
			score.getIntKor(), score.getIntEng(),
			score.getIntMath(), score.getIntMusic());
	    }

	    printer.close();
	    fileWriter.close();

	    System.out.println("학생 성적을 파일에 성공적으로 저장하였습니다\n");

	} catch (IOException e) {
	    System.out.println("파일에 성적을 입력하는 도중 문제가 발생했습니다");
	    return;
	}
    }

    public ScoreVO makeScoreAvgTotal(ScoreVO score) {

	int scoreSum = 0;

	scoreSum = score.getIntKor();
	scoreSum += score.getIntEng();
	scoreSum += score.getIntMath();
	scoreSum += score.getIntMusic();

	score.setScoreSum(scoreSum);
	score.setScoreAvg((float) scoreSum / Values.MAX_SUBJECT);
	return score;
    }

    public void printScoreList() {

	FileReader fileReader = null;
	BufferedReader buffer = null;

	printHeader();

	try {
	    fileReader = new FileReader(fileName);
	    buffer = new BufferedReader(fileReader);

	    int[] subjectScoreSum = new int[4];
	    int allScoreSum = 0;
	    float avgScoreSum = 0;
	    int listSize = 0;
	    while (true) {

		String strLine = buffer.readLine();
		if (strLine == null) {
		    break;
		}
		listSize++;
		String[] scoreArr = strLine.split(":");
		ScoreVO score = new ScoreVO();

		score.setStudentID(scoreArr[0]);
		score.setIntKor(Integer.valueOf(scoreArr[1]));
		score.setIntEng(Integer.valueOf(scoreArr[2]));
		score.setIntMath(Integer.valueOf(scoreArr[3]));
		score.setIntMusic(Integer.valueOf(scoreArr[4]));

		makeScoreAvgTotal(score);

		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%3.2f\n", 
			score.getStudentID(), score.getIntKor(),
			score.getIntEng(), score.getIntMath(), 
			score.getIntMusic(), score.getScoreSum(),
			score.getScoreAvg());

		subjectScoreSum[0] += score.getIntKor();
		subjectScoreSum[1] += score.getIntEng();
		subjectScoreSum[2] += score.getIntMath();
		subjectScoreSum[3] += score.getIntMusic();

		allScoreSum += score.getScoreSum();
		avgScoreSum += score.getScoreAvg();
	    }

	    System.out.println(Values.sLine(Values.LINE_LENGTH));
	    System.out.printf("총점:\t%d\t%d\t%d\t%d\t%d\n", 
		    subjectScoreSum[0], 
		    subjectScoreSum[1], 
		    subjectScoreSum[2],
		    subjectScoreSum[3], 
		    allScoreSum);
	    System.out.printf("평균:\t%3.2f\t%3.2f\t%3.2f\t%3.2f\t\t%3.2f\n", 
		    (float) subjectScoreSum[0] / listSize,
		    (float) subjectScoreSum[1] / listSize, 
		    (float) subjectScoreSum[2] / listSize,
		    (float) subjectScoreSum[3] / listSize, 
		    (float) avgScoreSum / listSize);
	    System.out.println(Values.dLine(Values.LINE_LENGTH) + "\n");

	    buffer.close();
	    fileReader.close();

	} catch (FileNotFoundException e) {
	    System.out.println("파일을 찾지 못했습니다");
	    return;
	} catch (IOException e) {
	    System.out.println("파일을 읽는 도중 문제가 발생했습니다");
	    return;
	}

    }

    public void printHeader() {
	System.out.println("\n" + Values.dLine(Values.LINE_LENGTH));
	System.out.println("성적일람표");
	System.out.println(Values.dLine(Values.LINE_LENGTH));
	System.out.println("학번\t국어\t영어\t수학\t음악\t총점\t평균");
	System.out.println(Values.sLine(Values.LINE_LENGTH));
    }

}
