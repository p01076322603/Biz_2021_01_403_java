package com.callor.oop.controller;

import com.callor.oop.service.CartServiceV1b;

/* Controller class
 * web application 프로젝트를 수행할 때 처음 시작하는 시작점 클래스

 * Service 등 모듈 클래스를 객체로 선언하고
 * 모듈 클래스의 method들을 호출하는 일만 수행 */
public class CartControllerV5b {

	public static void main(String[] args) {
		
		CartServiceV1b csV1b = new CartServiceV1b();
		
		csV1b.inputCart();
		csV1b.printCart();
	}
}
