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

public class ScoreServiceImplV1 implements ScoreService {

	List<ScoreVO> strLines;
	List<Integer> rndList;
	String fileName;
	
	public ScoreServiceImplV1() {
	}
	
	public ScoreServiceImplV1(String fileName) {
		strLines = new ArrayList<ScoreVO>();
		rndList = new ArrayList<Integer>();
		this.fileName = fileName;
	}
	
	public void makeScore() {
		
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			rndList.add(rnd.nextInt(100) + 1);
		}
	}

	public void saveScoreToFile() {

		FileWriter fileWriter = null;
		PrintWriter printer = null;
		
		try {
			fileWriter = new FileWriter(this.fileName);
			printer = new PrintWriter(fileWriter);
			
			int printCount = 0;
			for (int rndNum : rndList) {
				
				printer.print(rndNum + ":");
				if (++printCount % 5 == 0) {
					printer.println();
				}
			}
			
			printer.close();
			fileWriter.close();
			
			System.out.println("파일 저장 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadScoreFromFile() {
		
		FileReader fileReader;
		BufferedReader buffer;
		
		try {
			fileReader = new FileReader(this.fileName);
			buffer = new BufferedReader(fileReader);
			
			String str = "";
			String[] strArr = {};
			
			while (true) {
				
				ScoreVO scoreVO = new ScoreVO();
				
				str = buffer.readLine();
				strArr = str.split(":");
				
				scoreVO.setIntKor(Integer.valueOf(strArr[0]));
				scoreVO.setIntEng(Integer.valueOf(strArr[1]));
				scoreVO.setIntMath(Integer.valueOf(strArr[2]));
				scoreVO.setIntMusic(Integer.valueOf(strArr[3]));
				scoreVO.setIntHistory(Integer.valueOf(strArr[4]));
				
				
				
			}
			
			buffer.close();
			fileReader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

	
