package com.callor.shop.service.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.shop.model.CartVO;
import com.callor.shop.service.CartServiceV2;

// CartServiceImplV1을 extends(확장), 상속 받아 V2를 생성
public class CartServiceImplV2 extends CartServiceImplV1 implements CartServiceV2 {
	
	// CartServiceImplV2는 인스턴스 객체와 생성자만 있는 상태
	private final Scanner scan;
	private List<CartVO> cartList;
	private String cartFileName;
	
	public CartServiceImplV2() {
		scan = new Scanner(System.in);
		cartList = new ArrayList<CartVO>();
		cartFileName = "src/com/callor/shop/cartList.txt";
	}

	/* 데이터를 파일에 저장하기
	 * 1. 파일 이름(경로 포함)을 결정하고 파일을 생성한다
	 * 2. 모든 데이터를 문자열로 만들고 파일에 기록한다
	 * 3. 파일과의 연결을 정상적으로 종료한다 */ 
	// cartList에 저장된 상품리스트를 ".../cartList.txt 파일에 저장
	public void saveCartToFile() {
		// 데이터를 저장할 파일 생성하기 위해 FileWriter 객체 선언
		FileWriter fileWriter = null;
		
		/* FileWriter에 데이터를 전송하기 위해
		 * PrintWriter 클래스를 이용하여 객체 선언 */ 
		PrintWriter printer = null;
		
		/* FileWriter 객체를 생성하면서 데이터를 저장할 파일 정보를 전달
		 * 	──> 운영체제와 통신을 하여 파일을 저장할 준비를 한다.

		 * 이 때, 운영체제와 통신을 시작하는 아주 짧은 시간 동안 생성하고자
		 * 하는 파일의 각종 정보들에 문제가 발생하여 IOException이 발생할 수
		 * 있다. 아무리 코드를 잘 작성하여도 피할수 없는 예외발생이다.
		 * Java에서는 이처럼 도저히 완전하게 예외발생을 피할수 없는 경우는
		 * 코드를 "반드시" try 예외처리를 하도록 강제한다. 따라서 
		 * FileWriter 객체를 생성할 때는 반드시 try - catch문으로 묶어야 한다 */
		try {
//			printer = new PrintWriter(new FileWriter(cartFileName));
			fileWriter = new FileWriter(cartFileName);
			/* 여기까지 코드가 정상 수행되면 FileWriter는 System.in
			 * 처럼 파일과 Java 코드 간에 연결이 되는 통로를 형성한다

			 * FileWriter 객체를 전달하면서 PrintWriter 객체를 생성한다 */
			printer = new PrintWriter(fileWriter);
			printer.println("대한민국");
			printer.println("우리나라");
			printer.println("Republic of Korea");
			printer.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void loadCartFromFile() {
		
	}

	
	
}