package com.callor.iolist.service;

/* 파일을 읽어 ioList에 저장하기
 * ioList에 담긴 데이터를 구분(inInout)값을 기준으로
 * 매입금액과 판매금액을 계산하기
 * ioList에 담긴 데이터를 출력하기 */
public interface IoListService {

	public void loadDataFromFile();
	public void ioListSum();
	public void printIoList();
}
