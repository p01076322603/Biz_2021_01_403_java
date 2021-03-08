package com.callor.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListService {

	List<String[]> ioList;

	public ListService() {
		ioList = new ArrayList<String[]>();
	}

	// 파일로부터 데이터를 입력받아 배열의 형태로 저장
	public void makeIoList() {

		String fileName = "src/매입매출데이터.txt";
		String[] listArr = {};
		String listLine = "";

		FileReader fileReader;
		BufferedReader buffer;

		try {

			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			while (true) { // 데이터를 한줄씩 받아 String[] 자료형의 ioList ArrayList에 저장

				listLine = buffer.readLine();
				if (listLine == null)
					break;
				listArr = listLine.split(",");

				ioList.add(listArr);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// ioList에 저장된 데이터를 가공해 출력
	public void printIoData() {

		String dLine = String.format("%0130d", 0).replaceAll("0", "=");
		
		System.out.println(dLine);
		System.out.println(" 거래일자\t\t\t   거래처명\t\t\t\t상품명\t\t\t    [매입금액│판매금액]");
		System.out.println(dLine);

		int listSize = ioList.size();
		int tempPrice = 0;
		for (int i = 0; i < listSize; i++) {
			
			String[] listArr = ioList.get(i);
										//   거래일자    거래처명     상품명
			System.out.printf("%s%30s%30s", listArr[0], listArr[5], listArr[4]);

			try {
				
				if (listArr[7].equals("1")) { // 매입금액 계산

					tempPrice = Integer.valueOf(listArr[8]) * Integer.valueOf(listArr[10]);
					listArr[8] = String.valueOf(tempPrice);
					listArr[9] = "0";

				} else if (listArr[7].equals("2")) { // 판매금액 계산

					tempPrice = Integer.valueOf(listArr[9]) * Integer.valueOf(listArr[10]);
					listArr[8] = "0";
					listArr[9] = String.valueOf(tempPrice);
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			}
													//	 매입금액    판매금액
			System.out.printf("\t\t\t[%s │ %s]" + "\n", listArr[8], listArr[9]);
		}

		System.out.println(dLine);
	}
}