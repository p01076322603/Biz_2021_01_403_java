package com.callor.score.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.callor.score.model.ScoreVO;
import com.callor.score.service.ScoreService;
import com.callor.score.service.values.Values;

/* Service 클래스 코드 순서
 *  1. 입력, 또는 자동 생성한 데이터를 담아둘 List 객체 선언 및 생성
 *  2. 데이터를 입력 또는 생성하여 Data에 담아두기 */

public class ScoreServiceImplV1 implements ScoreService {

	private String fileName;
	private List<ScoreVO> scoreList; // 객체 선언

	public ScoreServiceImplV1() {
		scoreList = new ArrayList<ScoreVO>();
		fileName = "src/com/callor/score/score.txt";
	}

	public void inputScore() {

		Scanner scan = new Scanner(System.in);
	}

	/* Random 클래스를 사용하여 점수 생성
	 * makeScore() 내에서만 사용하므로 메서드 내부에 지역변수로 생성한다 */
	public void makeScore() {
		// TODO 랜덤 성적표 저장

		/* makeScore()는 호출될때마다 20개씩 데이터를 생성하여 추가한다
		 * 이전에 저장된 데이터가 있더라도 계속 추가된다 */

		/* list.remove(index) ──> list의 index에 담긴 항목을 삭제
		 * list.removeAll(list) ──> list에 담긴 데이터 중 다른 리스트에 포함된
		 *						데이터들을 모두 삭제하라
		 * Removes from this list all of its elements that are contained in the specified collection (optional operation). 
		 * scoreList에 담긴 데이터들 중에서 자신의 데이터와 일치하는 값들 모두를 삭제하라 */

		scoreList.removeAll(scoreList);

		Random rnd = new Random();

		for (int i = 0; i < 20; i++) {
			ScoreVO scoreVO = new ScoreVO();

			// i 값에 따라 00001 ~ 00020 문자열을 생성해 strNum에 저장
			String strNum = String.format("2021%03d", i + 1);
			scoreVO.setStNum(strNum);

			scoreVO.setKor(rnd.nextInt(100) + 1);

			int intEng = rnd.nextInt(100) + 1;
			scoreVO.setEng(intEng);

			int intMath = rnd.nextInt(100) + 1;
			scoreVO.setMath(intMath);

			int intMusic = rnd.nextInt(100) + 1;
			scoreVO.setMusic(intMusic);

			int intHistory = rnd.nextInt(100) + 1;
			scoreVO.setHistory(intHistory);

			scoreList.add(scoreVO);
		} // end for

		// 검사코드
		//		for(ScoreVO score : scoreList) {
		//			System.out.println(score);
		// 재정의된 toString() 호출
		//		}

	}

	public void saveScoreToFile() {

		/* 객체이름 명명
		 * 클래스이름의 첫글자를 소문자로 하여 클래스 이름을 모두 사용한다 */
		FileWriter fileWriter = null;
		PrintWriter printer = null;

		try {
			fileWriter = new FileWriter(fileName);
			printer = new PrintWriter(fileWriter);

			// scoreList에 담긴 데이터를 file로 출력
			for (ScoreVO score : scoreList) {
				printer.print(score.getStNum() + ":");
				printer.print(score.getKor() + ":");
				printer.print(score.getEng() + ":");
				printer.print(score.getMath() + ":");
				printer.print(score.getMusic() + ":");
				printer.print(score.getHistory() + "\n");
			}

			printer.close();
			fileWriter.close();

			System.out.println("파일 저장 성공");

		} catch (IOException e) {
			//			e.printStackTrace();
			System.out.println("파일 생성 중 문제 발생");
		}

	}

	/* 성적이 저장되어 있는 score.txt 파일을 읽어서
	 * 성적 정보를 scoreList에 담기 */
	public void loadScoreFromFile() {

		/* 기존에 저장되어 있던 리스트를 모두 제거하자
		 * scoreList = new ArrayList<ScoreVO>() */
		scoreList.removeAll(scoreList);

		FileReader fileReader;
		BufferedReader buffer;

		try {
			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) {
				String reader = buffer.readLine();
				if (reader == null)
					break;

				// 읽어들인 문자열을 : 기준으로 잘라서 배열 생성
				String[] scores = reader.split(":");
				/* 필드생성자를 호출하여 인스턴스에 저장할 값을 전달하면서
				 * 동시에 객체를 초기화 (생성) */

				ScoreVO score = new ScoreVO(scores[0], // stNum
						Integer.valueOf(scores[1]), // kor
						Integer.valueOf(scores[2]), // eng
						Integer.valueOf(scores[3]), // math
						Integer.valueOf(scores[4]), // music
						Integer.valueOf(scores[5]) // history
				);
				scoreList.add(score);
			}
			buffer.close();
			fileReader.close();

		} catch (IOException e) {
			System.out.println("파일을 읽는 동안 문제 발생");
			//			e.printStackTrace();
		}

		//		this.printScore();
	}

	private void totalAndAvg() {

		for (ScoreVO score : scoreList) {
			int sum = score.getKor();
			sum += score.getEng();
			sum += score.getMath();
			sum += score.getMusic();
			sum += score.getHistory();

			float avg = (float) sum / 5;

			score.setTotal(sum);
			score.setAvg(avg);
		}
	}

	// 순위 매기기
	private void rankSet() {

		// list를 내림차순 정렬
		int nSize = scoreList.size();

		for (int i = 0; i < nSize; i++) {
			for (int j = i + 1; j < nSize; j++) {
				if (scoreList.get(i).getTotal() < scoreList.get(j).getTotal()) {
					ScoreVO tVO = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, tVO);
				}
			}
		}

		for (int i = 0; i < nSize; i++) {
			scoreList.get(i).setRank(i + 1);
		}

/*		// 학번을 숫자로 변경한 후 정렬
		for (int i = 0; i < nSize; i++) {
			for (int j = i + 1; j < nSize; j++) {

				int num1 = Integer.valueOf(scoreList.get(i).getStNum());
				int num2 = Integer.valueOf(scoreList.get(j).getStNum());

				if (num1 > num2) {
					ScoreVO temp = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, temp);
				}
			}
		}
*/
	
		// 문자열 비교 method를 사용하여 정렬
		for (int i = 0; i < nSize; i++) {
			for (int j = i + 1; j < nSize; j++) {
				
				ScoreVO voI = scoreList.get(i);
				ScoreVO voJ = scoreList.get(j);
				
				// voI의 학번이 뒷번호인경우
				if (voI.getStNum().compareTo(voJ.getStNum()) > 0) {

					ScoreVO tVo = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, tVo);
				}
			}
		}
	}

	public void printScore() {

		this.totalAndAvg();
		rankSet();

		System.out.println(Values.dLine);
		System.out.println("빛나라 고교 성적처리 시스템");
		System.out.println(Values.dLine);
		System.out.println("학번\t국어\t영어\t수학\t" + "음악\t국사\t총점\t평균\t석차");
		System.out.println(Values.sLine);

		for (ScoreVO score : scoreList) {
			System.out.print(score.getStNum() + "\t");
			System.out.print(score.getKor() + "\t");
			System.out.print(score.getEng() + "\t");
			System.out.print(score.getMath() + "\t");
			System.out.print(score.getMusic() + "\t");
			System.out.print(score.getHistory() + "\t");

			System.out.print(score.getTotal() + "\t");
			System.out.printf("%3.2f\t", score.getAvg());

			System.out.print(score.getRank() + "\n");
		}
		System.out.println(Values.dLine);

	}

}
