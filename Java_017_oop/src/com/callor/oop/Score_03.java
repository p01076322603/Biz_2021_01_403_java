package com.callor.oop;

import java.util.Scanner;

import com.callor.oop.model.ScoreVO;

public class Score_03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ScoreVO scoreVO = new ScoreVO();
		
		while (true) {
			System.out.println("국어점수를 입력하세요");
			System.out.print(">> ");
			String strKor = scan.nextLine();
			scoreVO.setIntKor(strKor);
			
			// intKor에 -1이 담겨있으면 다시 입력을 하도록 해야한다
			if(scoreVO.getIntKor() < 0) {
				System.out.println("국어점수 유효성 검사 실패");
				continue; 
				} 
			break;
		}
	
		while (true) {
			System.out.println("영어점수를 입력하세요");
			System.out.print(">> ");
			String strEng = scan.nextLine();
			scoreVO.setIntEng(strEng);
			
			// intKor에 -1이 담겨있으면 다시 입력을 하도록 해야한다
			if(scoreVO.getIntEng() < 0) {
				System.out.println("영어점수 유효성 검사 실패");
				continue; 
				}
			break;
		}
	}
}
