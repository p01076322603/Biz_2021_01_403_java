package com.callor.oop.service;

/* project에서 interface를 만드는 이유
 * 1. 이후로 CartService** 클래스를 만들 때는 반드시
 * 	  CartService interface를 implements 하라 */
public interface CartService {

	public void inputCart();
	public void printCart();
}
