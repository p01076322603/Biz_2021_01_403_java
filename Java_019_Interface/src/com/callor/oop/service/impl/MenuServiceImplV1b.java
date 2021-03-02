package com.callor.oop.service.impl;

import java.util.Scanner;

import com.callor.oop.service.MenuService;

public class MenuServiceImplV1b implements MenuService{

	private Scanner scan;

	public MenuServiceImplV1b() {
		scan = new Scanner(System.in);
	}

	public void selectMenu() {

		System.out.println("===================");
		System.out.println("Java Menu System V1");
		System.out.println("-------------------");
		System.out.println("1. 카트 추가");
		System.out.println("2. 카트 삭제");
		System.out.println("3. 카트 리스트");
		System.out.println("Q. 끝내기");
		System.out.println("-------------------");
		while (true) {

			System.out.print("선택 >> ");

			String strMenu = scan.nextLine();

			switch (strMenu) {
			case "1":
				System.out.println("카트 추가");
				break;
			case "2":
				System.out.println("카트 삭제");
				break;
			case "3":
				System.out.println("카트 리스트");
				break;
			case "Q": case "q":
				System.out.println("끝내기");
				break;
			}
		}
	}
}