package com.callor.oop.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.callor.oop.model.CartVO;
import com.callor.oop.service.CartService;

public class CartServiceImplV2 implements CartService {

	// 1. cartList와 scan 인스턴스 객체변수를 선언하고 생성 X
	/* 이렇게 하면 생성되지 않은 인스턴스 객체 변수의 method를
	 * 호출하는 코드에서 NullPointerException이 발생할 것이다

	 * 3. NullPointerException을 방지하기 위해 클래스 생성자
	 * 	  method에 객체 변수를 초기화 하는 코드를 추가해준다

	 * 즉, 인스턴스 객체 변수 선언 -> 생성자에서 객체 변수 초기화
	 * 이 과정으로 코드를 작성하는 이유는 java의 garbage collection
	 * : java GC (메모리 자동 관리)가 작동되는 과정에서 혹시 모를
	 * 메모리 누수(leak)를 방지하기 위한 조치

	 * java GC : 프로젝트가 실행되는 과정에서 사용이 끝났음에도
	 * 아직 메모리에 남아있는 변수, 객체 등을 자동으로 제거하여
	 * 메모리 누수를 없애고 관리하는 기능 */
	 
	
	private Scanner scan;
	private List<CartVO> cartList; // new ArrayList<cartVO>();

	/* Constructor : 생성자 method
	 * 클래스 이름과 대소문자까지 같은 method
	 * return type(void, int, String)이 없는 method
	
	 * 클래스를 객체로 선언하고, 초기화 할 때 사용하는 아래 코드에서
	 * CartServiceImplV2 csIV2 = new CartServiceImplV2();
	 * new CartServiceImplV2() 이 부분의 코드가 클래스의 
	 * 생성자를 호출하여 객체를 생성하는 부분이다
	
	 * 생성자 method는 특별한 경우가 아니면 클래스를 선언
	 * 할 때 자동으로 코드가 만들어지고 감춰진 상태로 존재한다 */
	public CartServiceImplV2() {
		// 2. 선언이 된 인스턴스 객체 변수를 클래스 생성자에서 초기화한다
		cartList = new ArrayList<CartVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void inputCart() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printCart() {
		// TODO Auto-generated method stub

	}

}
