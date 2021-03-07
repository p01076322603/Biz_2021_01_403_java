package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.values.Values;

public class ScoreServiceImplV1 implements ScoreService {

	String fileName;
	List<Integer> rndScore;
	List<ScoreVO> scoreList;

	public ScoreServiceImplV1() {
		/* 기본 생성자로 인스턴스가 초기화되면 기본으로 설정할 
		 * 파일경로를 매개변수로 다른 생성자 호출 */
		this("src/com/callor/score/score.txt"); 
	}
	
	public ScoreServiceImplV1(String fileName) {
		this.fileName = fileName;
		rndScore = new ArrayList<Integer>();
		scoreList = new ArrayList<ScoreVO>();
	}

	public void makeScore() {

		Random rnd = new Random();

		// 학생들의 점수를 난수로 생성 (학생 수 * 과목 수)
		int rndScoreSample = Values.STUDENT_COUNT * Values.SUBJECT_COUNT;
		for (int i = 0; i < rndScoreSample; i++) { 
			rndScore.add(rnd.nextInt(100) + 1);
		}
		
		System.out.println("학생 점수가 생성되었습니다\n");
	}

	public void saveScoreToFile() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			int printCount = 0;
			for (Integer rndNum : rndScore) { // 학생 점수를 파일에 저장

				printer.print(rndNum + ":");
				if (++printCount % Values.SUBJECT_COUNT == 0) {
					printer.println(); // 과목의 개수만큼 저장하고 줄바꿈
				}
			}
			printer.close();
			fileWriter.close();

			System.out.println("학생 점수를 파일에 저장하였습니다\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadScoreFromFile() {

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) { // 파일에서 학생 점수를 가져와 scoreList에 저장

				String strLine = buffer.readLine();
				if (strLine == null) break; // 파일에서 가져오는 값이 null이면 반복문 중단
				String[] strScore = strLine.split(":");

				ScoreVO scoreVO = new ScoreVO();
				// 파일에서 점수를 가져와 arrSubjectScores 배열에 저장
				for (int i = 0; i < Values.SUBJECT_COUNT; i++) {
				
					scoreVO.setSubjectScores(i, Integer.valueOf(strScore[i]));
				}
		
				// arrSubjectScores 점수 배열에 저장된 값을 각각 인스턴스변수에 저장
				scoreVO.subjectScoreInIt();
				scoreList.add(scoreVO);
			}
			buffer.close();
			fileReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		int listSize = scoreList.size();
		for (int i = 0; i < listSize; i++) {

			ScoreVO score = scoreList.get(i);
			int scoreSum = 0;
			int[] subjectScores = score.getSubjectScores();

			// 점수 배열에서 과목별 점수를 가져와 scoreSum에 전부 더한다
			for (int j = 0; j < Values.SUBJECT_COUNT; j++) {
				scoreSum += subjectScores[j];
			}

			score.setIntScoreSum(scoreSum);
			score.setFloatScoreAvg((float) scoreSum / Values.SUBJECT_COUNT);
		}

		printHeader(); // 이하 출력

		int scoreNumber = 0; 
		for (int i = 0; i < listSize; i++) {
		
			ScoreVO score = scoreList.get(i);
			int[] subjectScores = score.getSubjectScores();

			System.out.print(++scoreNumber + "\t");
			
			// 배열에서 점수를 가져와서 출력
			for (int j = 0; j < Values.SUBJECT_COUNT; j++) {
				System.out.print(subjectScores[j] + "\t");
			}
			
			System.out.print(score.getIntScoreSum() + "\t");
			System.out.printf("%3.2f\t\n", score.getFloatScoreAvg());
			// 평균을 소수점 두번째 자리까지 출력
		}

		System.out.println("=============================================================\n");
//		System.out.println("======================================================================\n");
	}

	private void printHeader() {
		System.out.println("\n=============================================================");
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
//		System.out.println("\n======================================================================");
//		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t체육\t총점\t평균");
//		System.out.println("----------------------------------------------------------------------");
	}

}