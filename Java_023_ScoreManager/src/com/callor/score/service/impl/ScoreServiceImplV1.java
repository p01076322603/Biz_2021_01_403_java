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
			for (Integer rndNum : rndScore) { // 학생 점수를 file에 저장

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

			while (true) { // 파일에서 학생 점수를 가져와 각각 과목 변수에 저장

				String strLine = buffer.readLine();
				if (strLine == null) break; // 파일에서 가져오는 값이 null이면 반복문 중단
				
				String[] strScore = strLine.split(":");

				ScoreVO scoreVO = new ScoreVO();
				scoreVO.setIntKor(Integer.valueOf(strScore[0]));
				scoreVO.setIntEng(Integer.valueOf(strScore[1]));
				scoreVO.setIntMath(Integer.valueOf(strScore[2]));
				scoreVO.setIntMusic(Integer.valueOf(strScore[3]));
				scoreVO.setIntHistory(Integer.valueOf(strScore[4]));
				scoreList.add(scoreVO);
			}
			buffer.close();
			fileReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		int scoreSum = 0;
		for (ScoreVO score : scoreList) { // 학생 점수의 합과 평균을 계산
		
			scoreSum = score.getIntKor()
					 + score.getIntEng()
					 + score.getIntMath()
					 + score.getIntMusic()
					 + score.getIntHistory();
			score.setIntScoreSum(scoreSum);
			score.setFloatScoreAvg((float) scoreSum / Values.SUBJECT_COUNT);
		}

		printHeader(); // 이하 출력

		int scoreNumber = 0;
		for (ScoreVO score : scoreList) {

			System.out.print(++scoreNumber + "\t");
			System.out.print(score.getIntKor() + "\t");
			System.out.print(score.getIntEng() + "\t");
			System.out.print(score.getIntMath() + "\t");
			System.out.print(score.getIntMusic() + "\t");
			System.out.print(score.getIntHistory() + "\t");
			System.out.print(score.getIntScoreSum() + "\t");
			System.out.printf("%3.2f\t\n", score.getFloatScoreAvg());
			// 평균을 소수점 두번째 자리까지 출력
		}

		System.out.println("=============================================================\n");
	}

	private void printHeader() {
		System.out.println("\n=============================================================");
		System.out.println("순번\t국어\t영어\t수학\t음악\t국사\t총점\t평균");
		System.out.println("-------------------------------------------------------------");
	}

}