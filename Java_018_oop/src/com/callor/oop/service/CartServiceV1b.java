package com.callor.oop.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;

/* Service class
 * main() method에서 구현한 코드들을 별도의 클래스로 분리하고
 * 작은 method 단위로 코드를 작성하여 전체적으로 단위 코드가
 * 작아지도록 하기 위한 작성법

 * 이후에 유지보수(업그레이드, 디버그)를 유리하게 하기 위한 방법 */
public class CartServiceV1b {

	// inputCart() method에서 계속 사용할 Scanner를 인스턴스 영역으로 이동
	// 인스턴스 영역에 선언된 객체들은 특별한 경우가 아니면 private로 선언한다
	private Scanner scan = new Scanner(System.in);
	private List<CartVO> cartList = new ArrayList<CartVO>();

	// 사용자로부터 키보드로 상품정보를 입력받아 카트 리스트에 추가하는 코드
	public void inputCart() {

		/* Scanner, File, Network 이러한 클래스들은 운영체제와 연동하여
		 * 컴퓨터 자체의 자원(Resource)를 사용하게 된다
		 
		 * 자원은 유한하므로 선언을 한 뒤 사용이 끝나면 반납(close) 해줘야
		 * Application이 실행되는 과정에서 자원의 누수(leak)가 발생하지 않는다
		
		 * 여기(inputCart() method)는 사용 방법에 따라 수회 반복적으로
		 * 호출 되는 동안 스캐너가 연결되고 끊어지는 과정이 반복된다
		 * Resource를 열고 닫는 과정은 실제 컴퓨터, 운영체제, 어플리케이션
		 * 입장에서는 상당히 많은 일을 수행해야 한다 이러한 과정은
		 * 어플리케이션의 성능을 저하시키는 중대한 원인이 될 수 있다
		
		 * Scanner를 method() 내부에 선언하지 않고 인스턴스 영역으로 보낸다 */
		//		Scanner scan = new Scanner(System.in);

		System.out.println("┌───────────────────────────────────┐");
		System.out.println("│       쇼핑몰 장바구니 관리        │");
		System.out.println("└───────────────────────────────────┘");
		System.out.println("구매자 이름 입력");

		String strName = scan.nextLine();

	}

	public void printCart() {

	}
}