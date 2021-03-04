package com.callor.shop.service;

public interface CartService {

	public void inputCart();     // 시스템에서 사용
	public void printAllCart();  // 관리자 용도
	public void printUserCart(); // 일반사용자 용도
}
