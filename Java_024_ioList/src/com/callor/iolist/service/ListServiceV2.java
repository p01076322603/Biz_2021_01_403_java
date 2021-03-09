package com.callor.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.model.TradeVO;

public class ListServiceV2 {

	private List<TradeVO> tradeList;

	public ListServiceV2() {
		tradeList = new ArrayList<TradeVO>();
	}

	// 파일로부터 데이터를 입력받아 TradeVO에 넣고 tradeList에 저장
	public void maketradeList() {

		FileReader fileReader;
		BufferedReader buffer;

		String fileName = "src/매입매출데이터.txt";

		try {

			fileReader = new FileReader(fileName);
			buffer = new BufferedReader(fileReader);

			// 데이터를 한줄씩 가져와 TradeVO에 넣고 tradeList에 저장
			while (true) {

				String listLine = buffer.readLine();
				if (listLine == null)
					break;
				String[] listArr = listLine.split(",");

				TradeVO listVO = new TradeVO();
				
				listVO.setTradeDate(listArr[0]);
				listVO.setTraderName(listArr[5]);
				listVO.setProductName(listArr[4]);

				listVO.setTradeType(Integer.valueOf(listArr[7]));
				listVO.setBuyPrice(Integer.valueOf(listArr[8]));
				listVO.setSellPrice(Integer.valueOf(listArr[9]));
				listVO.setTradeAmount(Integer.valueOf(listArr[10]));

				tradeList.add(listVO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printTradeList() {

		String dLine = String.format("%0130d", 0).replaceAll("0", "="); // ========================

		System.out.println(dLine);
		System.out.println(" 거래일자\t\t\t   거래처명\t\t\t\t상품명\t\t\t    [매입금액│판매금액]");
		System.out.println(dLine);

		int intTempPrice = 0;
		int listSize = tradeList.size();
		for (int i = 0; i < listSize; i++) {

			TradeVO tradeVO = tradeList.get(i);

			System.out.printf("%s%30s%25s", 
					tradeVO.getTradeDate(), 
					tradeVO.getTraderName(), 
					tradeVO.getProductName());

			if (tradeVO.getTradeType() == 1) {
				intTempPrice = tradeVO.getBuyPrice() * tradeVO.getTradeAmount();

				System.out.printf("\t\t\t[%s │ %d]" + "\n", intTempPrice, 0);

			} else if (tradeVO.getTradeType() == 2) {
				intTempPrice = tradeVO.getSellPrice() * tradeVO.getTradeAmount();

				System.out.printf("\t\t\t[%s │ %d]" + "\n", 0, intTempPrice);
			}
		}
		System.out.println(dLine);
	}
}
