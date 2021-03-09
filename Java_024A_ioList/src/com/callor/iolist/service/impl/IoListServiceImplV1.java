package com.callor.iolist.service.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.callor.iolist.values.ValIoList;
import com.callor.iolist.values.Values;
import com.callor.iolist.model.IoListVO;
import com.callor.iolist.service.IoListService;

public class IoListServiceImplV1 implements IoListService {

    private List<IoListVO> ioList;

    public IoListServiceImplV1() {
	ioList = new ArrayList<IoListVO>();
    }

    public void loadDataFromFile() {
	// TODO 데이터파일 읽어오기
	String fileName = "src/매입매출데이터.txt";

	FileReader fileReader = null;
	BufferedReader buffer = null;

	try {
	    fileReader = new FileReader(fileName);
	    buffer = new BufferedReader(fileReader);

	    // buffer에 읽어들인 txt 파일데이터에서 한줄씩 가져와 처리하기
	    while (true) {
		// buffer에서 한줄 데이터를 읽어 reader 변수에 저장
		String reader = buffer.readLine();

		/*
		 * EOF(End of File, 파일을 모두 읽었는지)검사 EOF에 다다르면 buffer는 null값을 return하고 reader 변수에는
		 * null값이 담겨있게 된다. 만약 reader 변수에 null값이 담겨있으면 반복문을 끝내라
		 */
		if (reader == null) {
		    break;
		}

		/*
		 * reader 변수에 담긴 문자열을 연산하기 문자열을 구분자로 나누어 분해한 후 IoListVO 객체에 담고 List<IoListVO>
		 * 리스트에 추가해둔다
		 * 
		 * 분해한 결과는 문자열 배열 형태이므로 문자열 배열을 선언하여 저장해둔다
		 */
		String[] ioDatas = reader.split(",");

		/*
		 * 필드생성자를 사용하여 IoListVO객체를 생성하면서 인스턴스변수에 값 담기
		 */

		IoListVO ioListVO = new IoListVO(ioDatas[
		                                         ValIoList.IO_DATE], // 거래일자
			ioDatas[ValIoList.IO_PNAME], // 상품명
			ioDatas[ValIoList.IO_DEPT], // 거래처명
			Integer.valueOf(ioDatas[ValIoList.IO_INOUT]), // 구분
			Integer.valueOf(ioDatas[ValIoList.IO_IPRICE]), // 매입단가
			Integer.valueOf(ioDatas[ValIoList.IO_OPRICE]), // 판매단가
			Integer.valueOf(ioDatas[ValIoList.IO_QTY]) // 수량
		);

		ioList.add(ioListVO);
	    }

	    buffer.close();
	    fileReader.close();

	} catch (IOException e) {
	    System.out.println("파일을 읽는 도중 문제 발생");
	}
    }

    public void ioListSum() {
	// TODO 구분값에 따라 매입금액, 판매금액 계산하기
	for (IoListVO vo : ioList) {

	    // 매입금액, 판매금액을 담을 변수를 0으로 생성
	    int iPrice = 0;
	    int oPrice = 0;

	    /*
	     * 구분값에 따라 iPrice 또는 oPrice만 계산하면 계산하지 않은 변수는 0으로 계속 유지
	     */
	    int inout = vo.getIoInout();
	    if (inout == 1) { // 구분이 매입일경우
		iPrice = vo.getIoIPrice() * vo.getIoQty();
	    } else if (inout == 2) {
		oPrice = vo.getIoOPrice() * vo.getIoQty();
	    }

	    // 매입금액, 판매금액을 vo에 담기
	    vo.setIoITotal(iPrice);
	    vo.setIoOTotal(oPrice);
	}
    }

    public void printIoList() {
	// TODO 매입매출 리스트 출력
	System.out.println("** Loo9 매입매출 명세서 **");
	System.out.println(Values.dLine(50));
	System.out.println("거래일자\t거래처명\t상품명\t매입금액\t판매금액");
	System.out.println(Values.sLine(50));

	int nCount = 0;
	int nITotal = 0;
	int nOTotal = 0;

	// int형 배열을 선언함과 동시에 각 요소가 0으로 초기화 된다
	int[] arrTotal = new int[2];
	for (IoListVO vo : ioList) {
	    System.out.print(vo.getIoDate() + "\t");
	    System.out.print(vo.getIoDept() + "\t");
	    System.out.print(vo.getIoPName() + "\t");
	    System.out.printf("%5d\t", vo.getIoITotal());
	    System.out.printf("%5d\n", vo.getIoOTotal());

	    nCount++;
	    nITotal += vo.getIoITotal();
	    nOTotal += vo.getIoOTotal();

	    arrTotal[0] += vo.getIoITotal();
	    arrTotal[1] += vo.getIoOTotal();
	}
	System.out.println(Values.sLine(50));
	System.out.printf("합계 : %3d건\t\t%3d\t%3d\n", nCount, nITotal, nOTotal);
	System.out.println(Values.dLine(50));
	System.out.printf("합계 : %3d건\t\t", nCount);

	for (int n : arrTotal) {
	    System.out.printf("%3d\t", n);
	}
	System.out.println();
    }

}
